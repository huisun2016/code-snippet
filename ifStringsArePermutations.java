
import java.util.Arrays;

public class ifStringsArePermutations {

    public boolean ifPermutation(String str1, String str2) {
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }

        return sort(str1).equals(sort(str2));
    }

    public String sort(String s) {
        char[] result = s.toCharArray();
        Arrays.sort(result);
        return new String(result);
    }
    
    public boolean ifPermutation2(String str1, String str2){
        if (str1 == null || str2 == null || str1.length() == 0 || str2.length() == 0) {
            return false;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
         int[] charArray = new int[256];
         
         for(int i = 0 ; i< str1.length(); i++){
             int val = str1.charAt(i);
             charArray[val]++;
         }
         for(int j = 0 ; j<str2.length(); j++){
             int val = str2.charAt(j);
             if(--charArray[val] < 0) {
                 return false;
             }
         }
         return true;
        }
}
