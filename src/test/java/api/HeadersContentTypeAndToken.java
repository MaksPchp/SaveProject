package api;

import java.util.HashMap;
import java.util.Map;

public class HeadersContentTypeAndToken {
    String numberTelephone;

    public String getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(String numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public Map<String, String> headersContentTypeAndToken(String numberTelephone){
        this.numberTelephone = numberTelephone;
        GetToken getToken = new GetToken();
        Map<String, String> headersContentTypeAndTokenRequest = new HashMap<String, String>();
        headersContentTypeAndTokenRequest.put("content-type", "application/json");
        headersContentTypeAndTokenRequest.put("Authorization", "Bearer " + getToken.getToken(numberTelephone));
        return headersContentTypeAndTokenRequest;
    }

}
