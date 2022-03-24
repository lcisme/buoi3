package seccion3lab1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhap thong tin");
        Student st = new Student();
        GiaoVien gv = new GiaoVien();
        st.insert();
        gv.insert();
        st.print();
        gv.print();
    }
}
