package team.sunrise.managementplatform.service;

import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;

public interface AccountService {
    UserLoginData login(UserInputData data);
}
