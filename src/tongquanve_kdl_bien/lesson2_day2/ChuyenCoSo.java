package tongquanve_kdl_bien.lesson2_day2;

import java.util.ArrayList;
import java.util.Scanner;

public class ChuyenCoSo {
    static void chuyen10Sang2(int n){
        int nhiPhan[] = new int[50];
        int i = 0;
        while(n > 0){
            nhiPhan[i++] = n%2;
            n = n / 2;
        }
        for(int j=i-1; j>=0; j--){
            System.out.print(nhiPhan[j]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap co so 10 : ");
        int coSo10 = sc.nextInt();
        System.out.println("Nhi phan cua " + coSo10 + " la : ");
        chuyen10Sang2(coSo10);
    }
}
