import java.util.*;
public class LongestString {
    public static void main(String args[]){
        String s="abcabcbb";
        System.out.println(count(s));
    }
    
    static int count(String s){
        char[] arr = s.toCharArray();
        int f=arr.length,l1=0,l2,f1=0,final1=arr.length ,c2=0;
        
        for(int i=0 ; i<arr.length;i++){
            
            c2=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    l1=i;
                    l2=j;
                    f=l2-l1;
                  for(int k=i;k<j;k++){

                    for(int n = k+1 ; n<j ; n++){
                       if(arr[k]==arr[n]){
                        
                          c2++;
                       }
                       
                    }
                    if(f>f1){
                         final1=f-c2;
                        
                       }
                       f1=f;
                  }
                }
                
            }
            
        }
        return final1;
    }
}
