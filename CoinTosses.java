
import java.util.ArrayList;

public class CoinTosses {

    private int times;
   
    private ArrayList<String> resultSet = new ArrayList<>();

    public CoinTosses(int times) {
        this.times = times;
    }

    public void play(StringBuffer prefix, int counter) {
        String soFar = prefix.toString();  
        if (counter == times) {   
            resultSet.add(prefix.toString());
        } else {      
            play((new StringBuffer(soFar).append('H')), counter+1);
            play((new StringBuffer(soFar).append('T')), counter+1);
        }
    }

    public void evaluateOutComes() {
        
        int timesOfHH = 0;
        int timesOfHT = 0;
        for(String s: resultSet){
            System.out.println(s);
            for(int i = 0; i < times - 1; i++ ){
                if(s.charAt(i)=='H' && s.charAt(i+1)=='H') 
                { timesOfHH++;   
                }
                if(s.charAt(i)=='H' && s.charAt(i+1)=='T') {
                    timesOfHT++;
                }      
            }              
        }
        System.out.println("HH: "+(timesOfHH)+1);
        System.out.println("HT: "+(timesOfHT)+1);
    }
    

    public static void main(String[] args) {
        CoinTosses newGame = new CoinTosses(5);
        newGame.play(new StringBuffer(), 0);
        newGame.evaluateOutComes();
    }
}
