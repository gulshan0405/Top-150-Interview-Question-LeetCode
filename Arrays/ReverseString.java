public class ReverseString {
     public String reverseWords(String s) {
        int n=s.length();
        String ans="";
        int i=0;
        int j=s.length()-1;
        char []arr=s.toCharArray();
        while(i<=j){
          char temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
          i++;
          j--;
        }
        s=new String(arr);
        for(int x=0;x<n;x++){
            String word="";
            while(x<n && s.charAt(x)!=' '){
                word+=s.charAt(x);
                x++;
            }
            arr=word.toCharArray();
            i=0;
            j=word.length()-1;
            while(i<=j){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            word=new String(arr);
            if(word.length()>0){
                ans+=word+" ";
            }
        }
        ans=ans.trim();
        return ans;
    }
}
