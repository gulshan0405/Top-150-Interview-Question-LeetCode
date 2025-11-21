import java.util.HashMap;

public class RomanToInteger {
    static public int romanToInt(String s) {
       HashMap<Character,Integer> h=new HashMap<>();
       h.put('I',1);
       h.put('V',5);
       h.put('X',10);
       h.put('L',50);
       h.put('C',100);
       h.put('D',500);
       h.put('M',1000);

       int ans=0;
       int prev=0;

       for(int i=s.length()-1;i>=0;i--){
        int cur=h.get(s.charAt(i));
        if(cur<prev){
            ans-=cur;
        }else{
            ans+=cur;
        }
        prev=cur;
       }
        return ans;
    }
}
