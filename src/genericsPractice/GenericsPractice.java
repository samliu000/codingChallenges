/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericsPractice;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author boo13
 * @param <T>
 */
public class GenericsPractice<T> {
    public GenericsPractice(T variable){}
    public static <T extends Parent> void test1(T var){}
    public static <T extends Primate> void test2(T var){}
    public static <T extends GrandParent & Rodent> void test3(T var){}
    public static <T extends Parent & Supraprimate> void test4(T var){}
    public static void test5(List<? super Parent> var){}
    public static void test6(List<? super Primate> var){}
     
    public static void main(String args[]){
        GrandParent oldman = new GrandParent();
        Parent mom = new Parent();
        Child kid = new Child();
        Chimpanzee monkey = new Chimpanzee();
        Mouse mouse = new Mouse();
        
        List<GrandParent> oldmanList = new ArrayList<>();
        List<Parent> momList = new ArrayList<>();
        List<Child> kidList = new ArrayList<>();
        List<Chimpanzee> monkeyList = new ArrayList<>();
        List<Mouse> mouseList = new ArrayList<>();
        
        
        //See if all classes work for generic T
        GenericsPractice practice = new GenericsPractice(oldman);
        practice = new GenericsPractice(mom);
        practice = new GenericsPractice(kid);
        practice = new GenericsPractice(monkey);
        practice = new GenericsPractice(mouse);
        
        /*
        //See if all classes work for generic <E extends Parent>
        /*
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
        
        //See if all classes work for generic <E extends Grandparent & Rodent>
        test3(oldman);
        test3(mom);
        test3(kid);
        test3(monkey);
        test3(mouse);
        
        //See if all classes work for generic <E extends Parent & Supraprimate>
        test4(oldman);
        test4(mom);
        test4(kid);
        test4(monkey);
        test4(mouse);
        
        //See if all classes work for wildcard <? super Parent>
        test5(oldmanList);
        test5(momList);
        test5(kidList);
        test5(monkeyList);
        test5(mouseList);
        
        //See if all classes work for wildcard <? super Primate>
        test6(oldmanList);
        test6(momList);
        test6(kidList);
        test6(monkeyList);
        test6(mouseList);
        */
    }
}
