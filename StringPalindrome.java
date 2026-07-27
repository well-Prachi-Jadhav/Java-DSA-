import java.util.*;
public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String s= sc.nextLine();
        int n=s.length(),f=1;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)==s.charAt(n-1-i)){
                 f=0;
            }
            else{
                System.out.println("Not Palindrome");
                break;
            }
        }
        if(f==0){
            System.out.println("Palindrome");
        }

    }
}
