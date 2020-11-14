package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

/**
 * <p>
 *     Use e-mail as query key to find a user.
 * </p>
 * @author ZHANGKAIHENG
 */
public class LoginByMail implements LoginMethod {
    @Override
    public UserIdentityData query(UserIdentifyMapper userIdentifyMapper, String key) {
        return userIdentifyMapper.selectByEmail(key);
    }
}
