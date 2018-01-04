package com.qidi.grad.dao.user;

import com.qidi.grad.dao.MyBatisRepository;
import com.qidi.grad.entry.User;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 10:40
 */
@MyBatisRepository
public interface UserDao {
    void insert(User user);

    void update(User user);

    User getUserById(Long id);

    Integer countUser(Map<String, Object> params);

    List<User> getUserList(Map<String, Object> params);
}
