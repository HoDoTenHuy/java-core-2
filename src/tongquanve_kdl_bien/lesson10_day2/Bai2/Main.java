package tongquanve_kdl_bien.lesson10_day2.Bai2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static int sapXepGiaThanh(DiaCD cd1, DiaCD cd2) {
        int giaCD1 = cd1.getGiaThanh();
        int giaCD2 = cd2.getGiaThanh();
        if (giaCD1 > giaCD2) {
            return 1;
        }
        if (giaCD1 == giaCD2) {
            return 0;
        } else
            return -1;
    }
    public static int sapXepMaCD(DiaCD cd1, DiaCD cd2) {
        int maCD1 = cd1.getMaCD();
        int maCD2 = cd2.getMaCD();
        if (maCD2 > maCD1) {
            return 1;
        }
        if (maCD1 == maCD2) {
            return 0;
        } else
            return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaCD diaCD1 = new DiaCD(1, "Cuong", "hihi", 3, 340);
        DiaCD diaCD2 = new DiaCD(2, "hihi", "hahha", 4, 120);
        ArrayList<DiaCD> diaCDList = new ArrayList<>();
        diaCDList.add(diaCD2);
        boolean kiemTra = true;
        do {
            System.out.println("\n1.Thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.");
            System.out.println("\n2.Tính số lượng CD & Tong gia thanh có trong danh sách");
            System.out.println("\n3.Phương thức sắp xếp danh sách giảm dần theo giá thành");
            System.out.println("\n4.Phương thức sắp xếp danh sách tĕng dần theo tựa CD");
            System.out.println("\n5.Phương thức xuất toàn bộ danh sách");
            System.out.println("Nhap lua chon : ");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Them CD : ");
                    for (int i = 0; i < diaCDList.size(); i++) {
                        if (diaCDList.get(i).getMaCD() != diaCD1.getMaCD()) {
                            diaCDList.add(diaCD1);
                            System.out.println("Da them");
                            break;
                        } else
                            System.out.println("ID CD trung");
                    }
                    break;
                case 2:
                    System.out.println("Thong tin : ");
                    System.out.println("Số lượng CD : " + diaCDList.size());
                    long giaThanh = 0;
                    for (int i = 0; i < diaCDList.size(); i++) {
                        giaThanh += diaCDList.get(i).getGiaThanh();
                    }
                    System.out.println("Tổng giá thành : " + giaThanh);
                    break;
                case 3:
                    System.out.println("Giam dan theo gia thanh : ");
                    for(int i=0;i<diaCDList.size();i++){
                        sapXepGiaThanh(diaCDList.get(i), diaCDList.get(i+1));
                    }
                    System.out.println(diaCDList.toString());
                    break;

                case 4:
                    System.out.println("Giam dan theo ma CD : ");
                    for(int i=0;i<diaCDList.size();i++){
                        sapXepMaCD(diaCDList.get(i), diaCDList.get(i+1));
                    }
                    System.out.println(diaCDList.toString());
                    break;
                case 5:
                    System.out.println("Xuat : ");
                    System.out.println(diaCDList.toString());
                    break;
                default:
                    kiemTra = false;
            }
        } while (kiemTra);
    }
}
