/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;

/**
 *
 * @author kaofa
 */
public class Staircase {
   // Complete the staircase function below.
    static void staircase(int n) {
        for(int i = 0; i<n; i++){
            for(int j = n; j>i+1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j<=i; j++){
                System.out.print("#");
            }
            System.out.println("");
        }

    } 
}
