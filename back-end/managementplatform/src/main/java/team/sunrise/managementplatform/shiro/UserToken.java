package team.sunrise.managementplatform.shiro;

import org.apache.shiro.authc.AuthenticationToken;

public class UserToken implements AuthenticationToken {

    private String username;
    private String password;
    private String loginMethodName;

    public UserToken() {}

    public UserToken(String username, String password, String loginMethodName) {
        this.username = username;
        this.password = password;
        this.loginMethodName = loginMethodName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginMethodName() {
        return loginMethodName;
    }

    public void setLoginMethodName(String loginMethodName) {
        this.loginMethodName = loginMethodName;
    }

    @Override
    public Object getPrincipal() {
        return getUsername();
    }

    @Override
    public Object getCredentials() {
        return getPassword();
    }
}
