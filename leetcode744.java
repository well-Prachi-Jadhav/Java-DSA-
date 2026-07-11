public class leetcode744 {
    public static void main(String args[]){
        char[] arr={'c','d','f','j'};
        char target='j';
        char ans=GetCeiling(arr,target);
        System.out.println("The Ceiling of the index of the target element is equal to : "+ans);
    }
    static char GetCeiling(char[] arr , char target){
        int start = 0, end=arr.length-1, mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }else  {
                start=mid+1;
            }

        }
        
        return arr[start%arr.length];
    }
}
