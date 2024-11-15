package api;

import java.util.HashMap;
import java.util.Map;

public class HeadersContentType {

    public Map<String, String> headerContentType(){
        Map<String, String> requestContentType = new HashMap<String, String>();
        requestContentType.put("Content-Type", "application/json");
        return requestContentType;
    }

}
