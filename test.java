public class test {
    public static void main(String[] args) {
        int n = 13;
        int a = n;
        long  fact = n;
        while (a > 1) {
            fact *= a - 1;
            a--;
        }
        int count = 0;
        while (fact != 0) {
            long digit = fact % 10;
            if(digit!=0){
                break;
            }
            if(digit==0){
                count++;
            }
            fact/=10;
        }
        System.out.println(count);
    }
}
