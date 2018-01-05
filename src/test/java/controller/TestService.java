package controller;

import com.qidi.grad.entry.User;
import com.qidi.grad.service.UserService;
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
 * Time: 17:11
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:spring/applicationContext-mvc.xml"})
public class TestService {
    @Autowired
    private UserService userService;

    @Test
    public void testList(){
        List<User> list = userService.listUser(new HashMap<String,Object>());
        System.out.println(list.get(0).getName());
    }
}
