public class LinearSearch {
    public static void main (String args[]){
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=55;
        int ans=linearsearch(arr,target);
        System.out.println(ans);

    }
    static int linearsearch(int[] arr, int target ){
        int i;
        if(arr.length==0){
            return -1;
        }
        for( i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i ; 
            }
        }
        return -1;
    }

}
