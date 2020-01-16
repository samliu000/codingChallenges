/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CountingValleys {

    // Complete the countingValleys function below..
    static int countingValleys(int n, String s) {
        int valley = 0;
        int level = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i)=='U'){
                level++;
            }
            else if(s.charAt(i)=='D'){
                if(level==0){
                    valley++;
                }
                level--;
            }
        }
        return valley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println(countingValleys(8,"UDDDUDUU"));
    }
}
