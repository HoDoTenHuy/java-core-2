package tongquanve_kdl_bien.lesson2_day1;

import java.util.Scanner;

public class TongSoChan {
    static long tinhTongSoChan(int n){
        long tongN = 0;
        while(n < 0){
            System.out.println("Nhap lai n > 0 : ");
            break;
        }
        for(int i=1; i <= n; i++) {
           if(i%2 == 0){
               tongN += i;
           }
        }
        return tongN;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 so : ");
        int soN = sc.nextInt();
        System.out.println("Tong so chan : " + tinhTongSoChan(soN));
    }
}
