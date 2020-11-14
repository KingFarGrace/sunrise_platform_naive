package team.sunrise.managementplatform.entity.response;

import team.sunrise.managementplatform.entity.UserLoginData;

/**
 * @author SilentWolf1997
 */
public class AccountResponse extends Response {
    private UserLoginData userLoginData = null;

    @Override
    protected int groupCode() {
        return 1;
    }

    public AccountResponse() {}

    public AccountResponse(int code, String message, UserLoginData userLoginData) {
        super(code, message);
        this.userLoginData = userLoginData;
    }
}
