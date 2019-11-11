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
     * Experimenting with Iterator
     * @param strings iterable list of Strings
     */
    public static void iteratorEXP(Iterable<String> strings){
        Iterator<String> iterator = strings.iterator();
        String hi = "";
        while(iterator.hasNext()){
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
        for(String i: strings){
            System.out.print(i + ", ");
        }
        System.out.println();
        //How to print without comma at end
        Iterator<String> newIterator = strings.iterator();
        while(newIterator.hasNext()){
            hi += newIterator.next() + ", ";
        }
        hi = hi.substring(0, hi.length() - 2);
        System.out.println(hi);
        
        
    }
    
    /**
     * Finds sum of Fibonacci sequence up to a number n
     * @param n finds Fibonacci sequence sum up to this number
     * @return sum of Fibonacci sequence up to  n
     */
    public static int sumFibb(int n){
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else{
            return sumFibb(n-1)+sumFibb(n-2);
        }
    }
    
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
        
        // Traverses map and finds key with highest frequency
        int mostFrequent = 0;
        int highestFrequency = 0;
        for(Map.Entry<Integer, Integer> entry: intToFreq.entrySet()){
            if(entry.getValue() > highestFrequency){
                mostFrequent = entry.getKey();
                highestFrequency = entry.getValue();
            }
        }
        
        
        // Test for integers with the same frequency
        for(Map.Entry<Integer, Integer> entry: intToFreq.entrySet()){
            if(entry.getValue() == highestFrequency && entry.getValue() != mostFrequent){
                return "No distinct highest frequency integer";
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
        System.out.println(CodingChallenges.findMostFrequentIntegerIn(array));
        ArrayList<String> arrayOfStrings = new ArrayList<>();
        arrayOfStrings.add("Hi");
        arrayOfStrings.add("Hey");
        arrayOfStrings.add("Hello");
        iteratorEXP(arrayOfStrings);
    }
    
}
