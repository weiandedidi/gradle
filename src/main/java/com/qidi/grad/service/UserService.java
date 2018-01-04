package com.qidi.grad.service;

import com.qidi.grad.dao.user.UserDao;
import com.qidi.grad.entry.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 10:41
 */
@Service
@Transactional(readOnly = true)
public class UserService {
    @Autowired
    private UserDao userDao;

    public List listUser(Map<String, Object> params) {
        List<User> users = null;
        users = userDao.getUserList(params);
        if (users == null || users.isEmpty()) {
            users = new ArrayList<User>();
        }
        return users;
    }
}
