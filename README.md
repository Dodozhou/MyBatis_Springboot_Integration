# MyBatis_Springboot_Integration
SpringBoot与Mybatis的整合实例，无xml文件，纯注解配置，可以作为开发初始模板。
mapper配置代码：
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
有完整的增删改查实例，开发时直接使用或者更改即可。
