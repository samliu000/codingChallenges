/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;

/**
 * Deletes repeats in an array
 * @author samuelliu
 */
public class DeleteRepeats {
    /**
     * Deletes repeats in an array
     * @param array array that you want to delete repeats from
     * @return  int array with no repeats
     */
    public static int[] deleteRepeats(int[] array){
        int previousElement = array[0];
        int[] newArrays = new int[array.length];
        for(int k = 0; k < array.length; k++){
            newArrays[k] = array[k];
        }
        int[] anotherArray = new int[0];
        for(int i = 1; i < array.length; i++){
            previousElement = array[i-1];
            anotherArray = new int[newArrays.length-1];
            for(int j = 0; j < newArrays.length; j++){
                if(j != i)
                anotherArray = array;
            }
        }
        return anotherArray;
    }
    public static void main(String[] args){
        
    }
}
