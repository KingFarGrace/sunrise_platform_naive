package team.sunrise.managementplatform.service;

import org.springframework.stereotype.Service;
import team.sunrise.managementplatform.entity.LoginData;

import java.util.Objects;

@Service
public class AccountServiceImpl implements AccountService {
    @Override
    public boolean login(LoginData data) {
        // TODO: implement login
        return Objects.equals(data.getUsername(), "admin") && Objects.equals(data.getPassword(), "123456");
    }
}
