public class findDuplicate_nums{
    public static void main(String[] args) {
        int[] arr={3,1,3,4,2};
        System.out.println(findDuplicate(arr));
    }
    static int findDuplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int cor= arr[i]-1;
            if(arr[i]!=arr[cor]){
                int temp = arr[i];
                arr[i]=arr[cor];
                arr[cor]=temp;
            }else{
                i++;            }
        }
        return arr[arr.length-1];
    }
}