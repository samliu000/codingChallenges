/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsPractice;

/**
 *
 * @author boo13
 */
public class GenericsPractice<T> {
    public GenericsPractice(T variable){}
    public static <T extends Parent> void test1(){}
    public static <T extends Primate> void test2(){}
    public static <T extends GrandParent & Rodent> void test3(){}
    public static <T extends Parent & Supraprimate> void test4(){}
     
    public static void main(String args[]){
        
        GrandParent oldman = new GrandParent();
        Parent mom = new Parent();
        Child kid = new Child();
        Chimpanzee monkey = new Chimpanzee();
        Mouse mouse = new Mouse();
        
        //See if all classes work for generic T
        GenericsPractice practice = new GenericsPractice(oldman);
        practice = new GenericsPractice(mom);
        practice = new GenericsPractice(kid);
        practice = new GenericsPractice(monkey);
        practice = new GenericsPractice(mouse);
        
        //See if all classes work for generic <E extends Parent>
        
    }
}
