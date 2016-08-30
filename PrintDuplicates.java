
/**
 * Hui Sun developed this hallow diamond printing program for code test question 1 of R&F Capital Advisor on 2016/03/09 
 * Important Assumptions: 
 * 1. the input array A[N] only stores integers within the range of [0, (N-1)] 
 * 2. no build-in data structures other than array. Also there should be no implementation of any data structures 
 * 3. no build-in sort or find functions and these functions are not to be implemented 
 * 4. the time complexity should be linear 
 * 5. the input array should be iterated through only once
 *
 *
 */
import java.util.Scanner;

public class PrintDuplicates {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String theIntegers = scanner.nextLine();
        while (theIntegers == null || theIntegers.length() == 0 || theIntegers.contains("[a-zA-Z]+")) {
            System.out.println("please enter valid integers, separated by space");
            theIntegers = scanner.nextLine();
        }
        String[] input = theIntegers.split(" ");
        int[] intInput = new int[input.length];
        int[] occurence = new int[input.length];
 
        //constructing the integer array 
        for (int i = 0; i < input.length; i++) {
            if(Integer.parseInt(input[i])>input.length){
                System.out.print("Found invalid input integer that is greater than the size of the input array!");
                System.exit(0);
            }
            
            intInput[i] = Integer.parseInt(input[i]);
            occurence[i] = 0;
        }
        //iterating once the input array
        for(int j =0 ; j< input.length; j++){
            occurence[intInput[j]]++;
        }
        StringBuilder result = new StringBuilder("");
        for(int k = 0; k < occurence.length; k++){
            if(occurence[k] > 1){
            
            result.append(k).append(",");
            }  
        }
        //print out duplicates separated by commas. if no dups found print out nothing
        System.out.println(result.toString().length()>1?result.deleteCharAt(result.toString().length()-1):"");
    }
}
