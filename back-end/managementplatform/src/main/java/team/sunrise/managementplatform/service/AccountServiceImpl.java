package team.sunrise.managementplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;
import team.sunrise.managementplatform.mapper.UserLoginMapper;
import team.sunrise.managementplatform.service.loginMethod.LoginMethodFactory;

/**
 * @author ZHANGKAIHENG
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    UserIdentifyMapper userIdentifyMapper;
    @Autowired
    UserLoginMapper userLoginMapper;

    @Override
    public UserIdentityData identifyUser(String key, String loginMethod) {
        LoginMethodFactory loginMethodFactory = new LoginMethodFactory();
        return loginMethodFactory.executeMethod(userIdentifyMapper, loginMethod, key);
    }

    @Override
    public UserLoginData getUserData(String password) {
        return userLoginMapper.selectByPwd(password);
    }
}
