package tongquanve_kdl_bien.lesson10_slide.danhsachhoatdongcanhan;
import java.util.HashMap;
import java.util.Map;


public class ChiTieuCaNhan {
    public static void main(String[] args) {
        Map<Integer, HoatDongCaNhan> hoatDongMap = new HashMap<Integer, HoatDongCaNhan>();
        HoatDongCaNhan hoatDongCaNhan1 = new HoatDongCaNhan(1, "Breakfast");
        HoatDongCaNhan hoatDongCaNhan2 = new HoatDongCaNhan(2, "Café");
        HoatDongCaNhan hoatDongCaNhan3 = new HoatDongCaNhan(3, "Football");
        HoatDongCaNhan hoatDongCaNhan4 = new HoatDongCaNhan(4, "Food");
        HoatDongCaNhan hoatDongCaNhan5 = new HoatDongCaNhan(5, "Relaxing");

        hoatDongMap.put(hoatDongCaNhan1.getId(), hoatDongCaNhan1);
        hoatDongMap.put(hoatDongCaNhan2.getId(), hoatDongCaNhan2);
        hoatDongMap.put(hoatDongCaNhan3.getId(), hoatDongCaNhan3);
        hoatDongMap.put(hoatDongCaNhan4.getId(), hoatDongCaNhan4);
        hoatDongMap.put(hoatDongCaNhan5.getId(), hoatDongCaNhan5);

        for(int i=1;i<=hoatDongMap.size();i++) {
            if (hoatDongMap.get(i).getName().equalsIgnoreCase("Football")) {
                HoatDongCaNhan hoatDongCaNhanX = hoatDongMap.get(i);
                System.out.println("Tim thay " + hoatDongCaNhanX.getName());
            }
        }
        for(int i=1;i<=hoatDongMap.size();i++){
            if(hoatDongMap.get(i).getName().equalsIgnoreCase("Relaxing")){
                HoatDongCaNhan hoatDongCaNhanX = hoatDongMap.get(i);
                hoatDongMap.remove(hoatDongCaNhanX);
                System.out.println(hoatDongCaNhanX.getName() + " deleted!");
            }
            if(hoatDongMap.get(i).getName().equalsIgnoreCase("Café")){
                hoatDongMap.get(i).setName("20k");
                System.out.println(hoatDongMap.get(i));
            }
        }
        if (!hoatDongMap.isEmpty()) {
            for (Map.Entry<Integer, HoatDongCaNhan> entry : hoatDongMap.entrySet()) {
                System.out.println("ID: " + entry.getKey() + " - Fullname: " + entry.getValue());
            }
        }



    }
}
