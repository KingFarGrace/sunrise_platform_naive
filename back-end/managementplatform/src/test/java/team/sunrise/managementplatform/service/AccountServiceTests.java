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
        System.out.println(accountService.identifyUser("120181080602", "uid"));
        System.out.println(accountService.identifyUser("ZHANG", "username"));
        System.out.println(accountService.identifyUser("15611311841", "telephone"));
        System.out.println(accountService.identifyUser("1136421682@qq.com", "mail"));
    }
}
