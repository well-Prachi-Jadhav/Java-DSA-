//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
import java.util.Arrays;
public class leetcode34 {
    public static void main(String args[]){
        int[] nums={5,7,7,8,8,10};
        int target=7;
        int[] arr=searchRange(nums,target);
        System.out.println("Output: "+ Arrays.toString(arr));
    }
    static int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int start=search(nums, target , true );
        int end=search(nums, target, false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums, int target  , boolean findStart){
        int start=0,mid,ans=-1;
        int end = nums.length-1;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                ans=mid;
                if(findStart){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        
       
        return ans;
    }
}
