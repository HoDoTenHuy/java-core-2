package tongquanve_kdl_bien.lesson3_day1.bai2_vehicle;

import java.util.Scanner;

public class Vehicle {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private int triGia;
    private int thueNop;

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public int getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public int getThueNop() {
        return thueNop;
    }

    public void setThueNop(int thueNop) {
        this.thueNop = thueNop;
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, int triGia) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
    }

    public Vehicle(){
    }
    public void nhapThongTin(Scanner sc){
        Vehicle vehicle = new Vehicle();
        sc.nextLine();
        System.out.println("Ho Ten Chu Xe : ");
        //this.tenChuXe = sc.nextLine();
        setTenChuXe(sc.nextLine());
        System.out.println("\nNhap Loai Xe : ");
        //this.loaiXe = sc.nextLine();
        setLoaiXe(sc.nextLine());
        System.out.println("\nNhap Dung Tich Xe : ");
        //this.dungTich = sc.nextInt();
        setDungTich(sc.nextInt());
        System.out.println("\nNhap Tri Gia Xe : ");
        //this.triGia = sc.nextInt();
        setTriGia(sc.nextInt());
    }
    protected int thueXePhaiNop(int dungTich){
        if(0 < dungTich && dungTich < 100){
            return this.triGia/100;
        }
        if(100 <= dungTich && dungTich < 200){
            return this.triGia*3/100;
        }
        else
            return this.triGia*5/100;
    }

    public void xuatThongTin(){
        System.out.println(getTenChuXe() + "\t\t\t" + getLoaiXe() + "\t\t\t" + getDungTich() + "\t\t\t"
        + getTriGia() + "\t\t\t" + thueXePhaiNop(getDungTich()) + "\n");
        /*return getTenChuXe() + "\t\t\t" + getLoaiXe() + "\t\t\t" + getDungTich() + "\t\t\t"
        + getTriGia() + "\t\t\t" + thueXePhaiNop(getDungTich()) + "\n";*/

    }

}
