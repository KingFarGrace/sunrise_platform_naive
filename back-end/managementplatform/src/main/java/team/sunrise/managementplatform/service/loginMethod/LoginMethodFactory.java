package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <pre>
 *     A singleton mode factory to produce {@code LoginMethod} as products.
 *     This class will be instantiated in {@code AccountServiceImpl}.
 * </pre>
 * @author ZHANGKAIHENG
 */
public class LoginMethodFactory {

    private Map<String, LoginMethod> methodMap;
    public static LoginMethodFactory loginMethodFactory;

    private LoginMethodFactory() {}

    /**
     * @return a instance of {@code LoginMethodFactory}
     */
    public static LoginMethodFactory getLoginMethodFactory() {
        if(loginMethodFactory == null) {
            loginMethodFactory = new LoginMethodFactory();
            loginMethodFactory.methodMap = new HashMap<>(4);
            loginMethodFactory.methodMap.put("uid", new LoginById());
            loginMethodFactory.methodMap.put("username", new LoginByName());
            loginMethodFactory.methodMap.put("telephone", new LoginByPhone());
            loginMethodFactory.methodMap.put("mail", new LoginByMail());
        }
        return loginMethodFactory;
    }

    /**
     * <pre>
     *     Factory use this method to produce {@code LoginMethod} as products.
     *     Divide the logic and explain:
     *     <code>
     *         methodMap.get(methodName) --> get instance of concrete LoginMethod
     *         concreteLoginMethod.query(userIdentifyMapper, key)
     *         --> query a concrete user in db by key, userIdentifyMapper provide proper select strategy
     *     </code>
     * </pre>
     * @param userIdentifyMapper is a mapper will be injected in {@code AccountService}
     * @param methodName ia a var to indicate a specific type of {@code LoginMethod}
     * @param key will be used in sql query
     * @return {@code UserIdentifyData} instance if not {@code null}
     * @see LoginMethod
     */
    public UserIdentityData executeMethod(UserIdentifyMapper userIdentifyMapper,String methodName, String key) {
        return methodMap.get(methodName).query(userIdentifyMapper, key);
    }
}
