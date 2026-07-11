public class evendigitsleetcode {
    public static void main(String[] args) {
        int arr[]={437,315,322,431,686,264,442};
        System.out.println("The number of even digits in the array is: "+findNumbers(arr));


    }
    static int findNumbers(int[] nums) {
        int even=0;
       for(int i=0;i<nums.length;i++){
        int count=0;
        if(nums[i]<0){
            nums[i]=nums[i]*-1;
        }
        while(nums[i]>0){
            count++;
            nums[i]=nums[i]/10;
        }
        if(count%2==0){
            even++;
        }
       }
       return even;
       
    }
}