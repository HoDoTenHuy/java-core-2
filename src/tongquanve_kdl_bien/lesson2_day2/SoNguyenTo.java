package tongquanve_kdl_bien.lesson2_day2;

import java.util.ArrayList;
import java.util.Scanner;

public class SoNguyenTo {
    static int kiemTraNguyenTo(int n){
        int dem = 0;
        for(int i=1; i<=n;i++){
            if(n%i==0){
                dem++;
            }
        }
        if(dem==2){
            return 1;
        }
        return 0;
    }
    /*static void mangSoNguyenTo(){
        ArrayList<Integer> mangSoNguyenTo = new ArrayList<>();
        for(int i=0; i< mangSoNguyenTo.size(); i++){
            if(kiemTraNguyenTo(i)){
                mangSoNguyenTo.add(i);
            }
        }
        System.out.println("So nguyen to thu 200 : " + mangSoNguyenTo.get(199));
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so tu nhien du lon : ");
        long soN = sc.nextLong();
        ArrayList<Integer> mangSoNguyenTo = new ArrayList<>();
        for(int i=0; i< soN; i++){
            if(kiemTraNguyenTo(i) == 1){
                mangSoNguyenTo.add(i);
            }
        }
        System.out.println("So nguyen to thu 200 : " + mangSoNguyenTo.get(60));
    }
}
