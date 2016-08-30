
import java.util.Arrays;

public class segmentAndSort {

    StringBuffer result = new StringBuffer("");
    int start = 0;
    int end = 0;
    boolean lastIsDigit;

    private String sortSegments(String s) {
        lastIsDigit = Character.isDigit(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            boolean currentIsDigit = Character.isDigit(s.charAt(i));
            if (currentIsDigit != lastIsDigit) {
                end = i;
                String tmp = s.substring(start, end);
                Arrays.sort(tmp.toCharArray());
                result.append(tmp);
            }
            lastIsDigit = currentIsDigit;
            start = end;
        }
        return result.toString();
    }
}
