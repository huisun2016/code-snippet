
package ctci;

 
public class Solution {
    static int getIntegerComplement(int n){
        String binaryRepresentation = Integer.toBinaryString(n);
        char[] chars =  new char[32];
        for(int i = 0 ;i<binaryRepresentation.length();i++){
            if(binaryRepresentation.charAt(i)=='0'){
                chars[i] = 1;
            }else{
            chars[i] = 0 ;
            }        
        }
        return Integer.parseInt(new String(chars));
    }
    public static void main(String[] args){
        System.out.println("fuck");
        System.out.println(getIntegerComplement(5));
        System.out.println(getIntegerComplement(500));
    }
}
