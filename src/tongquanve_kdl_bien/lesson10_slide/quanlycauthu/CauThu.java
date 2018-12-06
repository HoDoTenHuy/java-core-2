package tongquanve_kdl_bien.lesson10_slide.quanlycauthu;

public class CauThu {
    private int soAo;
    private String hoTen;
    private int luong;

    public int getSoAo() {
        return soAo;
    }

    public void setSoAo(int soAo) {
        this.soAo = soAo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public CauThu(int soAo, String hoTen, int luong) {
        this.soAo = soAo;
        this.hoTen = hoTen;
        this.luong = luong;
    }

    public CauThu() {
    }

    @Override
    public String toString() {
        return "CauThu{" +
                "soAo=" + soAo +
                ", hoTen='" + hoTen + '\'' +
                ", luong=" + luong +
                '}';
    }
}
