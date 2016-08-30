/*
 * Class ThirtySecondsFormatter is written by Hui Sun on Feb 23rd 2016 for the TrueEx code challenge
 * The class convert a double into a 32nd price format
 * 
 */

public class ThirtySecondsFormatter {
    /*
     * @param d: the input decimal double 
     * @return: the 32nd pricing format
     */

    public String convert(double d) {
        StringBuilder result = new StringBuilder();
        if (d < 0) {
            d = 0 - d;
            result.append("-");
        }
        int intPart = (int) d;
        //assuming only exact multiples of 1/32 will be passed to the code.
        // since 1/32 will be 0, convert it to the equivalent of * 32
        int fraction = (int) ((d - intPart) * 32);


        result.append(padWithZero(intPart)).append("-").append(padWithZero(fraction));
        return result.toString();
    }
    /*
     * The padWithZero method will generate the number of 0s for the integer and the fraction part of the double
     * @param a the input integer
     * @return the input integer padded with zero in the front
     */

    private String padWithZero(int a) {

        if (Math.abs(a) == 0) {
            return "00";
        }
        if (Math.abs(a) < 10) {
            return "0" + a;
        }
        return a + "";
    }
}
