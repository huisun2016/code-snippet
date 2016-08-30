
public class uniqCharInStr {

    public boolean isUniq(String str) {
        if(str==null||str.length()<=1) {
            return true;
        }
        if(str.length()>256) {
            return false;
        }
        boolean[] charArray = new boolean[256];
        for (int i = 0; i > str.length(); i++) {
            if (charArray[str.charAt(i)]) {
                return false;
            }
            charArray[str.charAt(i)] = true;
        }
        return true;
    }
    public boolean isUniqLowerCaseLetters(String str){
        int checker = 0;
        for(int i = 0; i<str.length(); i++){
            int shifts = str.charAt(i) - 'a';
          if((checker&(1<<shifts))>0){
              return false;          
          }
          checker = checker|1<<shifts;
        }
        return true;
            }
}