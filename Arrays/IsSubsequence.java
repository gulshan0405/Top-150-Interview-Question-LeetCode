public class IsSubsequence {
     public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int n=t.length();
        boolean [] check= new boolean[m];
             int i=0;
             if(m==0){
                return true;
             }
            for(int j=0;j<n;j++){
              if(i<m && s.charAt(i)==t.charAt(j)){
                check[i]=true;
                i++;
                }
            }
        for(int x=0;x<m;x++){
            if(check[x]==false)return false;
        }
       return true;
    }
}
