package tongquanve_kdl_bien.lesson3_day1.bai2_vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<Vehicle>();
        Vehicle vehicles = new Vehicle();
        boolean kiemTra = true;


        do {
            System.out.println("1.Nhap thong tin va tao doi tuong");
            System.out.println("2.Xuat ban ke khai tien thue truoc ba cua cac xe");
            System.out.println("3.Thoat");
            System.out.println("Nhap lua chon cua ban : ");
            int luaChon = sc1.nextInt();
            int dem = 0;
            switch (luaChon) {

                case 1: {
                    Vehicle vehicle1 = new Vehicle("Huy","Honda", 120, 12000000);
                    Vehicle vehicle2 = new Vehicle("Cuong", "Kaiki", 230, 21000000);
                    Vehicle vehicle3 = new Vehicle("Quyet", "Yamaha", 345, 40000000);
                    vehicleArrayList.add(vehicle1);
                    vehicleArrayList.add(vehicle2);
                    vehicleArrayList.add(vehicle3);
                    System.out.println("Thong tin da duoc nhap vao!");
                    break;
                }
                case 2: {
                    System.out.println("Thong tin xe : ");
                    System.out.println("Ten Chu Xe\t\t\t" + "Loai Xe\t\t\t" + "Dung Tich\t\t\t" + "Tri Gia\t\t\t"
                            + "Thue Phai Nop\t\t\t");
                    System.out.println("======================================================================================");
                    for (int i = 0; i < vehicleArrayList.size(); i++) {
                        vehicleArrayList.get(i).xuatThongTin();
                    }
                    break;
                }
                case 3:
                    kiemTra = false;
            }
        } while (kiemTra);

    }
}
