package cn.wolfcode.sso.vo;

/**
 * Created by wolfcode-lanxw
 */
public class ClientInfoVo {
    private String clientUrl;
    private String jsessionid;

    public String getClientUrl() {
        return clientUrl;
    }

    public void setClientUrl(String clientUrl) {
        this.clientUrl = clientUrl;
    }

    public String getJsessionid() {
        return jsessionid;
    }

    public void setJsessionid(String jsessionid) {
        this.jsessionid = jsessionid;
    }
}
