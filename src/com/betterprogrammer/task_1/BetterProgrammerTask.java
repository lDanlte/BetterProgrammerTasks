package com.betterprogrammer.task_1;

import java.util.Arrays;

/**
 *
 * @author Antonov Denis (den007230@gmail.com)
 */

public class BetterProgrammerTask {

    
    
    public static Object[] reverseArray(Object[] a) {
        /*
          Please implement this method to
          return a new array where the order of elements has been reversed from the original
          array.
         */
        
        if (a.length == 0) {
            return null;
        }
        
        Object[] result = new Object[a.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[(a.length - 1) - i];
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        
        Object[] reversedArr = reverseArray(new Integer[]{0, 1, 2, 3, 4, 5});
        
        System.out.println(Arrays.toString(reversedArr));
    }
    
}
