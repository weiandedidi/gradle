package com.qidi.grad.dao;


import com.qidi.grad.entry.Depart;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: qidima
 * @date: 2018/1/4
 * Time: 10:39
 */
@MyBatisRepository
public interface DepartDao {
    void insert(Depart depart);

    void update(Depart depart);

    Depart getDepartById(Long id);

    Integer countDepart(Map<String, Object> params);

    List<Depart> getDepartList(Map<String, Object> params);
}
