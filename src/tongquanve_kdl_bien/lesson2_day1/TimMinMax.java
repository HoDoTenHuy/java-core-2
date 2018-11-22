package tongquanve_kdl_bien.lesson2_day1;

import java.util.Scanner;

public class TimMinMax {
     static void timMinMax(int soThuNhat, int soThuHai, int soThuBa){
        int max = 0, min = 0;
        int a[] = {soThuNhat, soThuHai, soThuBa};
         for(int i=0;i<3;i++){
             for(int j=0; j < i;j++){
                 if(a[i] > a[j]){
                     int temp;
                     temp = a[j];
                     a[j] = a[i];
                     a[i] = temp;
                 }
             }
        }
       max = a[0];
        min = a[2];
         System.out.println("Min : " + min + "\nMax : " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu 1: ");
        int so1 = sc.nextInt();
        System.out.println("\nNhap so thu 2: ");
        int so2 = sc.nextInt();
        System.out.println("\nNhap so thu 3: ");
        int so3 = sc.nextInt();

        timMinMax(so1, so2, so3);

    }
}
