package com.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class App {
    @Test
    public void test() throws Exception {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession(true);
        try {
            User u = (User) session.selectOne("com.mybatis.UserDao.selectUser", 1);
            UserDao userDao = session.getMapper(UserDao.class);
            /*System.out.println(u.getName());
            User u1 = (User) session.selectOne("com.mybatis.UserDao.selectUserById", 2);
            System.out.println(u1.getName());

            User u3 = userDao.selectUser(3);
            System.out.println(u3.getName());
            User u4 = new User();
            u4.setId(1);
            User u5 = userDao.selectUserByUser(u4);
            System.out.println(u5);
            Map<String, Object> u6 = userDao.selectUserMap(u4);
            System.out.println(u6.entrySet());
            User u7 = new User();
            u7.setAge(22);
            Timestamp ts = new Timestamp(System.currentTimeMillis());
            u7.setCreateDate(ts);
            u7.setName("Tom");
            userDao.insert(u7);
            session.commit();
            List<User> userList = new ArrayList<User>();
            userList.add(u1);
            userList.add(u1);
            userDao.insertBatch(userList);
            session.commit();
            User u8 = new User();
            u8.setId(1);
            User u9 = userDao.selectUserGoods(u8);
            for (Goods g : u9.getUserGoods()) {
                System.out.println(g.getGoodsName());
            }
            System.out.println(u8);
            User u10 = new User();
            u.setName("tom");
            u.setId(1);
            User u11 = userDao.selectUserByUser(u10);
            System.out.println(u3.getName());
            //更新
            User u12 = new User();
            u10.setId(1);
            u10.setName("Jack");
            u10.setCreateDate(new Timestamp(System.currentTimeMillis()));
            userDao.updateUser(u10);
            Goods goods = new Goods();
            goods.setId(1);
            goods.setGoodsName("apple");
            userDao.updateGoods(goods);
            //传入参数是ids
            List<Integer> ids = new ArrayList<Integer>();
            ids.add(1);
            ids.add(2);
            List<User> userLists = userDao.findUserList(ids);
            for (User u13 : userList) {
                System.out.println(u11.getName());
            }*/
            User uu = userDao.getById(1);
            System.out.println(uu);
        } finally {
            session.close();

        }
    }
}
