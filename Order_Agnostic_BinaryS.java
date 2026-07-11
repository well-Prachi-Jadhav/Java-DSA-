public class Order_Agnostic_BinaryS {
    public static void main(String[] args) {
        int arr[]={48,36,12,11,9,8,4,2};
        int target=36;
        int ans=OABS(arr,target);
        System.out.println("The target is at the index: "+ans);
    }
    static int OABS(int arr[], int target){
        int start=0,mid;
        int end=arr.length-1;
        boolean isAsc = arr[0]<arr[end];
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
