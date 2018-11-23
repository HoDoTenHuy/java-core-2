package tongquanve_kdl_bien.lesson3_day1.bai3_phantu_yen_ngua;

import java.util.Random;
import java.util.Scanner;

public class YenNgua {
    public static void taoBangA(int bangA[][]){
        Random rand = new Random();
        for(int i=0; i<5;i++){
            for(int j=0;j<4;j++){
                bangA[i][j] = 1 + rand.nextInt(99);
            }
        }
    }
    public static void xuatBangA(int bangA[][]){
        for(int i=0;i<5;i++){
            System.out.println();
            for(int j=0;j<4;j++){
                System.out.print("\t" + bangA[i][j] + "\t");
            }
        }
    }
    public static void phanTuYenNgua(int bangA[][]){
        int y=0;
        int min = 0;
        int max = 0;
        for(int i=0;i<5;i++){
            min = bangA[i][0];
            for(int j=0; j<4;j++){
                if(min>bangA[i][j]){
                    min = bangA[i][j];
                    y = j;
                }
            }
            max = min;
            for(int j=0;j<4;j++){
                if(max < bangA[j][y]){
                    max = bangA[j][y];
                }
            }
        }
        if(max == min)
            System.out.println("\nCo phan tu yen nghua : " + max);
        else
            System.out.println("\nKhong co phan tu yen ngua");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bangA[][] = new int[5][4];
        taoBangA(bangA);
        xuatBangA(bangA);
        phanTuYenNgua(bangA);
    }
}
