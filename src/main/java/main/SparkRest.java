package main;

import com.google.gson.Gson;
import enums.StatusResponse;
import integrante.Integrante;
import integrante.IntegranteService;
import integrante.IntegranteServiceMapImpl;
import standarResponse.StandardResponse;

import static spark.Spark.*;

public class SparkRest {

    public static void main(String[] args) {

        //port(8080); //Ver que no este bloqueado por firewall o en uso.
        final IntegranteService integranteService = new IntegranteServiceMapImpl();

        // Crear un integrante.
        post("/integrante/", (request, response) -> {
            response.type("application/json");
            Integrante integrante = new Gson().fromJson(request.body(), Integrante.class);
            integranteService.addIntegrante(integrante);
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS));
        });

        //
        get("/integrante/", ((request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                    new Gson().toJsonTree(integranteService.getIntegrantes())));
        }));

        get("/integrante/:id", ((request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                    new Gson().toJsonTree(integranteService.getIntegrante(request.params(":id")))));
        }));

        put("/integrante", (request, response) -> { // meter esto en un try catch
            response.type("application/json");
            Integrante integrante = new Gson().fromJson(response.body(), Integrante.class);
            Integrante integranteEditado = integranteService.modifyIntegrante(integrante);
            if(integranteEditado != null){
                return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                        new Gson().toJsonTree(integranteEditado)));
            }
            else {
                return new Gson().toJson(new StandardResponse(StatusResponse.ERROR,
                        "Error al editar el integrante."));
            }
        });

        delete("/integrante/:id", ((request, response) -> {
            response.type("application/json");
            integranteService.deleteIntegrante(request.params(":id"));
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,"integrante.Integrante borrado."));
        }));

        options("/integrante/:id", ((request, response) -> {
            response.type("application/json");
            return new Gson().toJson(new StandardResponse(StatusResponse.SUCCESS,
                    (integranteService.existIntegrante(request.params(":id")) ?
                    "El integrante existe." :
                    "El integrante no existe")));
        }));
    }
}
