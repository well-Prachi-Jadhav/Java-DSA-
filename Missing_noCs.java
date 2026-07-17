public class Missing_noCs {
    public static void main(String[] args) {
        int[] arr = {0, 4, 2, 1};
        System.out.println(findMissing(arr));
    }

    static int findMissing(int[] arr) {
        int i = 0;

        while (i < arr.length) {

            if (arr[i] == arr.length) {
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
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }
}