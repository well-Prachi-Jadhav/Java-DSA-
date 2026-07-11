public class BinarySearch {
    public static void main(String args[]){
        int arr[]={2 , 4 , 6 , 9 , 11 , 12 , 14, 20 , 36 , 48};
        int target= 48;
        int ans= Search(arr,target);
        System.out.println("Index of the target element is = " + ans);
    }
    static int Search(int arr[],int target){
        int start=0 , mid;
        int end=arr.length-1;
        while(start<=end){
            mid=start+(end-start)/2; // as end+start may exceed the range of int in larger size array.
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
    
}
