package tongquanve_kdl_bien.lesson10_slide.quanlycauthu;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CauThu cauThu1 = new CauThu();
        CauThu cauThu2 = new CauThu();
        CauThu cauThu3 = new CauThu();
        CauThu cauThu4 = new CauThu();
        ArrayList<CauThu> dsCauThu = new ArrayList<CauThu>();
        int luaChon = 0;
        boolean kiemTra = true;
        do {
            System.out.println("1.Tạo danh sách gồm n cầu thủ bóng đá\n");
            System.out.println("2.Thêm danh sách k cầu thủ");
            System.out.println("3.Hủy hợp đồng với cầu thủ có mức lương thấp nhất\n");
            System.out.println("4.Sửa thông tin lương cầu thủ matrial thành 22446\n");
            System.out.println("5.Cho biết mức lương hiện tại của cầu thủ mang áo số 8\n");
            System.out.println("6.In ra danh sách tất cả cau thu\n");
            System.out.println("Nhap so khac de thoat");
            System.out.println("Nhap lua chon");
            luaChon = sc.nextInt();
            switch(luaChon){
                case 1 :
                    cauThu1.setSoAo(8);
                    cauThu1.setHoTen("Huy");
                    cauThu1.setLuong(2234);
                    cauThu2.setSoAo(9);
                    cauThu2.setHoTen("Matrial");
                    cauThu2.setLuong(1234);
                    dsCauThu.add(cauThu1);
                    dsCauThu.add(cauThu2);
                    break;

                case 2 :
                    cauThu3.setSoAo(11);
                    cauThu3.setHoTen("HUHUH");
                    cauThu3.setLuong(2341);
                    cauThu4.setSoAo(7);
                    cauThu4.setHoTen("Killzoom");
                    cauThu4.setLuong(9832);
                    dsCauThu.add(cauThu3);
                    dsCauThu.add(cauThu4);
                    break;
                case 3 :
                    // sap xep cau thu theo luong giam dan
                    Collections.sort(dsCauThu, new Comparator<CauThu>() {
                        @Override
                        public int compare(CauThu o1, CauThu o2) {
                            if(o1.getLuong() < o2.getLuong()){
                                return 1;
                            }else {
                                if (o1.getLuong() == o2.getLuong()) {
                                    return 0;
                                } else return -1;
                            }
                        }
                    });
                    Object temp = dsCauThu.get(dsCauThu.size() -1);
                    dsCauThu.remove(dsCauThu.size() -1);
                    System.out.println("Cau thu da huy hop dong : " + temp);

                case 4 :
                    for(int i=0;i<dsCauThu.size();i++){
                        if(dsCauThu.get(i).getHoTen().equalsIgnoreCase("matrial")){
                            dsCauThu.get(i).setLuong(22466);
                        }
                    }
                    break;
                case 5 :
                    for(int i=0;i<dsCauThu.size();i++){
                        if(dsCauThu.get(i).getSoAo() == 8){
                            System.out.println("Luong cau thu so 8 : " + dsCauThu.get(i).getLuong());
                        }
                    }
                    break;
                case 6 :
                    System.out.println(dsCauThu.toString());
                    break;
                default:
                    kiemTra = false;
                    break;
            }
        }while(kiemTra);

    }
}
