
package codingchallenges;

/**
 *
 * @author boo13
 */
public class rotateLeftArray {
    /*
    Problem From HackerRank! A left rotation operation on an array shifts each of the array's elements unit to the left
    */
    public static int[] rotLeftOnce(int[] a){
        int lastNum = a[0];
        for(int i = 0; i < a.length-1; i++){
            a[i] = a[i+1];
        }
        a[a.length-1] = lastNum;
        return a;
    }
    
    public static int[] rotLeft(int[] a, int d) {
        int[] returnArray = a;
        for(int i = 0; i < d; i++){
            returnArray = rotLeftOnce(a);
        }
        return returnArray;
    }
}
