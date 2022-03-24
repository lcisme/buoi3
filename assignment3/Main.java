package assignment3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
      User user1 = new User();
      user1.name = "Le Ceng";
      user1.age = 18;
      user1.phone = "0966876014";
      user1.email = "lephucuong2003@gmail.com";
      user1.money = 1000;

      User user2 = new User();
      user2.name = "Li Cing";
      user2.age = 18;
      user2.phone = "0966876014";
      user2.email = "lephucuong2003@gmail.com";
      user2.money = 1000;

      User user3 = new User();
      user3.name = "La Cang";
      user3.age = 18;
      user3.phone = "0966876014";
      user3.email = "lephucuong2003@gmail.com";
      user3.money = 1000;

      Room room1 = new Room();
      room1.tenphong = "A6";
      room1.vitri = "Tang 1";
      room1.giathue = "1000";
      room1.dsnguoi.add(user2.name);
      System.out.println("Thông ti phòng: "+room1.tenphong);
      room1.print();

      System.out.println("Kiểm tra tiền");
      user1.Room = room1;
      user1.checkmoney();
      user2.Room = room1;
      user2.checkmoney();

      System.out.println("Thông tin sau khi xóa");
      room1.dsnguoi.remove(0);
      room1.print();
    }
}
