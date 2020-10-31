package team.sunrise.managementplatform.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import team.sunrise.managementplatform.entity.UserInputData;

@SpringBootTest
public class AccountServiceTests {
    @Autowired
    AccountService accountService;

    @Test
    void loginTest() {
        System.out.println(accountService.login(new UserInputData("120181080602", "", "", "", "123456")));
    }
}
