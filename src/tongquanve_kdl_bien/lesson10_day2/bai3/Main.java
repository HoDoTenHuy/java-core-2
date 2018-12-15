package tongquanve_kdl_bien.lesson10_day2.bai3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GiaoDichVang giaoDichVang1 = new GiaoDichVang(1, "20", 111, 5, 2);
        GiaoDichVang giaoDichVang2 = new GiaoDichVang(2, "14", 561, 3, 1);
        GiaoDichTienTe giaoDichTienTe1 = new GiaoDichTienTe(1, "22", 10,
                50, 3, "USD");
        GiaoDichTienTe giaoDichTienTe2 = new GiaoDichTienTe(3, "5", 7,
                100, 3, "VN");
        ArrayList<GiaoDichVang> giaoDichVangs = new ArrayList<>();
        ArrayList<GiaoDichTienTe> giaoDichTienTes = new ArrayList<>();
        giaoDichVangs.add(giaoDichVang1);
        giaoDichVangs.add(giaoDichVang2);
        giaoDichTienTes.add(giaoDichTienTe1);
        giaoDichTienTes.add(giaoDichTienTe2);
        System.out.println("Da nhap");
        System.out.println(giaoDichVangs.toString());
        System.out.println(giaoDichTienTes.toString());
        System.out.println("So luong giao dich vang : " +giaoDichVangs.size());
        System.out.println("So luong giao dich tien te : " + giaoDichTienTes.size());
        int tongTienGDV = 0;
        int tongTienGDTT =0;
        for(int i=0; i< 2;i++){
            tongTienGDV += giaoDichVangs.get(i).thanhTien();
            tongTienGDTT += giaoDichTienTes.get(i).thanhTien();
            if(giaoDichVangs.get(i).thanhTien() > 100 || giaoDichTienTes.get(i).thanhTien() > 100){
                System.out.println("Cac giao dich co gia tri > 100 : " + giaoDichVangs.get(i) + giaoDichTienTes.get(i));
            }
        }
        System.out.println("Tong Tien GDV : " + tongTienGDV);
        System.out.println("Tong Tien GDTT : " + tongTienGDTT);

    }
}
