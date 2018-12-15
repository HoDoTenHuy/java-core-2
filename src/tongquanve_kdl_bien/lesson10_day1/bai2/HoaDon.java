package tongquanve_kdl_bien.lesson10_day1.bai2;

public abstract class HoaDon {
    private String maHoaDon;
    private String ngayHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private String donGia;
    private long thanhToan;

    public HoaDon(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, String donGia, long thanhToan) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
        this.thanhToan = thanhToan;
    }

    public HoaDon(String maHoaDon, String ngayHoaDon, String tenKhachHang, String maPhong, String donGia) {
        this.maHoaDon = maHoaDon;
        this.ngayHoaDon = ngayHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public HoaDon() {
    }
    public abstract int thanhTien();

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getNgayHoaDon() {
        return ngayHoaDon;
    }

    public void setNgayHoaDon(String ngayHoaDon) {
        this.ngayHoaDon = ngayHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    public long getThanhToan() {
        return thanhToan;
    }

    public void setThanhToan(long thanhToan) {
        this.thanhToan = thanhToan;
    }
}
