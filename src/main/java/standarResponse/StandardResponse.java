package standarResponse;

import com.google.gson.JsonElement;
import enums.StatusResponse;

public class StandardResponse {
    private StatusResponse status;
    private String message;
    private JsonElement data;

    public StandardResponse(){

    }
    //
    public StandardResponse(StatusResponse status){
        this.status = status;
    }

    public StandardResponse(StatusResponse status, JsonElement data){
        this.status = status;
        this.data = data;
    }

    public StandardResponse(StatusResponse status, String message){
        this.status = status;
        this.message = message;
    }

    public StatusResponse getStatus() {
        return status;
    }

    public void setStatus(StatusResponse status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JsonElement getData() {
        return data;
    }

    public void setData(JsonElement data) {
        this.data = data;
    }
}
