package tongquanve_kdl_bien.lesson2_day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SoLeMax {
    static void mangN(int n){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        ArrayList<Integer> arr2 = new ArrayList();
        System.out.println("Nhap vao mang so nguyen : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int phanTuLeMax;
        for(int i=0; i<n; i++){
            if(arr[i]%2 != 0){
                arr2.add(arr[i]);
            }
        }
        Collections.sort(arr2);

        System.out.println("\nCac thanh phan trong mang : ");
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " , ");
        }
        int soPhanTuArr = arr2.size();
        if(soPhanTuArr == 1){
            System.out.println("Khong co phan tu le lon thu 2!");
        }else{
        System.out.println("\nPhan tu le lon thu 2 la : " + arr2.get(soPhanTuArr -2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soPhanTuMang = sc.nextInt();
        mangN(soPhanTuMang);
    }
}
