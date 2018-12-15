package tongquanve_kdl_bien.lesson10_day2.bai3;

public abstract class GiaoDich {
    private int maGiaoDich;
    private String ngayGiaoDich;
    private int donGia;
    private int soLuong;

    public GiaoDich() {
    }

    public GiaoDich(int maGiaoDich, String ngayGiaoDich, int donGia, int soLuong) {
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public int getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(int maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public abstract int thanhTien();

    @Override
    public String toString() {
        return "GiaoDich{" +
                "maGiaoDich=" + maGiaoDich +
                ", ngayGiaoDich='" + ngayGiaoDich + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                '}';
    }
}
