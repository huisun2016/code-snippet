
public class GetExpo {

    private static int getIntegerExponential(int p, int q) {
        if (q <= 0) {
            return Integer.MIN_VALUE;
        }
        if (q == 1) {
            return p;
        }
        if (ifEven(q)) {
            int tmp = getIntegerExponential(p, q / 2);
            return (int) Math.pow((double) tmp, 2.0);
        } else {
            int tmp = getIntegerExponential(p, (q - 1) / 2);

            return (int) Math.pow((double) tmp, 2) * q;
        }

    }

    private static boolean ifEven(int num) {
        return (num & 1) == 0;
    }
    
    public static double getExponential(int p, int q) {
        if (p == 0) {
            return Integer.MIN_VALUE;
        } 
        if (q == 0) {
            return 1;
        }        
        if (p > 0) {// positive p
            if (q > 0) {
                return getIntegerExponential(p, q);
            } else {
                return (double) 1 / getIntegerExponential(p, -q);
            }
        } 
        else {//negative p
            return Math.pow(-1.0, q)*(double) 1 / getIntegerExponential(p, Math.abs(q));
        }
    }

    public static void main(String[] args) {

        System.out.println(getExponential(0, -1));
        System.out.println(getExponential(-2, 0));
        System.out.println(getExponential(2, -1));
        System.out.println(getExponential(3, 4));
        System.out.println(getExponential(3, -4));
        System.out.println(getExponential(-3, 4));
        System.out.println(getExponential(-4, -3));
        System.out.println(getExponential(-4, 3));
        System.out.println(Math.pow(-1.0, 3));
    }
}
