public class FirstPositiveMissinfNo {
    public static void main(String[] args) {
        int[] arr={1,2,0};
        System.out.println(findMissing(arr));
    }
    static int findMissing(int[] arr) {
        int i=0;
        while (i<arr.length) {
            if (arr[i] >arr.length || arr[i]<0 ) {
                i++;
            } 
            else {
                int correct = arr[i];
                if (arr[i] != arr[correct]) {
                    int temp = arr[i];
                    arr[i] = arr[correct];
                    arr[correct] = temp;
                } else {
                    i++;
                }
            }
        }
        // Search for missing number
        
        for (i = 0; i < arr.length; i++) {
            if (arr[i]!=i+1) {
                    return i +1;
            }
        }
        return arr.length+1 ;
    }
}
