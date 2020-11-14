package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ZHANGKAIHENG
 */
public class LoginMethodFactory {
    /**
     * <pre>
     *     A factory to produce {@code LoginMethod} as product.
     *     This class will be instantiated in {@code AccountServiceImpl}
     * </pre>
     * @param userIdentifyMapper is a mapper will be injected in {@code AccountService}
     * @param methodName ia a var to indicate a specific type of {@code LoginMethod}
     * @param key will be used in sql query
     * @return {@code UserIdentifyData} instance if not {@code null}
     * @see LoginMethod
     */
    public UserIdentityData executeMethod(UserIdentifyMapper userIdentifyMapper,String methodName, String key) {
        Map<String, LoginMethod> methodMap = new HashMap<>(4);
        methodMap.put("uid", new LoginById());
        methodMap.put("username", new LoginByName());
        methodMap.put("telephone", new LoginByPhone());
        methodMap.put("mail", new LoginByMail());
        return methodMap.get(methodName).query(userIdentifyMapper, key);
    }
}
