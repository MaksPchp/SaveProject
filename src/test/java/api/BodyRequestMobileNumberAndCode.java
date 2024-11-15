package api;

public class BodyRequestMobileNumberAndCode {

    int numberTelephone;
    int code;

    public int getNumberTelephone() {
        return numberTelephone;
    }

    public void setNumberTelephone(int numberTelephone) {
        this.numberTelephone = numberTelephone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String numberTelephoneAndCode(int numberTelephone, int code){
        this.numberTelephone = numberTelephone;
        this.code = code;
        String requestMobilePhoneAndCode = "{" +
                "\"phone\":\"380"+ numberTelephone +"\"," +
                "\"confirmation_code\":\""+ code +"\"" +
                "}";
        return requestMobilePhoneAndCode;
    }

}
