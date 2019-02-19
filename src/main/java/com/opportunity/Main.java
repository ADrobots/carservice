package com.opportunity;

import java.sql.Connection;
import java.sql.Statement;


public class Main {
    public static void main(String[] args){

        try (Connection connection=Connect.getConnected()){

            if (connection!=null) {
                Statement statement = connection.createStatement();

                //create customer
                statement.executeUpdate(CRUDcustomers.createCustomers(new Customers("Anton", "", "1989.12.09", 19, "M", "999-000",
                        "", "Ekb", "", "")));



                //delete customer
                statement.executeUpdate(CRUDcustomers.deleteCustomers(19));

                //update customer
                Customers cust=new Customers();
                cust.setCustomer_id(2);
                cust.setCity("Tumen");

               statement.executeUpdate(CRUDcustomers.updateCustomers(cust));

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
