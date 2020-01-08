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
public class TwoStrings {
    
    /*
    Given two strings, determine if they share a common substring.
    */
    //TOO SLOW
    public static String twoStrings(String s1, String s2) {
        String shorterString;
        String longerString;
        if(s1.length() > s2.length()){
            shorterString = s2;
            longerString = s1;
        } else {
            shorterString = s1;
            longerString = s2;
        }
        for(int i = 0; i < shorterString.length(); i++){
            if(longerString.indexOf(shorterString.charAt(i)) > -1){
                return "YES";
            }
        }
        return "NO";
    }
    
    //FASTER WAY
    public static String twoStringsFaster(String s1, String s2) {
        for(int i = 97; i < 123; i++){
            if(s1.indexOf((char)i)> -1 && s2.indexOf((char)i)>-1){
                return "YES";

            }
        }
        return "NO";
    }
}
