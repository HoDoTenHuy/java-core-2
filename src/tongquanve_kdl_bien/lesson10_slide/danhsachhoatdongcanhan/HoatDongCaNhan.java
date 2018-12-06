package tongquanve_kdl_bien.lesson10_slide.danhsachhoatdongcanhan;

public class HoatDongCaNhan {
    private int id;
    private String name;

    public HoatDongCaNhan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public HoatDongCaNhan() {
    }

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

    @Override
    public String toString() {
        return "HoatDongCaNhan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
