
public class findMissingIntInConsecutiveArray {

    public static int find(int[] array) {

        for (int i = 0; i < array.length -1; i++) {
            if (array[i + 1] - array[i]  != 1) {
                {return array[i] + 1;}
            }
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        array[0]=4;
        array[1]=5;
        array[2]=6;
        array[3]=7;
        array[4]=8;
        System.out.println(find(array));
        
    }
}
