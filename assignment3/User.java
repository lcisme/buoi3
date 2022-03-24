package assignment3;

import java.util.Scanner;

public class User {
    String name,email,phone;
    int age;
    double money;
    Room Room;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
    public void checkmoney() {
        float roomgiathue = Float.parseFloat(this.Room.giathue);
        if (this.money<roomgiathue){
            System.out.println("Khách hàng "+this.name+" không đủ tiền thuê phòng");
        }
        else {
            System.out.println("Khách hàng "+this.name+" đủ tiền thuê phòng");
        }
    }
}
