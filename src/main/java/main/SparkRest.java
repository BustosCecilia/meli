package main;
import Agencia.Agencia;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import enums.StatusResponse;
import standarResponse.StandardResponse;
import sun.jvm.hotspot.debugger.Address;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

import static spark.Spark.*;

public class SparkRest {

    public static void main(String[] args) {


        get("/agencia", ((request, response) -> {

            String site_id = request.queryParams("site_id");
            String payment_method_id = request.queryParams("payment_method_id");
            String near_to = request.queryParams("near_to");
            String limit = request.queryParams("limit");
            String offset = request.queryParams("offset");
            response.type("application/json");
            // seteo url
            String url = "https://api.mercadolibre.com/sites/";
            // me fijo si exiten los parametros
            if (site_id == null) {
                throw new MalformedURLException("El site_id es nulo!");
            }
            else{
                url=url+site_id+"/payment_methods/";
                if(payment_method_id==null){
                    throw new MalformedURLException("El payment_method_id es nulo");
                }
                else{
                    url=url+payment_method_id+"/agencies?";
                    if(near_to!=null){
                        url=url+"near_to="+near_to;
                        if(limit!=null){
                            url=url+"&limit="+limit;
                            if(offset!=null){
                                url="&offset="+offset;
                            }
                        }
                    }
                    // imprimo mi url formada
                    System.out.println("url es "+url);
                    try {
                        String data = readUrl(url);
                       System.out.println(data);
                       //Array de agencias
                        JsonParser jsonparser = new JsonParser();
                        JsonObject jsonObject = jsonparser.parse(data).getAsJsonObject();
                        Agencia[] agencias = new Gson().fromJson(jsonObject.get("results"), Agencia[].class);
                        System.out.println("Datos de Json Agencia");
                        //Array de Address
                        JsonParser jsonparser1 = new JsonParser();
                        JsonObject jsonObject1 = jsonparser1.parse(data).getAsJsonObject();
                        Address[] address = new Gson().fromJson(jsonObject1.get("results"), Address[].class);
                        System.out.println("Datos de Json Address");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }




                }
            }


            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                    "40000"));
        }));


    }

    /*
     leer url
    */
    /* quiero que me devuelva el resultado de una url */
    private static String readUrl(String urlString) throws IOException { //Malforme esta dentro
        URL url = new URL(urlString);
        BufferedReader reader = null;
        // me lo convierte en un objeto url
        try {

            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Accept", "application/json");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0");
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder buffer = new StringBuilder();
            char[] chars = new char[1024];
            int read = 0; // leo la cantidad de caracteres
            while ((read = reader.read(chars)) != -1) {
                buffer.append(chars, 0, read);
            }
            System.out.println(buffer.toString());
            return buffer.toString();
        }
        finally {
            if (reader != null) {
                reader.close();
            }
        }
    }
}




