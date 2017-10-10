package com.star.mapper;

import com.star.entity.User;
import com.star.entity.UserSexEnum;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",  column = "user_sex", javaType = UserSexEnum.class),
    })
    User getOne(Long id);

    @Insert("INSERT INTO user(name,password,user_sex) VALUES(#{name}, #{password}, #{userSex})")
    void insert(User user);

    @Update("UPDATE user SET name=#{name},password=#{password} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{id}")
    void delete(Long id);
}
