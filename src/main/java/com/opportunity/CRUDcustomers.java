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

    public static String createCustomers(Customers x){
        String query="INSERT INTO customers(first_name, last_name, birth_date, age," +
                "gender, phone, email, city, street, building)" +
                "values(\""+x.getFirst_name()+"\",\""+x.getLast_name()+"\",\""+x.getBirth_date()+"\","+x.getAge()+",\""+x.getGender()+"\",\""+x.getPhone()+"\",\""+
                x.getEmail()+"\",\""+x.getCity()+"\",\""+x.getStreet()+"\",\""+x.getBuilding()+"\");";
        System.out.println("INSERT complete");
        return query;
    }




    public static String deleteCustomers(int id){
        String query="delete from customers where customer_id="+id;
        System.out.println("DELETE complete");
        return query;
    }


    public static String updateCustomers(Customers x){
        String query="UPDATE customers SET ";
        if(x.getFirst_name()!=null)query+="first_name=\""+x.getFirst_name()+"\"";
        if(x.getLast_name()!=null)query+="last_name=\""+x.getLast_name()+"\"";
        if(x.getBirth_date()!=null)query+="birth_date=\""+x.getBirth_date()+"\"";
        if(x.getAge()!=0)query+="age=\""+x.getAge()+"\"";
        if(x.getGender()!=null)query+="gender=\""+x.getGender()+"\"";
        if(x.getPhone()!=null)query+="phone=\""+x.getPhone()+"\"";
        if(x.getEmail()!=null)query+="email=\""+x.getEmail()+"\"";
        if(x.getCity()!=null)query+="city=\""+x.getCity()+"\"";
        if(x.getStreet()!=null)query+="street=\""+x.getStreet()+"\"";
        if(x.getBuilding()!=null)query+="building=\""+x.getBuilding()+"\"";
        query+=" WHERE customer_id="+x.getCustomer_id();
        System.out.println("update comlete");
        System.out.println(query);
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
