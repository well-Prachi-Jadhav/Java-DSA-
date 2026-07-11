public class LinearSearchInString {
    public static void main(String[] args) {
        String name="Prachi";
        char target= 'j';
        System.out.println(linearSearch(name,target));

    }
    static boolean linearSearch(String name,char target){
        if(name.length()==0){
            return false;
        }
        for(int i=0;i<name.length();i++){
            if(name.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
//yaha mene charAt use kiya it is line arr[i] but for string we use charAt method to get the character at a specific index.
