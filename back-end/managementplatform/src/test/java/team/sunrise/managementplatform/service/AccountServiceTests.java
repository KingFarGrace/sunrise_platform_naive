package team.sunrise.managementplatform.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.sunrise.managementplatform.entity.LoginData;

@SpringBootTest
public class AccountServiceTests {
    @Autowired
    AccountService accountService;

    @Test
    void loginTest() {
        Assertions.assertTrue(accountService.login(new LoginData("admin", "123456")));
        Assertions.assertFalse(accountService.login(new LoginData("admin", "wrong_password")));
        Assertions.assertFalse(accountService.login(new LoginData("not_exist", "123456")));
        Assertions.assertFalse(accountService.login(new LoginData("", "")));
        Assertions.assertFalse(accountService.login(new LoginData()));
    }
}
