package com.star.mybatis_boot;

import com.star.entity.User;
import com.star.entity.UserSexEnum;
import com.star.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisBootApplicationTests {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void testInsert() {
		userMapper.insert(new User("aa", "a123456", UserSexEnum.MALE));
		Assert.assertEquals(3,userMapper.getAll().size());
	}

	@Test
	public void testQuery() throws Exception {
		List<User> users = userMapper.getAll();
		System.out.println(users.toString());
	}

	@Test
	public void testUpdate() throws Exception {
		User user = userMapper.getOne(10l);
		user.setName("neo");
		userMapper.update(user);
		Assert.assertTrue(("neo".equals(userMapper.getOne(10l).getName())));
	}

}
