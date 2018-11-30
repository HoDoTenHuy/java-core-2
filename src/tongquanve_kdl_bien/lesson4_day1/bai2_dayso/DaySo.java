package tongquanve_kdl_bien.lesson4_day1.bai2_dayso;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DaySo {
    public static String taoDaySo(int daySo[], int n) {
        Random rd = new Random();
        int viTriDau = 0;
        int viTriCuoi = n - 1;
        String daySoSauDoi = "";
        for (int i = 0; i < n; i++) {
            daySo[i] = rd.nextInt(15);
        }
        System.out.println("day dau : ");
        for (int i = 0; i < n; i++) {

            System.out.print(daySo[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            if (daySo[i] % 7 == 0 && daySo[i] != 0 && daySo[i] % 5 != 0) {
                int temp;
                temp = daySo[viTriDau];
                daySo[viTriDau] = daySo[i];
                daySo[i] = temp;
                viTriDau++;
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            if (daySo[i] % 5 == 0 && daySo[i] != 0 && daySo[i] % 7 != 0) {
                int temp1;
                temp1 = daySo[viTriCuoi];
                daySo[viTriCuoi] = daySo[i];
                daySo[i] = temp1;
                viTriCuoi--;
            }
        }
        System.out.println("\nday sau : ");
        for (int i = 0; i < n; i++) {
            daySoSauDoi += daySo[i] + " ";
        }
        return daySoSauDoi;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao phan tu day : ");
        int soPhanTuDay = sc.nextInt();
        int daySo[] = new int[soPhanTuDay];
        System.out.println(taoDaySo(daySo, soPhanTuDay));
    }
}
