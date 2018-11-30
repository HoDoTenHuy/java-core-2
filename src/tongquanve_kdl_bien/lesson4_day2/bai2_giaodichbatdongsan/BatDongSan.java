package tongquanve_kdl_bien.lesson4_day2.bai2_giaodichbatdongsan;

import java.util.Scanner;

public abstract class BatDongSan {
    private int maGiaoDich;
    private String ngayGiaoDich;
    private long donGia;
    private int dienTich;


    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getDienTich() {
        return dienTich;
    }

    public void setDienTich(int dienTich) {
        this.dienTich = dienTich;
    }

    public abstract long thanhTien();

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma giao dich : ");
        this.maGiaoDich = sc.nextInt();
        sc.nextLine();
        System.out.println("\nNgay giao dich : ");
        this.ngayGiaoDich = sc.nextLine();
        System.out.println("\nDon gia : ");
        this.donGia = sc.nextLong();
        System.out.println("\nDien tich : ");
        this.dienTich = sc.nextInt();
    }

    @Override
    public String toString() {
        return "maGiaoDich : " + maGiaoDich +
                ", ngayGiaoDich : " + ngayGiaoDich +
                ", donGia : " + donGia +
                ", dienTich : " + dienTich;
    }
}
