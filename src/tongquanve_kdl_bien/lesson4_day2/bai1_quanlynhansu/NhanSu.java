package tongquanve_kdl_bien.lesson4_day2.bai1_quanlynhansu;

import java.util.Scanner;

public abstract class NhanSu {
    private String hoTen;
    private int namSinh;
    private float heSoLuong;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public NhanSu(String hoTen, int namSinh, float heSoLuong) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.heSoLuong = heSoLuong;
    }

    public NhanSu() {
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ho Ten : ");
        this.hoTen = sc.nextLine();
        System.out.println("\nNam Sinh : ");
        this.namSinh = sc.nextInt();
        System.out.println("\nHe So Luong : ");
        this.heSoLuong = sc.nextInt();
    }

    public abstract long tinhHeSoLuong();

    @Override
    public String toString() {
        return "NhanSu{" +
                "hoTen='" + hoTen + '\'' +
                ", namSinh=" + namSinh +
                ", heSoLuong=" + heSoLuong +
                '}';
    }
}
