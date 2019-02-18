package com.opportunity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class main{
    public static void main(String[] args){

        try (Connection connection=Connect.getConnected()){

            if (connection!=null) {
                Statement statement = connection.createStatement();

                //create customer
                statement.executeUpdate(CRUDcustomers.createCustomers("Tony", "Gibson", "1989.12.09", 19, "M", "345-678",
                        "vox15v@", "Ekb", "St.Bolshew", "yes"));



                //delete customer
                statement.executeUpdate(CRUDcustomers.deleteCustomers(18));

                //update customer
               statement.executeUpdate(CRUDcustomers.updateCustomers("", "", "", 0,
                        "", "", "", "Moscow", "", "", 1));

                //get customer
                CRUDcustomers.getCustomer(1);




                /*//getAll
                getAll(statement);
                for (Customers c:CRUDcustomers.getAll(statement)) {
                    System.out.println(c);
                }*/









            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
