package seccion3lab1;

import java.util.Scanner;

public class GiaoVien extends person{
    String dsl,cacmon;
    int luong,somon;
    public String getDsl() {
        return dsl;
    }
    public void setDsl(String dsl) {
        this.dsl = dsl;
    }
    public String getCacmon() {
        return cacmon;
    }
    public void setCacmon(String cacmon) {
        this.cacmon = cacmon;
    }
    public int getLuong() {
        return luong;
    }
    public void setLuong(int luong) {
        this.luong = luong;
    }
    public int getSomon() {
        return somon;
    }
    public void setSomon(int somon) {
        this.somon = somon;
    }

    public void insert(){
        super.insert();
        Scanner abc = new Scanner(System.in);
        setDsl(abc.nextLine());
        setCacmon(abc.nextLine());
        setLuong(abc.nextInt());
        abc.nextLine();
        setSomon(abc.nextInt());
        abc.nextLine();
    }
    public void print(){
        super.print();
        System.out.println("Danh sách lớp giảng dạy "+dsl);
        System.out.println("Lương giáo viên "+luong);
        System.out.println("Số các môn dạy "+somon);
        System.out.println("Các môn dạy "+cacmon);
    }
}
