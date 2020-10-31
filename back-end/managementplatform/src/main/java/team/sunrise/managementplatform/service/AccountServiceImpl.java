package team.sunrise.managementplatform.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;
import team.sunrise.managementplatform.mapper.UserLoginMapper;

import java.util.Objects;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    UserLoginMapper userLoginMapper;

    @Override
    public UserLoginData login(UserInputData data) {
        // TODO: implement login
        UserLoginData userLoginData = userLoginMapper.selectByKey(data);
        if(Objects.equals(data.getPassword(), userLoginData.getPassword())){
            return userLoginData;
        } else {
            return null;
        }
    }
}
