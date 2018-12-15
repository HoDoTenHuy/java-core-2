package tongquanve_kdl_bien.lesson10_day1;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        HashSet<Integer> daySo1 = new HashSet<>();
        HashSet<Integer> daySo2 = new HashSet<>();
        daySo1.add(1);
        daySo1.add(2);
        daySo2.add(4);
        daySo2.add(7);
        System.out.println("Giao : " + daySo1.retainAll(daySo2));
        System.out.println("Hội : " + daySo1.addAll(daySo2));
        System.out.println("Hiệu : " + daySo1.remove(daySo2));
        TreeSet<Integer> daySo = new TreeSet<>(daySo1); // co sap xep
        System.out.println("Dãy daySo1 tăng dần : " + daySo);
    }
}
