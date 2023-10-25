import java.util.HashMap;

public class HashMap_s11 {
    public static void main(String[] args) {
        //Khai báo
        HashMap<Integer, String> map = new HashMap<>();

        //them
        map.put(1, "Ban");
        map.put(2, "Bandeptry");
        //lay gtri
        String vlu = map.get(1);
        System.out.println(vlu);
    }
}
