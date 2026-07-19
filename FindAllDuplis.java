import java.util.ArrayList;
import java.util.List;

public class FindAllDuplis {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> missing = findDuplicates(arr);
        System.out.println(missing);
    }
    static List<Integer> findDuplicates(int[] arr){ 
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
        ArrayList<Integer> dups = new ArrayList();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                dups.add(arr[i]);
            }
        }
        return dups;
    }
}
