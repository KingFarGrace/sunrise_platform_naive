package team.sunrise.managementplatform.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.sunrise.managementplatform.entity.UserLoginData;

/**
 * @author ZHANGKAIHENG
 */
@Mapper
@Repository
public interface UserLoginMapper {
    public UserLoginData selectByPwd(String password);
}
