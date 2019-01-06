package adapter;

import org.json.JSONObject;

public class WebService {


    public WebService(String host)
    {
        System.out.println("Service is Running on host: " + host);
    }

    public JSONObject request(JSONObject request) {
        if (request != null) {
            JSONObject respond = new JSONObject();
            respond.put("Result","now you can use my service");
            return respond;
        }
        return null;
    }
}
