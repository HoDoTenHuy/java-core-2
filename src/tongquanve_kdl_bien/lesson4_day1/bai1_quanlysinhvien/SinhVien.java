package tongquanve_kdl_bien.lesson4_day1.bai1_quanlysinhvien;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private float diemTH;
    private float diemLT;

    public SinhVien() {
        this.maSV = 0;
        this.hoTen = null;
        this.diemTH = 0;
        this.diemLT = 0;
    }

    public SinhVien(int maSV, String hoTen, float diemTH, float diemLT) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTH = diemTH;
        this.diemLT = diemLT;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ma SV : ");
        this.maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("\nHo Ten : ");
        this.hoTen = sc.nextLine();
        System.out.println("\nDiem Thuc Hanh : ");
        this.diemTH = sc.nextFloat();
        System.out.println("\nDiem Ly Thuyet : ");
        this.diemLT = sc.nextFloat();
    }

    @Override
    public String toString() {
        String text;
        text = maSV + "\t\t\t\t" + hoTen + "\t\t\t\t" + diemTH + "\t\t\t\t" +
                diemLT + "\t\t\t\t" + tinhDiemTB(diemLT, diemTH) + "\n";
        return text;
    }


    private float tinhDiemTB(float diemLT, float diemTH) {
        return (diemLT + diemTH) / 2;
    }
}
