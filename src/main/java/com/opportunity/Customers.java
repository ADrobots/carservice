package com.opportunity;

public class Customers {
     private int customer_id;
     private String first_name;
     private String last_name;
     private String birth_date;
     private int age;
     private String gender;
     private String phone;
     private String email;
     private String city;
     private String street;
     private String building;

    public Customers(int customer_id, String first_name, String last_name, String birth_date, int age, String gender, String phone, String email, String city, String street, String building) {
        this.customer_id = customer_id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "customer_id=" + customer_id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building='" + building + '\'' +
                '}';


    }
}
