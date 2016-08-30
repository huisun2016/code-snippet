
public class RemoveZero {
    
    private static int[] remove(int[] original){
        int k = 0;
        for(int nonZeroIndex = 0; nonZeroIndex < original.length; nonZeroIndex++){
          if(original[nonZeroIndex]!=0){
              original[k++] = original[nonZeroIndex];
          }       
        }
        for(int m = k; m< original.length; m++){
        original[m] = 0;
        }
        return original ;
        
    }
    private static void printArray(int[] toProcess){
      for(int tmp: toProcess)
          System.out.print(tmp+", ");
    }
        
    public static void  main (String[] args){
        int[] temp = {0,1,1,0,1,2,1,2,0,0,0,1};
        printArray(remove(temp));
    }
}
