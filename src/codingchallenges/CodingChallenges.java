/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;
import java.util.*;
/**
 *
 * @author samuelliu
 */
public class CodingChallenges {
    
    /**
     * Finds the most frequent number in an array
     * @param array an array containing integers
     * @return the most frequent integer
     */
    public static String findMostFrequentIntegerIn(List<Integer> array){
        if(array.size() == 0){
            return "Array is empty";
        }
        
        Map<Integer, Integer> intToFreq = new HashMap<>();
        for(int i: array){
            if(intToFreq.containsKey(i)){
                intToFreq.replace(i, intToFreq.get(i) + 1);
            } else{
                intToFreq.put(i, 0);
            }
        }
        int mostFrequent = 0;
        int highestFrequency = 0;
        for(Map.Entry<Integer, Integer> entry: intToFreq.entrySet()){
            if(entry.getValue() > highestFrequency){
                mostFrequent = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }
        return "" + mostFrequent;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(1);
        array.add(2);
        array.add(2);
        array.add(3);
        array.add(3);
        array.add(4);
        array.add(4);
        System.out.println(CodingChallenges.findMostFrequentIntegerIn(array));
    }
    
}
