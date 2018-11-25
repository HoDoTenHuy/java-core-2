package tongquanve_kdl_bien.lesson3_day1.bai1_duongtron;

public class DuongTron {
    private Diem tamO;
    private Double banKinh;

    public DuongTron(Diem tamO, Double banKinh) {
        this.tamO = tamO;
        this.banKinh = banKinh;
    }

    public DuongTron() {
    }

    public Diem getTamO() {
        return tamO;
    }

    public void setTamO(Diem tamO) {
        this.tamO = tamO;
    }

    public Double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(Double banKinh) {
        this.banKinh = banKinh;
    }
    public void kiemTraDiem(Diem diemA){
        int binhPhuongKC = (diemA.getHoanhDo() - tamO.getHoanhDo()) * (diemA.getHoanhDo() - tamO.getHoanhDo())
                + (diemA.getTungDo() - tamO.getTungDo()) * (diemA.getTungDo() - tamO.getTungDo());
        if (binhPhuongKC == banKinh * banKinh) {
            System.out.println("Diem A thuoc duong tron tam O, BK = " + banKinh + "!");
        } else
            System.out.println("Diem A khong thuoc duong tron!");
    }
}
