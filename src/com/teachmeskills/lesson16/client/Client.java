package com.teachmeskills.lesson16.client;

import com.teachmeskills.lesson16.order.Order;

import java.util.ArrayList;
/**
 * This class is used for describing a client
 */
public class Client {
    private String name;
    private int age;
    private String registrationDate;
    ArrayList<Order> bucketOrder;

    public Client(String name, int age, String registrationDate, ArrayList<Order> backetOrder) {
        this.name = name;
        this.age = age;
        this.registrationDate = registrationDate;
        this.bucketOrder = backetOrder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public ArrayList<Order> getBucketOrder() {
        return bucketOrder;
    }

    public void setBucketOrder(ArrayList<Order> bucketOrder) {
        this.bucketOrder = bucketOrder;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", registrationDate = '" + registrationDate + '\'' +
                ", bucketOrder = " + bucketOrder +
                '}';
    }
}
