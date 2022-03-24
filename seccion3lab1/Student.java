package seccion3lab1;

import java.util.Scanner;

public class Student extends person {
    int point;
    String masv,mail;
    public String getMasv() {
        return masv;
    }
    public void setMasv(String masv) {
        this.masv = masv;
    }
    public int getPoint() {
        return point;
    }
    public void setPoint(int point) {
        this.point = point;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void insert(){
        super.insert();
        Scanner abc = new Scanner(System.in);
        setMasv(abc.nextLine());
        setPoint(abc.nextInt());
        abc.nextLine();
        setMail(abc.nextLine());
    }
    public void print(){
        super.print();
        System.out.println("Mã Sv "+masv);
        System.out.println("Điểm thi "+point);
        System.out.println("Email "+mail);
    }
    public boolean checkpoint(){
        if(getPoint()>8){
            System.out.println("Bạn có học bổng");
            return true;
        }
        else
            System.out.println("Bạn trượt học bổng");
        return false;
    }
}
