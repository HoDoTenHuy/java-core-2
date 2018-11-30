package tongquanve_kdl_bien.lesson4_day2.bai2_giaodichbatdongsan;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dat> dsDat = new ArrayList<>();
        ArrayList<Nha> dsNha = new ArrayList<>();
        Dat dat = new Dat();
        Nha nha = new Nha();

        boolean kiemTra = true;
        do {
            System.out.println("\n1.Nhap danh sach giao dich dat");
            System.out.println("\n2.Nhap danh sach giao dich nha");
            System.out.println("\n3.Xuat thong tin giao dich");
            System.out.println("\nNhap so khac de thoat");
            System.out.println("Nhap lua chon : ");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhap danh sach giao dich dat : ");
                    dat.nhapThongTin();
                    dsDat.add(dat);
                    break;
                case 2:
                    System.out.println("Nhap danh sach giao dich nha : ");
                    nha.nhapThongTin();
                    dsNha.add(nha);
                    break;
                case 3:
                    System.out.println("Xuat thong tin : ");
                    System.out.println("\n DAT : ");
                    for (int i = 0; i < dsDat.size(); i++) {
                        System.out.println(dsDat.toString());
                    }
                    System.out.println("So luong giao dich dat : " + dsDat.size());
                    System.out.println("\n NHA : ");
                    for (int i = 0; i < dsNha.size(); i++) {
                        System.out.println(dsNha.toString());
                    }
                    System.out.println("So luong giao dich nha : " + dsNha.size());
                    break;
                default:
                    kiemTra = false;
            }
        } while (kiemTra);
    }
}
