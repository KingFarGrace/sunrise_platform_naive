package team.sunrise.managementplatform.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.response.AccountResponse;
import team.sunrise.managementplatform.entity.response.Response;
import team.sunrise.managementplatform.service.AccountService;
import team.sunrise.managementplatform.shiro.UserToken;

/**
 * @author ZHANGKAIHENG
 */
@RestController
@RequestMapping("/account")
public class AccountController {
    private final AccountService accountService;

    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/login")
    Response login(@RequestBody UserInputData data) {
        //TODO more return code to be defined
        Subject subject = SecurityUtils.getSubject();
        UserToken token = new UserToken(data.getKey(), data.getPassword(), data.getLoginMethod());
        try {
            subject.login(token);
        } catch (UnknownAccountException uae) {
            uae.printStackTrace();
            // no user matched，return code 101
            return new AccountResponse(1, "no user matched", null);
        } catch (IncorrectCredentialsException ice) {
            ice.printStackTrace();
            // wrong password，return code 102
            return new AccountResponse(2, "wrong password", null);
        }
        // 成功，return code 100
        return new AccountResponse(0, "success", accountService.getUserData(data.getPassword()));
    }
}
