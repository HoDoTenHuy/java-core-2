package tongquanve_kdl_bien.lesson2_day2;

import java.util.Scanner;

public class GiaiThua {
    static long tinhGiaiThua(int n){
        if(n < 1)
            return 1;
        if(n % 2 == 0){
            return n*tinhGiaiThua(n-2);
        }else
            return n*tinhGiaiThua(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so n < 11 : ");
        int N = sc.nextInt();
        String text;
        if(N%2 == 0){
            text = " Chan";
        }
        else text = " le";
        System.out.println("Giai thua" + text + " cua " + N + " la : " + tinhGiaiThua(N));

    }
}
