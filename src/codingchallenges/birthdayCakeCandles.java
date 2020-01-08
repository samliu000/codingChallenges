import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class birthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    public static int birthdayCakeCandles(int[] ar) {
        int max = ar[0];
        int candles = 0;
        for(int i = 0; i<ar.length; i++){
            if(max<ar[i])
                max = ar[i];
        }
        for(int i= 0; i<ar.length; i++){
            if(max == ar[i])
                candles++;
        }
        return candles;
    }

}
