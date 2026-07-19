import java.util.Arrays;

public class mismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    static int[] findErrorNums(int[] arr){
        int i=0;
        while(i<arr.length){
            int cor=arr[i]-1;
            if(arr[i]!=arr[cor]){
                int temp=arr[i];
                arr[i]=arr[cor];
                arr[cor]=temp;
            }else{
                i++;
            }
        }
        //mismatch
        int [] mis = new int[2];
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                mis[0]=arr[i];
                mis[1]=i+1;
            }
        }
        return mis;
    }
}
