package bid.woou.bwouo.system.security;

import org.springframework.security.core.GrantedAuthority;

/**
 * @Author: zwoou
 * @Date: 2018/3/26
 */
public class MyGrantedAuthority implements GrantedAuthority {
    private String url;
    private String method;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public MyGrantedAuthority(String url, String method) {
        this.url = url;
        this.method = method;
    }

    @Override
    public String getAuthority() {
        return this.url + ";" + this.method;
    }
}
