package com.westee.cake;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Properties;

public class main {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://172.20.0.3:3310/test";
        String username = "root";
        String password = "root";
        Connection connection = null;
        Properties properties = new Properties();
        properties.setProperty("username", username);
        properties.setProperty("password", password);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("JDBC连接成功！");
            System.out.println(connection);
        } catch (Exception e) {
            System.out.println("JDBC连接失败：" + e.getMessage());
            System.out.println(connection);
        } finally {
            if(Objects.nonNull(connection)) {
                connection.close();
            }
        }
        System.out.println("Hello, World!");
    }
}
