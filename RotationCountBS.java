public class RotationCountBS {
    public static void main(String[] args) {
        int [] arr={4,5,6,7,8,1,2};
        System.out.println(countRotation(arr));
    }
    static int countRotation(int[] arr){
        int start=0 , pivotI=-1;
        int end=arr.length-1;
        int pi=arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>pi){
                pi=arr[mid];
                pivotI=mid;
                start=mid+1;
            }else {
                end=mid-1;
            }
        }
        return pivotI +1;
    }
    
}
