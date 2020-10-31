package team.sunrise.managementplatform.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;
import team.sunrise.managementplatform.entity.response.AccountResponse;
import team.sunrise.managementplatform.entity.response.Response;
import team.sunrise.managementplatform.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {
    private final AccountService accountService;

    AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("login")
    Response login(@RequestBody UserInputData data) {
        //TODO More type of return code to be defined...
        UserLoginData userLoginData = accountService.login(data);
        if (userLoginData != null) {
            return new AccountResponse(0, "login success", userLoginData);
        }
        return new AccountResponse(1, "login failed", null);
    }
}
