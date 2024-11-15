package api;

import java.util.HashMap;
import java.util.Map;

    public class HeadersContentTypeAndHardcodeToken {

        GetAccessToken getAccessToken = new GetAccessToken();

        public Map<String, String> headersContentTypeAndHardcodeToken(){
            Map<String, String> headersContentTypeAndTokenRequest = new HashMap<String, String>();
            headersContentTypeAndTokenRequest.put("content-type", "application/json");
            headersContentTypeAndTokenRequest.put("Authorization", "Bearer " + getAccessToken.getToken());
            return headersContentTypeAndTokenRequest;
        }

    }
