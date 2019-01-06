package adapter;

public class WebClient {

    private WebRequester webRequester;


    public WebClient(WebRequester requester){
        this.webRequester = requester;
    }


    public void doWork(){
        int result = webRequester.request(makeObject());

        System.out.println(result == 200
                ? "Connected" : "Connection Failed!");

    }




    public Object makeObject(){
        return null;
    }
}
