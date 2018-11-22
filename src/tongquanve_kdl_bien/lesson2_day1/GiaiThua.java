package tongquanve_kdl_bien.lesson2_day1;

public class GiaiThua {
   static long tinhGiaiThua(int n){
        if(n < 1){
            return 1;
        }
        return n*tinhGiaiThua(n-1);
    }

    public static void main(String[] args) {
        long tongGiaiThua = tinhGiaiThua(4) + tinhGiaiThua(7) + tinhGiaiThua(12) +
                tinhGiaiThua(18);
        System.out.println("Tong giai thua : " + tongGiaiThua);
    }
}
