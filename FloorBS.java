//the greatest number in the array that is smaller or equal to target element.
public class FloorBS {
    public static void main(String args[]){
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans= SearchF(arr,target);
        System.out.println("The index of the floor value of the target is: " +ans);
    }
    static int SearchF(int[] arr, int target){
        //but what if the target is smaller than smallest element in the array ?-->
        if(target>arr[0]){
             return -1;
        }
        int start=0, mid;
        int end=arr.length - 1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        
        return end;

    }
    
}
