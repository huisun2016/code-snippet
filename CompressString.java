
public class CompressString {

    public String compress(String str) {
        StringBuffer result = new StringBuffer();
        int count = 1;
        char last = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {

            if (str.charAt(i) == last) {
                count += 1;

            } else {
                result.append(last).append(count);
                count = 1;
                last = str.charAt(i);
            }
        }
        result.append(last).append(count);
        return result.toString();
    }
    public static void main(String[] args){
        
        CompressString c = new CompressString();
        String toCompress = new String("abc");
        String compressed = c.compress(toCompress);
        System.out.println((compressed.length()>toCompress.length())?toCompress:compressed);
    }
}
