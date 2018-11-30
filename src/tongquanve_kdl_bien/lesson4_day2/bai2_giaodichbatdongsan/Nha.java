package tongquanve_kdl_bien.lesson4_day2.bai2_giaodichbatdongsan;

import java.util.Scanner;

public class Nha extends BatDongSan {
    private String loaiNha;
    private String diaChi;

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Nha() {
    }

    @Override
    public long thanhTien() {
        if (loaiNha.equalsIgnoreCase("Cao cap")) {
            return (long) (this.getDienTich() * this.getDonGia());
        }
        if (loaiNha.equalsIgnoreCase("Thuong")) {
            return (long) (this.getDienTich() * this.getDonGia() * 0.9);
        }
        return 0;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Loai dat(Cao cap, Thuong) : ");
        this.loaiNha = sc.nextLine();
        System.out.println("\nDia chi : ");
        this.diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        String text = super.toString();
        return "Nha{" + text +
                ", loaiNha : " + loaiNha +
                ", diaChi : " + diaChi +
                '}';
    }
}
