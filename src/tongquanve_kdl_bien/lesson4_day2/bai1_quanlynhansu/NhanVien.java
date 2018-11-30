package tongquanve_kdl_bien.lesson4_day2.bai1_quanlynhansu;

import java.util.Scanner;

public class NhanVien extends NhanSu {
    private NhanSu nhanSu;
    private String tenDonVi;

    public NhanVien(NhanSu nhanSu, String tenDonVi) {
        this.nhanSu = nhanSu;
        this.tenDonVi = tenDonVi;
    }

    public NhanVien() {
    }

    public NhanSu getNhanSu() {
        return nhanSu;
    }

    public void setNhanSu(NhanSu nhanSu) {
        this.nhanSu = nhanSu;
    }

    public String getTenDonVi() {
        return tenDonVi;
    }

    public void setTenDonVi(String tenDonVi) {
        this.tenDonVi = tenDonVi;
    }

    @Override
    public long tinhHeSoLuong() {
        return (long) (this.getHeSoLuong() * 1250000);
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nTen Don Vi : ");
        this.tenDonVi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Luong : " + tinhHeSoLuong();
    }
}
