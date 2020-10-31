package team.sunrise.managementplatform.entity.response;

import team.sunrise.managementplatform.entity.UserLoginData;

public class AccountResponse extends Response {
    public static final Response ACCOUNT_LOGIN_SUCCESS = new AccountResponse(0, "login success");
    public static final Response ACCOUNT_LOGIN_WRONG_PASSWORD = new AccountResponse(1, "wrong password");
    public static UserLoginData userLoginData = null;

    @Override
    protected int groupCode() {
        return 1;
    }

    public AccountResponse() {}

    public AccountResponse(int code, String message) {
        super(code, message);
    }
}
