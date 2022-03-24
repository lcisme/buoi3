package assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Room {
    String tenphong,vitri,giathue;
    ArrayList dsnguoi = new ArrayList();

    public String getTenphong() {
        return tenphong;
    }
    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }
    public String getVitri() {
        return vitri;
    }
    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    public String getGiathue() {
        return giathue;
    }
    public void setGiathue(String giathue) {
        this.giathue = giathue;
    }
    public ArrayList getDsnguoi() {
        return dsnguoi;
    }
    public void setDsnguoi(ArrayList dsnguoi) {
        this.dsnguoi = dsnguoi;
    }

    public void print(){
        System.out.println("Tên phòng: "+tenphong);
        System.out.println("Vị trí: "+vitri);
        System.out.println("Giá thuê phòng: "+giathue);
        System.out.println("Danh sách người dùng: "+dsnguoi);
    }
}
