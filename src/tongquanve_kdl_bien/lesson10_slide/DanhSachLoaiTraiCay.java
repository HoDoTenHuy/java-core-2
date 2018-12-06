package tongquanve_kdl_bien.lesson10_slide;

import java.util.ArrayList;

public class DanhSachLoaiTraiCay {
    public static void main(String[] args) {
        ArrayList<String> khoTraiCay = new ArrayList<>();
        khoTraiCay.add("tao");
        khoTraiCay.add("oi");
        khoTraiCay.add("xoai");
        khoTraiCay.add("cam");
        for(int i=0;i<khoTraiCay.size();i++){
            if(khoTraiCay.get(i).equalsIgnoreCase("Tao")){
                System.out.println("co Tao trong kho!");
                break;
            }else
                System.out.println("Khong co!");
            break;
        }
    }
}
