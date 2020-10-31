package team.sunrise.managementplatform.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.sunrise.managementplatform.entity.UserInputData;
import team.sunrise.managementplatform.entity.UserLoginData;

@Repository
@Mapper
public interface UserLoginMapper {
    public UserLoginData selectById(String uid);
    public UserLoginData selectByName(String username);
    public UserLoginData selectByPhone(String telephone);
    public UserLoginData selectByEmail(String mail);
    public UserLoginData selectByKey(UserInputData data);
}
