package tongquanve_kdl_bien.lesson10_day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        ArrayList<Integer> dsList = new ArrayList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap phan tu mang: ");
        int N = sc.nextInt();
        int nhap;
        for(int i=0;i<N;i++){
            nhap = sc.nextInt();
            dsList.add(nhap);
        }
        System.out.println("Tổng phần tử đầu và cuối : " + (dsList.get(0) + dsList.get(dsList.size()-1)));
        System.out.println("DS chưa sắp xếp : " + dsList);
        Collections.sort(dsList);
        System.out.println("Phần tử lớn thứ 2 : " + dsList.get(dsList.size()-2));
    }
}
