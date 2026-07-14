// https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSumBS {
   public static void main(String[] args) {
    int[] nums={7,2,5,10,8};
    
    System.out.println(splitArray(nums, 2));
   }
   static int splitArray(int[] nums, int k) {
       int start=minimum(nums);
       int end=maximum(nums);
       while(start<end){
        int mid=start+(end-start)/2;
        //Calculate how many pieces you can divide this in with the max sum
        int sum=0;
        int pieces=1;
        for(int num:nums){
            if(sum+num>mid){
                // you can not add this in this subarray , make a new one
                //say you add this num in new subarray , then sum=num
                sum=num;
                pieces++;
            }else{
                sum+=num;
            }
        }
        if(pieces>k){
            start=mid+1;
        }else{
            end=mid;
        }
       } 
    return start;
   }
   static int minimum(int[] nums){
    // maximum element in the array is the minimum largest sum 
    int max = nums[0];
    for(int i : nums){
        if(i>max){
            max=i;
        }
    }
    return max;
   }
   static int maximum(int[] nums){
    //maximum sum is addition of all elements in array.
    int sum = 0;
    for(int i : nums){
        sum=sum+i;
    }
    return sum;
   }
}
