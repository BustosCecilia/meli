import com.google.gson.JsonElement;

public class standardResponse {

    private StatusResponse status;
    private String message;
    private JsonElement data;

    public standardResponse(){

    }

    public standardResponse(StatusResponse status){
        this.status = status;
    }

    public standardResponse(StatusResponse status, JsonElement data){
        this.status = status;
        this.data = data;
    }

    public standardResponse(StatusResponse status, String message){
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
