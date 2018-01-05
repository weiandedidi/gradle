package controller;

import com.qidi.grad.dao.user.UserDao;
import com.qidi.grad.entry.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/5
 * Time: 17:01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/applicationContext-mvc.xml"})
public class TestUserDao {
    @Autowired
    private UserDao userDao;

    @Test
    public void testList() {
        List<User> list= userDao.getUserList(new HashMap<String, Object>());
        System.out.println(list.get(0).getName());
    }
}
