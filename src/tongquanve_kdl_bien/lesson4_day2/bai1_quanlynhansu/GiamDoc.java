package tongquanve_kdl_bien.lesson4_day2.bai1_quanlynhansu;

import java.util.Scanner;

public class GiamDoc extends NhanSu {
    private float heSoChucVu;
    private NhanSu nhanSu;

    public float getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(float heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public GiamDoc() {
    }

    public GiamDoc(float heSoChucVu, NhanSu nhanSu) {
        this.heSoChucVu = heSoChucVu;
        this.nhanSu = nhanSu;
    }

    @Override
    public long tinhHeSoLuong() {
        return (long) ((this.getHeSoLuong() + this.heSoChucVu) * 3000000);
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHe So Chuc Vu : ");
        this.heSoChucVu = sc.nextFloat();
    }

    @Override
    public String toString() {
        return "Luong : " + tinhHeSoLuong();
    }
}
