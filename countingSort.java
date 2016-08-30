
public class countingSort {

    private static int[] countSort(int[] toBeSorted) {
        int counts[] = new int[10];
        for (int j = 0; j < counts.length; j++) {
            counts[j] = 0;
        }
        for (int i = 0; i < toBeSorted.length; i++) {
            counts[toBeSorted[i] - 1]++;
        }
        int index = 0;
        for (int i = 0; i < counts.length; i++) {
            while (counts[i] > 0 && index < toBeSorted.length) {
                toBeSorted[index] = i + 1;
                index++;
                counts[i]--;
            }
        }
        return toBeSorted;
    }

    public static void main(String[] args) {
        int a[] = new int[20];
        for (int i = 0; i < 20; i++) {
            a[i] = i % 6 + 1;
        }
        int b[] = countSort(a);
        for (int i = 0; i < 20; i++) {
            System.out.print(b[i] + " ");
        }
    }
}