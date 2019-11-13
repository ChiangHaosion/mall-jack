package com.example.malljack.mapper;

import com.example.malljack.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName UserMapper
 * @Description: TODO
 * @Author Haosion
 * @Date 2019/10/27
 * @Version V1.0
 **/
@Mapper
public interface UserMapper {
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void register(User user);
}
