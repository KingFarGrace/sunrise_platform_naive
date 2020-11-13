package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

public interface LoginMethod {
    public UserIdentityData query(UserIdentifyMapper userIdentifyMapper, String key);
}
