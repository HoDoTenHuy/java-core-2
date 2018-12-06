package tongquanve_kdl_bien.lesson10_slide;

import java.util.ArrayList;
import java.util.List;

public class DanhSachPhanTu {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        List<String> list3 = new ArrayList<>();
        list1.add("Do");
        list1.add("Dang");
        list2.add("Huy");
        list3.add("Huy");
        list3.add("KillZoom");

        // hop
        list2.add(String.valueOf(list1));
        System.out.println(list2);

        // giao
        /*list2.retainAll(list1);
        System.out.println(list2);*/
        list2.retainAll(list3);
        System.out.println(list2);

        // hieu : removeAll
        list3.removeAll(list2);
        System.out.println(list3);

    }
}
