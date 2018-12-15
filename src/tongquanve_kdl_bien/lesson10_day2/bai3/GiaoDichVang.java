package tongquanve_kdl_bien.lesson10_day2.bai3;

public class GiaoDichVang extends GiaoDich{
    private int loaiVang;
    private GiaoDich giaoDich;

    public GiaoDichVang() {
    }

    public GiaoDichVang(int maGiaoDich, String ngayGiaoDich, int donGia, int soLuong, int loaiVang) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.loaiVang = loaiVang;
        this.giaoDich = giaoDich;
    }

    public int getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(int loaiVang) {
        this.loaiVang = loaiVang;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setGiaoDich(GiaoDich giaoDich) {
        this.giaoDich = giaoDich;
    }

    @Override
    public int thanhTien(){
        return this.getSoLuong()*this.getDonGia();
    }

    @Override
    public String toString() {
        return "GiaoDichVang{" +
                "loaiVang=" + loaiVang +
                "maGiaoDich=" + this.getMaGiaoDich() +
                ", ngayGiaoDich='" + this.getNgayGiaoDich() + '\'' +
                ", donGia=" + this.getDonGia() +
                ", soLuong=" + this.getSoLuong() +
                '}';
    }
}
