package tongquanve_kdl_bien.lesson10_day1.bai3;

public class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemTB;

    public SinhVien(int maSV, String hoTen, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemTB = diemTB;
    }



    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV=" + maSV +
                ", hoTen='" + hoTen + '\'' +
                ", diemTB=" + diemTB +
                '}';
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = (float) diemTB;
    }
}
