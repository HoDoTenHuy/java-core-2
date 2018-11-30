package tongquanve_kdl_bien.lesson4_day2.bai1_quanlynhansu;

import java.util.Scanner;

public class TruongPhong extends NhanSu {
    private int soLuongNVQL;
    private NhanSu nhanSu;

    public TruongPhong(String hoTen, int namSinh, float heSoLuong, int soLuongNVQL) {
        super(hoTen, namSinh, heSoLuong);
        this.soLuongNVQL = soLuongNVQL;
    }

    public TruongPhong() {
    }

    public TruongPhong(int soLuongNVQL) {
        this.soLuongNVQL = soLuongNVQL;
    }

    public TruongPhong(int soLuongNVQL, NhanSu nhanSu) {
        this.soLuongNVQL = soLuongNVQL;
        this.nhanSu = nhanSu;
    }

    public int getSoLuongNVQL() {
        return soLuongNVQL;
    }

    public void setSoLuongNVQL(int soLuongNVQL) {
        this.soLuongNVQL = soLuongNVQL;
    }

    public NhanSu getNhanSu() {
        return nhanSu;
    }

    public void setNhanSu(NhanSu nhanSu) {
        this.nhanSu = nhanSu;
    }

    @Override
    public long tinhHeSoLuong() {
        return (long) (this.getHeSoLuong() * 2200000);
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSo Luong NV Quan Ly : ");
        this.soLuongNVQL = sc.nextInt();
    }

    @Override
    public String toString() {
        return "Luong : " + tinhHeSoLuong();
    }
}
