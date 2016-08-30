
public class longestPalin {

    private String findLongestPalin(String str) {
        //System.out.println(str);
        StringBuffer reversed = new StringBuffer("");
         
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
            //System.out.println(i);
        }
       // System.out.println(reversed);
        String reversedStr = reversed.toString();
   
        int largeLen = 1;
        int currentLen = 1;
        int largeStart= 0;
        int largeEnd= 0;
        int currentStart= 0 ;
        int currentEnd = 0;
       // System.out.println(str);
        //System.out.println(reversedStr);
        for (int j = 0; j < reversedStr.length(); j++) {
           // System.out.println(j);
            if (str.charAt(j) == reversedStr.charAt(j)) {
                 
                currentLen++;
                currentEnd = j;
                if (currentLen > largeLen) {
                    largeLen = currentLen;
                    largeStart = currentStart;
                    largeEnd = j;            
                }
                largeEnd = j;
            } else {
                currentStart = j;
                currentEnd = j;
                currentLen = 0;
            }

        }
        //System.out.print(largeStart+ "::" +largeEnd);
        return str.substring(largeStart,largeEnd );
    }
    public static void main(String[] args) {
        System.out.print(new longestPalin().findLongestPalin("121AABBA251"));
    }
}
