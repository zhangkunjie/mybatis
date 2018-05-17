package com.mybatis;

import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by kunjie.zhang on 2018/5/16.
 */
public interface UserDao  extends  BaseDao<User>{
    public User selectUser(int id);

    @Select("select * from user  where id= #{id}")
    public User selectUserById(int id);

    public User selectUserByUser(User user);

    public TreeMap<String, Object> selectUserMap(User user);

    public void insert(User user);

    public void insertBatch(List<User> userList);

    public User selectUserGoods(User user);

    public void updateUser(User user);

    public void updateGoods(Goods goods);

    public List<User> findUserList(List<Integer> ids);

}
