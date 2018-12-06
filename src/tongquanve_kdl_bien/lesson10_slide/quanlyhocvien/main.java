package tongquanve_kdl_bien.lesson10_slide.quanlyhocvien;

import tongquanve_kdl_bien.lesson4_day2.bai2_giaodichbatdongsan.BatDongSan;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HocVien hocVien1 = new HocVien();
        HocVien hocVien2 = new HocVien();
        HocVien hocVien3 = new HocVien();
        HocVien hocVien4 = new HocVien();
        ArrayList<HocVien> dsHocVien = new ArrayList<>();
        int luaChon = 0;
        boolean kiemTra = true;
        do {
            System.out.println("1.Tạo danh sách học viên\n");
            System.out.println("2.Thêm mới học viên\n");
            System.out.println("3.Thêm học viên vào giữa danh sách lớp\n");
            System.out.println("4.Lấy thông tin học viên có mã sv là 012\n");
            System.out.println("5.Xóa một học viên\n");
            System.out.println("6.Xóa học viên cuối cùng trong lớp\n");
            System.out.println("7.Sửa thông tin học viên\n");
            System.out.println("8.In ra danh sách tất cả học viên\n");
            System.out.println("9.Đếm số lượng học viên trong lớp\n");
            System.out.println("10.Sắp xếp danh sách học viên theo id\n");
            System.out.println("Nhap so khac de thoat");
            System.out.println("Nhap lua chon");
            luaChon = sc.nextInt();
            switch(luaChon){
                case 1 :
                    hocVien1.setId(1);
                    hocVien1.setName("Huy");
                    hocVien1.setLop("16DT1");
                    dsHocVien.add(hocVien1);
                    hocVien2.setId(2);
                    hocVien2.setName("Quyet");
                    hocVien2.setLop("14DT2");
                    dsHocVien.add(hocVien2);
                    break;

                case 2 :
                    hocVien3.setId(3);
                    hocVien3.setName("Cuong");
                    hocVien3.setLop("15T3");
                    dsHocVien.add(hocVien3);
                    break;
                case 3 :
                    int trungGian = dsHocVien.size()/2;
                    hocVien4.setId(012);
                    hocVien4.setName("huhu");
                    hocVien4.setLop("18DT1");
                    dsHocVien.add(trungGian, hocVien4); // them hv vao vi tri temp
                    break;
                case 4 :
                    for(int i=0;i<dsHocVien.size();i++){
                        if(dsHocVien.get(i).getId() == 012){
                            System.out.println(dsHocVien.get(i));
                        }
                    }
                    break;
                case 5 :
                    dsHocVien.remove(2); // xoa hoc vien o vi tri 2
                    break;
                case 6 :
                    int lastNumber = dsHocVien.size() - 1; // vi tri cuoi
                    dsHocVien.remove(lastNumber);
                    break;
                case 7 :
                    hocVien1.setId(112);
                    hocVien1.setName("Huy1111");
                    hocVien1.setLop("17DT1");
                    System.out.println("Sua khi sua : " + dsHocVien.get(0));
                    break;
                case 8 :
                    System.out.println(dsHocVien.toString());
                    break;
                case 9 :
                    int number = dsHocVien.size();
                    System.out.println("So luong hoc vien : " + number);
                    break;
                case 10 :
                    break;
            default:
                        kiemTra = false;
                break;
            }
        }while(kiemTra);

    }
}
