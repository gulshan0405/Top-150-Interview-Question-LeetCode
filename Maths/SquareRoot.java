

public class SquareRoot {
    public static void main(String[] args) {
        int n=15;
        int key=111;
        for(int i=1;i<n;i++){
            if(i*i>key){
                System.out.println(i-1);
                break;
            }
        }
    }
}
