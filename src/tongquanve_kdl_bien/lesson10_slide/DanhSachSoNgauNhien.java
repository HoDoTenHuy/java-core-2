package tongquanve_kdl_bien.lesson10_slide;
import java.util.ArrayList;
import java.util.Collections;

public class DanhSachSoNgauNhien {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1; i<11; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        for (int i=0; i<5; i++) {
            System.out.print(list.get(i) + " ");
        }
         // danh sach so chan
        System.out.println("\nSo chan trong day : ");
        for (int i=0; i<5; i++) {
            if (list.get(i) % 2 == 0) {

                System.out.print(list.get(i) + " ");
            }
        }
    }
}
