package tongquanve_kdl_bien.lesson2_day1;

import java.util.Scanner;

public class SapXepTangDan {
    static void tangDanBaSo(int so1, int so2, int so3){
        int temp ;
        if(so1 > so2){
            temp = so1;
            so1  = so2;
            so2 = temp;
        }
        if(so1 > so3){
            temp = so1;
            so1 = so3;
            so3 = temp;
        }
        if(so2 > so3){
            temp = so2;
            so2 = so3;
            so3 = temp;
        }
        System.out.println("Sap xep tang dan: \n");
        System.out.println(so1 + " , " + so2 + " , " + so3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        int so1 = sc.nextInt();
        System.out.println("\nNhap so thu 2: ");
        int so2 = sc.nextInt();
        System.out.println("\nNhap so thu 3: ");
        int so3 = sc.nextInt();

        tangDanBaSo(so1, so2, so3);
    }
}
