package tongquanve_kdl_bien.lesson2_day2;

import java.util.Random;
import java.util.Scanner;

public class TroChoiDoanSo {
    public static void main(String[] args) {
        Random rn = new Random();
        int rand = rn.nextInt(6);
        Scanner sc = new Scanner(System.in);
        int soBanNhap;
        boolean kiemTra = true;
        int diem = 0;
        int dem = 0;
        do{
            int luaChon;
            System.out.println("\n1. Thuc hien chuong trinh!");
            System.out.println("\n0. Thoat!");
            System.out.println("Ban hay nhap lua chon: ");
            luaChon = sc.nextInt();
            switch(luaChon){
                case 1 :{
                    boolean kiemTraSoNhap = true;
                    do {
                        System.out.println("\nNhap so cua ban : ");
                        soBanNhap = sc.nextInt();
                        if(soBanNhap == rand){
                            System.out.println("Ban da nhap dung!");
                            diem+=2;
                            kiemTraSoNhap = false;
                        }
                        else
                            System.out.println("Ban da nhap sai hay nhap lai");
                        dem++;
                    }while (kiemTraSoNhap);
                    break;
                }
                case 0 : {
                    System.out.println("Tong diem : " + diem);
                    System.out.println("So lan thuc hien : " + dem);
                    kiemTra = false;
                }
            }
        }while(kiemTra);
    }
}
