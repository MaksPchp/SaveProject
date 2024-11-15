package api;

import java.util.HashMap;
import java.util.Map;

public class HeadersContentTypeAndTokenAndLanguage {
    String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Map<String, String> headersContentTypeAndTokenAndLanguage(String language){
        this.language = language;
        GetAccessToken getAccessToken = new GetAccessToken();
        Map<String, String> headersContentTypeAndTokenAndLanguageRequest = new HashMap<String, String>();
        headersContentTypeAndTokenAndLanguageRequest.put("content-type", "application/json");
        headersContentTypeAndTokenAndLanguageRequest.put("Authorization", "Bearer " + getAccessToken.getToken());
        headersContentTypeAndTokenAndLanguageRequest.put("accept-language", language);
        return headersContentTypeAndTokenAndLanguageRequest;
    }

}