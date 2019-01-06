package adapter;

import org.json.JSONObject;

public class WebAdapter implements WebRequester {

    private WebService webService;

    public void connect(WebService webService) {
        this.webService = webService;
    }

    @Override
    public int request(Object object) {

        JSONObject request = toJson(object);
        JSONObject respond = webService.request(request);

        if (respond != null)
            return 200;

            return 500;
    }

    private JSONObject toJson(Object object) {

        if (object == null)
            return null;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("object",object);

        return jsonObject;
    }
}
