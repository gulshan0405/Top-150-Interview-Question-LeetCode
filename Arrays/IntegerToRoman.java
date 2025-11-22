import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerToRoman {
    public static void main(String[] args) {
        int n = 1922;
        String ans = intToRoman(n);
        System.out.println(ans);
    }

    static public String intToRoman(int num) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("M", 1000);
        map.put("CM", 900);
        map.put("D", 500);
        map.put("CD", 400);
        map.put("C", 100);
        map.put("XC", 90);
        map.put("L", 50);
        map.put("XL", 40);
        map.put("X", 10);
        map.put("IX", 9);
        map.put("V", 5);
        map.put("IV", 4);
        map.put("I", 1);

        int n = num;
        String result = "";

            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (n==0) break;
                if (n >= entry.getValue()) {
                    int times = n / entry.getValue();
                    n = n % entry.getValue();

                    while (times-- > 0) {
                        result += entry.getKey();
                    }
                }
            }
        return result;
    }
}
