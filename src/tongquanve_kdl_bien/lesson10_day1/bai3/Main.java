package tongquanve_kdl_bien.lesson10_day1.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> sinhVienList = new ArrayList<>();
        SinhVien sinhVien1 = new SinhVien(1, "Huy", 7.8);
        SinhVien sinhVien2 = new SinhVien(2, "Quyet", 7.0);
        SinhVien sinhVien3 = new SinhVien(3, "Cuong", 7.0);

        boolean kiemTra = true;
        do {
            System.out.println("\n1.Nhập danh sách sinh viên");
            System.out.println("\n2.Xem danh sách sinh viên ");
            System.out.println("\n3.Sắp xếp và hiển thị danh sách sinh viên theo chiều tăng dần của điểm trung bình ");
            System.out.println("\n4.Sắp xếp và hiển thị danh sách sinh viên theo bằng chữ cái alphabet ");
            System.out.println("\n5.Thêm sinh viên vào danh sách");
            System.out.println("\n6.Tìm kiếm sinh viên theo mã");
            System.out.println("\n7.Xóa một sinh viên bị đuổi học khỏi danh sách");
            System.out.println("Nhap lua chon : ");
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập danh sách sinh viên : ");
                    sinhVienList.add(sinhVien1);
                    sinhVienList.add(sinhVien2);
                    break;
                case 2:
                    System.out.println("Xem danh sách sinh viên  : ");
                    System.out.println(sinhVienList.toString());
                    break;
                case 3:
                    System.out.println("Sắp xếp và hiển thị danh sách sinh viên theo chiều tăng dần " +
                            "của điểm trung bình  : ");

                    break;

                case 5:
                    sinhVienList.add(sinhVien3);
                    System.out.println("da them");
                    break;
                case 6:
                    System.out.println("Ban ID muon tin : ");
                    String id = sc.nextLine();
                    for(int i=0;i<sinhVienList.size();i++){
                        if(id.equals(sinhVienList.get(i).getMaSV())){
                            System.out.println(sinhVienList.get(i).toString());
                        }
                    }
                case 7:
                    sinhVienList.remove(2); // xoa sinh vien o vi tri 2
                    System.out.println(sinhVienList.toString());
                default:
                    kiemTra = false;
            }
        } while (kiemTra);
    }
}
