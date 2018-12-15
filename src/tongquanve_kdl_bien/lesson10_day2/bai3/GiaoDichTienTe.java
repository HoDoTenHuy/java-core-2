package tongquanve_kdl_bien.lesson10_day2.bai3;

public class GiaoDichTienTe extends GiaoDich{
    private int tyGia;
    private String loaiTien;
    private GiaoDich giaoDich;

    public GiaoDichTienTe(){
    }

    public GiaoDichTienTe(int maGiaoDich, String ngayGiaoDich, int donGia, int soLuong, int tyGia, String loaiTien) {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);
        this.tyGia = tyGia;
        this.loaiTien = loaiTien;
    }

    public int getTyGia() {
        return tyGia;
    }

    public void setTyGia(int tyGia) {
        this.tyGia = tyGia;
    }

    public String getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(String loaiTien) {
        this.loaiTien = loaiTien;
    }

    public GiaoDich getGiaoDich() {
        return giaoDich;
    }

    public void setGiaoDich(GiaoDich giaoDich) {
        this.giaoDich = giaoDich;
    }

    @Override
    public int thanhTien(){
        if(this.loaiTien.equalsIgnoreCase("USD")||
        this.loaiTien.equalsIgnoreCase("EURO")){
            return this.tyGia*this.getSoLuong()*this.getDonGia();
        }
        if(this.loaiTien.equalsIgnoreCase("VN")){
            return this.getSoLuong()*this.getDonGia();
        }
        return 0;
    }

    @Override
    public String toString() {
        return "GiaoDichTienTe{" +
                "tyGia=" + tyGia +
                ", loaiTien='" + loaiTien + '\'' +
                 "maGiaoDich=" + this.getMaGiaoDich() +
        ", ngayGiaoDich='" + this.getNgayGiaoDich() + '\'' +
                ", donGia=" + this.getDonGia() +
                ", soLuong=" + this.getSoLuong() +
                '}';
    }
}
