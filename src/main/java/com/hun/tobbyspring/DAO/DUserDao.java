package com.hun.tobbyspring.DAO;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {

    public DUserDao(SimpleConnectionMaker simpleConnectionMaker) {
        super(simpleConnectionMaker);
    }

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        return null;
    }
}
