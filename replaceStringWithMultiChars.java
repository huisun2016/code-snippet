
public class replaceStringWithMultiChars {

    public void replace(String str) {
        int newLength = str.length();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                newLength += 2;
            }
        }
        StringBuffer result = new StringBuffer();
        for (int j = 0; j < str.length(); j++) {
            char currentChar = str.charAt(j);
            if (currentChar == ' ') {
                result.append("%20");
            } else {
                result.append(currentChar);
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        replaceStringWithMultiChars r = new replaceStringWithMultiChars();
        r.replace("iheg 90 83 ");
    }
}