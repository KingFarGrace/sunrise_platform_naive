package team.sunrise.managementplatform.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import team.sunrise.managementplatform.entity.UserIdentityData;

@Mapper
@Repository
public interface UserIdentifyMapper {
    public UserIdentityData selectById(String uid);
    public UserIdentityData selectByName(String username);
    public UserIdentityData selectByPhone(String telephone);
    public UserIdentityData selectByEmail(String mail);
}
