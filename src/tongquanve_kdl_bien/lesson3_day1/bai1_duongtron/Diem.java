package tongquanve_kdl_bien.lesson3_day1.bai1_duongtron;

import java.util.Scanner;

public class Diem {
    private int tungDo;
    private int hoanhDo;

    public int getTungDo() {
        return tungDo;
    }

    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }

    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public Diem(int tungDo, int hoanhDo) {
        this.tungDo = tungDo;
        this.hoanhDo = hoanhDo;
    }

    public Diem(){
    }
    public void nhapDiem(int hoanhDo, int tungDo){

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap hoanh do : ");


    }
}
