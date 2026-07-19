import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Allmissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missing = findDisappearedNumbers(arr);
        System.out.println(missing);
    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while(i<arr.length){
            int cor=arr[i];
            if(arr[i]!=arr[cor-1]){
                int temp=arr[cor-1];
                arr[cor-1]=arr[i];
                arr[i]=temp;
            }
            else{
                i++;
            } 
        }
        ArrayList<Integer> missing = new ArrayList();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                missing.add(i+1);
            }
        }
        return missing;
    }
}
    