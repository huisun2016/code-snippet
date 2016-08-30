
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/*
 *
 * @author Hui Sun Dec 7th, 2014 2 Sigma Interview Question
 * Two Sigma coding test 2
 * Assumption 1:  assuming each datacenter at least has one datasets and a line in the input
 * Assumption 2:  inputs are all valid
 */
public class Solution {

    private static Map<Integer, ArrayList<Integer>> dataCenters = new HashMap<Integer, ArrayList<Integer>>();
    private static int numOfDataCenter;

    private static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }

    private void copyDataSets(int datasetID, int from, int to) {
        ArrayList<Integer> fromDataCenter = dataCenters.get(to);
        ArrayList<Integer> toDataCenter = new ArrayList<>();
    }

    public static void main(String args[]) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String currentLine = scanner.nextLine();
        if (isInteger(currentLine)) {
            numOfDataCenter = Integer.parseInt(currentLine);
 
        }
        //only read indicated number of lines from input
        for (int i = 1; i <= numOfDataCenter; i++) {

            currentLine = scanner.nextLine();
            String[] splited = currentLine.trim().split("\\s+");
            
            ArrayList<Integer> dataSets = new ArrayList<>();
            //reading dataset IDs into arrayList
            for (int j = 1; j < splited.length; j++) {
                dataSets.add(Integer.parseInt(splited[j]));
                System.out.println("adding" + splited[j] );
            }
            System.out.println("datacenter" + i +" established" );
            dataCenters.put(i, dataSets);
        }
        //interate through each datasets and syncronize
        for (Integer i : dataCenters.keySet()) {
            ArrayList<Integer> dataSet1 = dataCenters.get(i);
            for (Integer j : dataCenters.keySet()) {
                ArrayList<Integer> dataSet2 = dataCenters.get(j);
                //other syncronize between different datacenters
                if (i == j) {
                    continue;
                }
                for(int m = 0; m < dataSet1.size(); m++)
                {   Integer currentInt = dataSet1.get(m);
                    if(!dataSet2.contains(currentInt))
                    {
                        dataSet2.add(m);
                        System.out.println(currentInt+ " "+i+" "+j);
                    }
                }

            }
            
        }
        System.out.println("done");
    }
}
