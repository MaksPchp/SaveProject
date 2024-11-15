package api;

public class BodyRequestPostNumberTelephoneAutorization {

    int numberTelephone;

    public int getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(int numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public String numberTelephone(int numberTelephone){
        this.numberTelephone = numberTelephone;
        String requestMobilePhone = "{\"phone\":\"380"+ numberTelephone +"\"," +
                "\"device\":{\"type\":\"DT_Web_Browser\",\"application\":{\"type\":\"AT_SWEET_TV_Player\"},\"model\":" +
                "\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.82 Safari/537.36\"," +
                "\"firmware\":{\"versionCode\":1,\"versionString\":\"2.9.10\"},\"uuid\":\"7b9de461-0097-463a-a41d-c7cccc578be7\"," +
                "\"supported_drm\":{\"widevine_modular\":true}},\"locale\":\"uk\"}";
        return requestMobilePhone;
    }

}
