package codingchallenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {
/*
Lilah has a string, , of lowercase English letters that she repeated infinitely many times.

Given an integer, , find and print the number of letter a's in the first  letters of Lilah's infinite string.

For example, if the string  and , the substring we consider is , the first  characters of her infinite string. There are  occurrences of a in the substring.
*/
    
    /**
     * Find the number of occurrences of 'a' in a repeated string that is n length long
     * @param s string that is repeated
     * @param n the string repeats until it is of n length
     * @return 
     */
    static long repeatedString(String s, long n) {
        String newS = s.toLowerCase();
        long baseCount = 0;
        for(int i = 0 ; i < s.length(); i++){
            if(newS.charAt(i)=='a'){
                baseCount++;
            }
        }

        long numOccurences = (n/(newS.length()))*baseCount;
        long remainders = n%(newS.length());
        for(int i = 0; i < remainders; i++){
            if(newS.charAt(newS.length()-1-i)=='a'){
                numOccurences++;
            }
        }
        return numOccurences;

    }
}

