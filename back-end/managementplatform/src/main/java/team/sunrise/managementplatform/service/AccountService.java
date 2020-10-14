package team.sunrise.managementplatform.service;

import team.sunrise.managementplatform.entity.LoginData;

public interface AccountService {
    boolean login(LoginData data);
}
