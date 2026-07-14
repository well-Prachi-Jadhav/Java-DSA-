import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={-1,7,8,4,5,-32};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Bubble(int[] arr){
        boolean swapped = false;
        // run the steps n-1 times
        for(int i=0; i<arr.length ; i++){
            swapped = false;
            // for each step , max item will come at the last respective index
            for(int j=1; j<arr.length-i;j++){
                // sawp if the item is smaller than previous item
                if(arr[j-1]>arr[j]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // when no swap was there so , array is already sorted
            if(!swapped){
                break;
            }
        }
    }
}
