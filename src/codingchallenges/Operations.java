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
public class Operations {
    static public void main(String[] penis){
        String something = " * -      25";
        something = something.replaceAll(" ", "");
        System.out.println(something);
        char operator = something.charAt(0);
        String restOfSomething = something.substring(1);
        System.out.println(Double.parseDouble(restOfSomething));
    }
}
