package tongquanve_kdl_bien.lesson4_day1.bai1_quanlysinhvien;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayList<SinhVien> dsSV = new ArrayList<>();
        SinhVien sv1 = new SinhVien(1, "Huy", 7.8f, 8.4f);
        SinhVien sv2 = new SinhVien(2, "Quyet", 7.4f, 7.7f);
        SinhVien sv3 = new SinhVien();

        System.out.println("Nhap thong tin cho sv3 : ");
        sv3.nhapThongTin();

        dsSV.add(sv1);
        dsSV.add(sv2);
        dsSV.add(sv3);

        System.out.println("MSVN\t\t\tHoTen\t\t\tDiemTH\t\t\tDiemLT\t\t\tDiemTB\n");
        System.out.println(dsSV.toString());
    }
}
