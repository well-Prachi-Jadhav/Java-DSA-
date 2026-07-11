import java.util.*;
public class Main {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int a = sc.nextInt();
        prime(a);
    }
    static void prime(int a )
    {
        int c=0;
        for(int i=2;i<a;i++){
            if(a/i==0){
                System.out.println("Not a prime number");
                break;   
            }
            else{
                c++;
            }
        }
        if(c!=0){
            System.out.println("Prime number");
        }
    }
}
