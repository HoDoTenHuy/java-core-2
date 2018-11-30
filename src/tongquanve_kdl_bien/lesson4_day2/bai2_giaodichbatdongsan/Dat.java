package tongquanve_kdl_bien.lesson4_day2.bai2_giaodichbatdongsan;

import java.util.Scanner;

public class Dat extends BatDongSan {
    private String loaiDat;


    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }


    @Override
    public long thanhTien() {
        if (loaiDat.equalsIgnoreCase("B") || loaiDat.equalsIgnoreCase("C")) {
            return (long) (this.getDienTich() * this.getDonGia());
        }
        if (loaiDat.equalsIgnoreCase("A")) {
            return (long) (this.getDienTich() * this.getDonGia() * 1.5);
        }
        return 0;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Loai dat(Loai A, B , C) : ");
        this.loaiDat = sc.nextLine();
    }

    @Override
    public String toString() {
        String text = super.toString();
        return "Dat{" + text +
                ", loaiDat " + loaiDat +
                '}';
    }
}
