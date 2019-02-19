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

    public Customers(String first_name, String last_name, String birth_date, int age, String gender, String phone, String email, String city, String street, String building) {
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

    public Customers() {
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

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
}
