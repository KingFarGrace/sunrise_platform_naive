package team.sunrise.managementplatform.entity;

import java.util.Objects;

/**
 * @author ZHANGKAIHENG
 */
public class UserInputData {
    private String key;
    private String password;
    private String loginMethod;

    public UserInputData() {}

    public UserInputData(String key, String password, String loginMethod) {
        this.key = key;
        this.password = password;
        this.loginMethod = loginMethod;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLoginMethod() {
        return loginMethod;
    }

    public void setLoginMethod(String loginMethod) {
        this.loginMethod = loginMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInputData that = (UserInputData) o;
        return Objects.equals(key, that.key) &&
                Objects.equals(password, that.password) &&
                Objects.equals(loginMethod, that.loginMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, password, loginMethod);
    }
}
