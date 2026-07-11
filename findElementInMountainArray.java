public class findElementInMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3,1};
        int target=3;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr , int target ){
        int peak=peakinArray(arr);
        int firsttry=binarysearch(arr ,  target ,0, peak );
        if(firsttry!=-1){
            return firsttry;
        }
        return OABS(arr  , target ,peak, arr.length-1);

    }
    static int peakinArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }else{
                start=mid+1;
            }
        }
        return start;
    }
    static int binarysearch(int[] arr , int target , int start , int end){
        while(start<=end){
            int mid=start+(end-start)/2; // as end+start may exceed the range of int in larger size array.
            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }
        //if element does not exist.
        return -1;
    }
    static int OABS(int arr[], int target , int start , int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                start=mid+1;
            }else if(arr[mid]<target){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    
    
}
