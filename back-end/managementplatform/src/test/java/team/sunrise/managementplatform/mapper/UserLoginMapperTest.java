package team.sunrise.managementplatform.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserLoginMapperTest {
    @Autowired
    UserLoginMapper userLoginMapper;

    @Test
    void TestMapper() {
        System.out.println(userLoginMapper.selectByPwd("123456"));
    }
}
