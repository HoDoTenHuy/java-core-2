package tongquanve_kdl_bien.lesson10_slide.quanlyhocvien;

import java.util.ArrayList;

public class HocVien {
    private int id;
    private String name;
    private String lop;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public HocVien() {
    }

    public HocVien(int id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
