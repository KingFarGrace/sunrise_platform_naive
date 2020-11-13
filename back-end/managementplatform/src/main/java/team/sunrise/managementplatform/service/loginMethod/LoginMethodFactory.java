package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

import java.util.HashMap;
import java.util.Map;

public class LoginMethodFactory {
    public UserIdentityData executeMethod(UserIdentifyMapper userIdentifyMapper,String methodName, String key) {
        Map<String, LoginMethod> methodMap = new HashMap<>();
        methodMap.put("uid", new LoginById());
        methodMap.put("username", new LoginByName());
        methodMap.put("telephone", new LoginByPhone());
        methodMap.put("mail", new LoginByEMail());
        return methodMap.get(methodName).query(userIdentifyMapper, key);
    }
}
