package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

/**
 * <p>
 *     Use username as query key to find a user.
 * </p>
 * @author ZHANGKAIHENG
 */
public class LoginByName implements LoginMethod {
    @Override
    public UserIdentityData query(UserIdentifyMapper userIdentifyMapper, String key) {
        return userIdentifyMapper.selectByName(key);
    }
}
