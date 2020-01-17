/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;

/**
 *
 * @author boo13
 */
public class sumArray {
    public static int sumArrays(int[] a, int[] b) {
        int[] smallerArray;
        int[] biggerArray;
        
        if(a.length > b.length) {
            biggerArray = a;
            smallerArray = b;
        } else {
            biggerArray = b;
            smallerArray = a;
        }
        
        int sum = 0;
        int iterator = 0;
        
        while(iterator < smallerArray.length) {
            sum += a[iterator];
            sum += b[iterator];
            ++iterator;
        }
        
        for(int i = iterator; i < biggerArray.length; i++){
            sum += biggerArray[i];
        }
        
        return sum;
        
        
        
    }
}
