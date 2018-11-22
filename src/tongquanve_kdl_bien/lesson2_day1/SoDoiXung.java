package tongquanve_kdl_bien.lesson2_day1;

import java.util.Scanner;

public class SoDoiXung {
    static String kiemTraDoiXung(int soGoc){
        int soDao = 0; // dao nguoc cua so goc
        int temp = soGoc;
        while (temp > 0){
            soDao = soDao*10 + temp%10;
            temp = temp/10;
        }
        if(soDao == soGoc) {
            return "So nay doi xung";
        }
        else
            return "so nay khong doi xung";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so : ");
        int soGoc = sc.nextInt();
        String text = kiemTraDoiXung(soGoc);
        System.out.println("\nKet qua : " + text);
    }
}
