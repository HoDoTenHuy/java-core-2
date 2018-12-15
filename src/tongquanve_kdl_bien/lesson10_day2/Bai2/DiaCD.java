package tongquanve_kdl_bien.lesson10_day2.Bai2;

public class DiaCD {
    private int maCD;
    private String loaiCD;
    private String caSy;
    private int soBaiHat;
    private int giaThanh;


    public DiaCD(int maCD, String loaiCD, String caSy, int soBaiHat, int giaThanh) {
        this.maCD = maCD;
        this.loaiCD = loaiCD;
        this.caSy = caSy;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public int getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(int giaThanh) {
        this.giaThanh = giaThanh;
    }

    public DiaCD() {
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getLoaiCD() {
        return loaiCD;
    }

    public void setLoaiCD(String loaiCD) {
        this.loaiCD = loaiCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    @Override
    public String toString() {
        return "DiaCD{" +
                "maCD=" + maCD +
                ", loaiCD='" + loaiCD + '\'' +
                ", caSy='" + caSy + '\'' +
                ", soBaiHat=" + soBaiHat +
                ", giaThanh=" + giaThanh +
                '}';
    }
}
