package com.hun.tobbyspring.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {

    public NUserDao(SimpleConnectionMaker simpleConnectionMaker) {
        super(simpleConnectionMaker);
    }

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
