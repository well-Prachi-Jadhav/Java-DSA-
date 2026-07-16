import java.util.Arrays;

public class Cyclic_Sort {
    public static void main(String[] args) {
        int[]arr={11,12,13,15,14,1,2,4,6,3,5,7,8,9,10};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Cyclic(int[]arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
               
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
                
            }else{
                i++;
            }
        }
    }
}
