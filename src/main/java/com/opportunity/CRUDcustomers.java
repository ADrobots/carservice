package com.opportunity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CRUDcustomers{
    public static Customers getCustomer(int id){

        try {
            Connection connection=Connect.getConnected();
            Statement statement=connection.createStatement();


        String query = "SELECT * FROM customers WHERE customer_id=" + id;
        ResultSet rs=statement.executeQuery(query);

        rs.next();
        Customers obj=new Customers(rs.getInt("customer_id"), rs.getString("first_name"), rs.getString("last_name"),
                rs.getString("birth_date"), rs.getInt("age"), rs.getString("gender"), rs.getString("phone"),
                rs.getString("email"), rs.getString("city"), rs.getString("street"), rs.getString("building"));

        System.out.println("get customer complete");
            System.out.println(obj);
        return obj;

         }catch (Exception e){
            System.out.println(e);
            return null;
        }

    }

    public static String createCustomers(String first_name, String last_name,
                                         String birth_date, int age, String gender,
                                         String phone, String email, String city,
                                         String street, String building){
        String query="INSERT INTO customers(first_name, last_name, birth_date, age," +
                "gender, phone, email, city, street, building)" +
                "values(\""+first_name+"\",\""+last_name+"\",\""+birth_date+"\","+age+",\""+gender+"\",\""+phone+"\",\""+
                email+"\",\""+city+"\",\""+street+"\",\""+building+"\");";
        System.out.println("INSERT complete");
        return query;
    }


    public static String deleteCustomers(int id){
        String query="delete from customers where customer_id="+id;
        System.out.println("DELETE complete");
        return query;
    }

    public static String updateCustomers(String first_name, String last_name,
                                         String birth_date, int age, String gender,
                                         String phone, String email, String city,
                                         String street, String building, int customer_id){
       String query="UPDATE customers SET ";
        if(first_name!="")query+="first_name=\""+first_name+"\"";
        if(first_name!="")query+="last_name=\""+last_name+"\"";
        if(birth_date!="")query+="birth_date=\""+birth_date+"\"";
        if(age!=0)query+="age=\""+age+"\"";
        if(gender!="")query+="gender=\""+gender+"\"";
        if(phone!="")query+="phone=\""+phone+"\"";
        if(email!="")query+="email=\""+email+"\"";
        if(city!="")query+="city=\""+city+"\"";
        if(street!="")query+="street=\""+street+"\"";
        if(building!="")query+="building=\""+building+"\"";
        query+=" WHERE customer_id="+customer_id;
        System.out.println("update comlete");
        return query;

    }

    public  static List<Customers> getAll(Statement statement){

        List<Customers> objCustomers=new ArrayList<>();
        try {
            ResultSet resSet=statement.executeQuery("SELECT * FROM customers;");
            while (resSet.next()) {
                objCustomers.add(new Customers(resSet.getInt("customer_id"), resSet.getString("first_name"), resSet.getString("last_name"),
                        resSet.getString("birth_date"), resSet.getInt("age"), resSet.getString("gender"), resSet.getString("phone"),
                        resSet.getString("email"), resSet.getString("city"), resSet.getString("street"), resSet.getString("building")));
            }
                System.out.println("getAll complete");
                return objCustomers;

        }catch (Exception e){}
                return null;

    }


}
