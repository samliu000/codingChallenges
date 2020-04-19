/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchallenges;

/**
 *
 * @author samuelliu
 */
public class Name {
    String first;
    String last;
    
    private char initial;
    
    public void setFirst(String name) {
        first = name;
        
    }
    
    public void setLast(String name) {
        last = name;
    }
    public String getFirst() {
        return first;
    }
    public void giveLastNameTo2(Name child) {
        String firstName = child.getFirst();
        child = new Name();
        child.setFirst(firstName);
        child.setLast(last);
    }
    
    public String toString(){
        return "Name: " + first + " " + last;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Name jamie = new Name();
        jamie.setFirst("Jamie");
        jamie.setLast("Jones");
        Name jane = new Name();
        jane.setFirst("Jane");
        jane.setLast("Doe");
        jamie.giveLastNameTo2(jane);
        System.out.println(jane);
    }
    
}
