/**
 * Hui Sun developed this hallow diamond printing program for code test question 2 of R&F Capital Advisor on 2016/03/09
 * This program assumes if two parameters are fed into the code from console, in order to print out a "diamond", they have to be equal
 * This program also assumes the diamond's size can only be greater than 3 integers and the shape itself has to be as large as possible
 **/
import java.util.Scanner;

public class PrintDiamond {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter Height: ");
        String strheight = scanner.nextLine().trim();
        while (strheight == null || strheight.length() < 1 || !isGreaterThanThreePositiveInt(strheight)) {
            System.out.println("Please Enter Valid Integer for Height: ");
            strheight = scanner.nextLine();
        }

        System.out.println("Enter Width: ");

        String strWidth = scanner.nextLine().trim();
        while (strWidth == null || strWidth.length() < 1 || !isGreaterThanThreePositiveInt(strWidth) || !strheight.equals(strWidth)) {
            System.out.println("Please Enter Valid Integer for Width. Should be the same as Height for a Diamond! ");
            strWidth = scanner.nextLine();
        }
        printTheDiamond(Integer.parseInt(strheight));

    }

    static void printTheDiamond(int size) {
        int mid = 0;
        int newSize = 0;
        if (size % 2 == 0) {
            mid = (int) (size  / 2) -1;
            newSize = size-1;
        } else {
            mid = (int) (size / 2);
            newSize = size;
        }
        for (int i = 0; i < newSize; i++) {
            for (int j = 0; j < newSize; j++) {
                //left upper + right upper + left lower + right lower
                if (mid == (i + j) || (j - i) == mid || (i - j) == mid || j == (3 * mid - i)) {
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

    }

    static boolean isGreaterThanThreePositiveInt(String s) {
        try {
            int i = Integer.parseInt(s);
            if (i >= 3) {
                return true;
            }
        } catch (NumberFormatException er) {
        }
        return false;
    }
}
