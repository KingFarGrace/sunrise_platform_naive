package team.sunrise.managementplatform.service.loginMethod;

import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.mapper.UserIdentifyMapper;

/**
 * @author ZHANGKAIHENG
 */
public interface LoginMethod {
    /**
     * <pre>
     *     Interface of all {@code LoginMethod} products, realize multiple login method.
     * </pre>
     * @param userIdentifyMapper is a mapper will be injected in {@code AccountService}
     * @param key will be used in sql query
     * @return {@code UserIdentifyData} instance if not {@code null}
     * @see team.sunrise.managementplatform.service.AccountServiceImpl
     */
    public UserIdentityData query(UserIdentifyMapper userIdentifyMapper, String key);
}
