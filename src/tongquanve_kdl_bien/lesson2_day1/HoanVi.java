package tongquanve_kdl_bien.lesson2_day1;

import java.util.Scanner;

public class HoanVi {
    static void timHoanVi(int so1, int so2){
        so1 = so1 + so2;
        so2 = so1 - so2;
        so1 = so1 - so2;
        System.out.println("\nSau hoan vi : " + so1 + " - " + so2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        int so1 = sc.nextInt();
        System.out.println("\nNhap so thu 2: ");
        int so2 = sc.nextInt();
        System.out.println("Chua hoan vi : " + so1 + " - " + so2);
        timHoanVi(so1, so2);

    }
}
