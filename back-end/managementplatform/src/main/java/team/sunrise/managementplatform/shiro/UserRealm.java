package team.sunrise.managementplatform.shiro;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import team.sunrise.managementplatform.entity.UserIdentityData;
import team.sunrise.managementplatform.service.AccountService;

/**
 * <p>
 *     Custom realm
 * </p>
 * @author ZHANGKAIHENG
 */
public class UserRealm extends AuthorizingRealm {
    @Autowired
    AccountService accountService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("execute ==> Authorization");
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        // TODO add permissions
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // TODO encrypt password
        System.out.println("execute ==> Authentication");
        UserToken token = (UserToken) authenticationToken;
        UserIdentityData user = accountService.identifyUser(token.getUsername(), token.getLoginMethodName());
        if(user == null) {
            return null;
        }
        return new SimpleAuthenticationInfo(user, user.getPassword(), this.getName());
    }

    /**
     * 使Realm识别自定义token
     * @param token
     * @return
     * @see UserToken
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token != null && token instanceof UserToken;
    }
}
