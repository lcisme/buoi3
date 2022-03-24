package seccion3lab1;

import java.util.Scanner;

public class person {
    String name,gender,date,address;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void insert(){
        Scanner abc = new Scanner(System.in);
        setName(abc.nextLine());
        setGender(abc.nextLine());
        setDate(abc.nextLine());
        setAddress(abc.nextLine());
    }
    public void print(){
        System.out.println("Tên "+getName());
        System.out.println("Giới tính "+getGender());
        System.out.println("Ngày sinh "+getDate());
        System.out.println("Nơi ở "+getAddress());
    }
}
