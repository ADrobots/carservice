package com.opportunity;

import java.sql.*;

public class Connect {
    public static String url = "jdbc:mysql://localhost:3306/car_service";
    public static String login = "root";
    public static String pass = "1111";

        public static Connection getConnected(){
            try{
            return DriverManager.getConnection(url, login, pass);
        }catch (Exception e){
                System.out.println(e);
                return null;
            }
    }
}