//Search in rotated sorted array .
public class RotatedArray {
    public static void main(String[] args) {
        int []nums={3,4,5,6,7,0,1,2};
        int target=2;
        int element=Element(nums,target);
        System.out.println(element);
    } 
    static int Element(int[] nums, int target){
        int pivot=findPivot(nums);
        int ele=binaryS(nums,0, pivot,target);
        if(ele!=-1){
            return ele;
        }
        return binaryS(nums , pivot+1, nums.length-1,target);
    }
    static int binaryS(int nums[],int start, int end , int target){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] nums){
        int start=0 , pi=-1;
        int end=nums.length-1;
        int pivot=nums[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>pivot){
                pivot=nums[mid];
                pi=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return pi;
    }
}
