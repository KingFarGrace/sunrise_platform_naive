package team.sunrise.managementplatform.service;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;

public interface AccountService {
    UserIdentityData identifyUser(String key, String loginMethod);
    UserLoginData getUserData(String password);
}
