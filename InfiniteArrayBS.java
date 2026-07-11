public class InfiniteArrayBS {
   public static void main(String args[]){
        int []arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=9;
        System.out.println("Index of the target element is = " + ans(arr,target));
    }
    static int ans(int[] arr , int target){
        //find the range 
        //we will start with the box size 2
        int start=0;
        int end=1;
        
        //condition for the target to lie in the range
        while(target>arr[end]){
            int tempStart=end+1; //this will be the new start.
            //double the box value
            //end=previous end + sizeOfBox*2
            end=end+(end-start+1)*2;
            start=tempStart;
        }
        return Search(arr,target,start,end);
    }
    static int Search(int arr[],int target,int start,int end){
        int  mid;
        
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
