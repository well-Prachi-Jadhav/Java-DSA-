//example: search 3 in the range of index [1,4] in the array {18,12,-7,3,14,28}
import java.util.*;
public class LinarSearchInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        System.out.println("Enter Elements of the array: ");
        int arr[]=new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rang in which you want to search the target element: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the target element: ");
        int t=sc.nextInt();
        int ans = range(arr,n,a,b,t);
        System.out.println("Element found at index "+ans);
    }
    static int range(int arr[],int n , int a , int b , int t){
        for(int i = a;i<=b;i++){
            if(t==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
