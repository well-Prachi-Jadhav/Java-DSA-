//the smallest number in the array that is greater or equal to target element.
public class CeilingBS  {
    public static void main (String args[]){
        int[] arr= {2,3,5,9,14,16,18};
        int target =4;
        int ans=GetCeiling(arr,target);
        System.out.println("The Ceiling of the index of the target element is equal to : "+ans);
    }
    static int GetCeiling(int[] arr , int target){
        //but what if the target is greater than largest element in the array ?-->
        if(target>arr[arr.length-1]){
             return -1;
        }
        int start = 0, end=arr.length-1, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                return arr[mid];
            }

        }
        return start;
    }
}
