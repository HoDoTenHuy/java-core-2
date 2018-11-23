package tongquanve_kdl_bien.lesson3_day1.bai1_duongtron;

import java.util.Scanner;

public class MainTinhDuongTron {
    public static void main(String[] args) {
        Diem diemA = new Diem();
        Diem diemO = new Diem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoanh do diem A : ");
        diemA.setTungDo(sc.nextInt());
        System.out.println("\nNhap tung do diem A : ");
        diemA.setTungDo(sc.nextInt());
        System.out.println("\nNhap hoanh do tam hinh tron : ");
        diemO.setHoanhDo(sc.nextInt());
        System.out.println("\nNhap tung do tam hinh tron : ");
        diemO.setTungDo(sc.nextInt());
        System.out.println("\nNhap ban kinh hinh tron : ");
        int banKinh = sc.nextInt();

        int binhPhuongKC = (diemA.getHoanhDo() - diemO.getHoanhDo()) * (diemA.getHoanhDo() - diemO.getHoanhDo())
                + (diemA.getTungDo() - diemO.getTungDo()) *(diemA.getTungDo() - diemO.getTungDo());
        if(binhPhuongKC == banKinh*banKinh){
            System.out.println("Diem A thuoc duong tron tam O, BK = " + banKinh + "!");
        }else
            System.out.println("Diem A khong thuoc duong tron!");
    }
}
