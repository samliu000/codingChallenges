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
    public static <T extends Parent> void test1(T var){}
    public static <T extends Primate> void test2(T var){}
    public static <T extends GrandParent & Rodent> void test3(T var){}
    public static <T extends Parent & Supraprimate> void test4(T var){}
     
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
        test1(oldman);
        test1(mom);
        test1(kid);
        test1(monkey);
        test1(mouse);
        
        //See if all classes work for generic <E extends Primate>
        test2(oldman);
        test2(mom);
        test2(kid);
        test2(monkey);
        test2(mouse);
        
        //See if all classes work for generic <E extends Primate>
        test3(oldman);
        test3(mom);
        test3(kid);
        test3(monkey);
        test3(mouse);
        
    }
}
