package main;
import Agencia.Agencia;
import com.google.gson.Gson;
import enums.StatusResponse;
import standarResponse.StandardResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

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
                System.out.println(url);
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


                    System.out.println(url);
                    System.out.println("https://api.mercadolibre.com/sites/MLA/payment_methods/rapipago/agencies?near_to=-31.3364568," +
                            "-64.2046846,150000");
                    try {
                        String data = readUrl(url);
                       System.out.println(data);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }




                }
            }


            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                    "2000"));
        }));


    }

    /*
     leer url
    */
    /* quiero que me devuelva el resultado de una url */
    private static String readUrl(String urlString) throws IOException { //Malforme esta dentro

        BufferedReader reader = null;
        // me lo convierte en un objeto url
        try {
            URL url = new URL(urlString);
            URLConnection connection = url.openConnection();
            connection.setRequestProperty("Accept", "aplication/json");
            connection.setRequestProperty("User-Agent", "Mozill/5.0");
            reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
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



