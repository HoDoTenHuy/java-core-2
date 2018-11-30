package tongquanve_kdl_bien.lesson4_day1.bai3_tamgiac_pascal;

import java.util.Scanner;

public class TamGiacPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang : ");
        int soPhanTu = sc.nextInt();
        System.out.println("Nhap chieu cao mang : ");
        int chieuCao = sc.nextInt();
        int mang[][] = new int[soPhanTu][soPhanTu];
        if (chieuCao < soPhanTu) {
            for (int i = 0; i < chieuCao; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == j || j == 0) {
                        mang[i][j] = 1;
                    } else {
                        mang[i][j] = mang[i - 1][j - 1] + mang[i - 1][j];
                    }
                    System.out.print(mang[i][j] + " ");
                }
                System.out.println();

            }
        } else
            System.out.println("chieu cao cua tam giac khong the lon hon so hang");

    }
}
