package com.hun.tobbyspring.DAO;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        UserDao dao = new NUserDao(new SimpleConnectionMaker());

        User user = new User();
        user.setId("kdh");
        user.setName("김다훈");
        user.setPassword("married");

        dao.add(user);

        System.out.println(user.getId() + "등록 성공");

        User user2 = dao.get(user.getId());

        System.out.println(user2.getName());

        System.out.println(user2.getPassword());

        System.out.println(user2.getId() + "조회 성공");

    }
}
