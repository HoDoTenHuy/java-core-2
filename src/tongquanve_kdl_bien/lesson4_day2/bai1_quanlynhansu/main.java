package tongquanve_kdl_bien.lesson4_day2.bai1_quanlynhansu;

public class main {
    public static void main(String[] args) {
        GiamDoc giamDoc = new GiamDoc();
        NhanVien nhanVien1 = new NhanVien();
        NhanVien nhanVien2 = new NhanVien();
        TruongPhong truongPhong = new TruongPhong();

        System.out.println("Nhap thong tin : \n");
        System.out.println("Giam doc : ");
        giamDoc.nhapThongTin();
        System.out.println("Truong Phong : ");
        truongPhong.nhapThongTin();
        System.out.println("Nhan Vien : ");
        nhanVien1.nhapThongTin();
        nhanVien2.nhapThongTin();
        System.out.println("Giam doc : " + giamDoc.toString());
        System.out.println("Truong Phong : " + truongPhong.toString());
        System.out.println("NV1 : " + nhanVien1.toString());
        System.out.println("NV2 : " + nhanVien2.toString());
    }
}
