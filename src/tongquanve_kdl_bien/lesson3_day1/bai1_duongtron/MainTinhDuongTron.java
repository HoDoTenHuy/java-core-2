package tongquanve_kdl_bien.lesson3_day1.bai1_duongtron;

import java.util.Scanner;

public class MainTinhDuongTron {
    public static void main(String[] args) {
        Diem diemA = new Diem(2, 3);
        Diem diemO = new Diem(3, 3);
        DuongTron duongTron = new DuongTron(diemO, (double) 6);
        duongTron.kiemTraDiem(diemA);
    }
}
