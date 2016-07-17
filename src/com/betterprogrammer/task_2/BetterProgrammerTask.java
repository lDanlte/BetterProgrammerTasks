package com.betterprogrammer.task_2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonov Denis (den007230@gmail.com)
 */

public class BetterProgrammerTask {
    
    
    

    public static List<Integer> getPrimeNumbers(int from, int to) {
        /*
          Please implement this method to
          return a list of all prime numbers in the given range (inclusively).
          A prime number is a natural number that has exactly two distinct natural number divisors, which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13
         */
        
        if (from > to) {
            throw new IllegalArgumentException("var 'to' must be greater than 'from'.");
        }
        
        List<Integer> result = new ArrayList<>();//diamond operator was presented in java 7
        
        for (int num = from; num <= to; num++) {
            
            if (num < 2) {
                continue;
            }
            
            boolean isPrime = true;
            
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                result.add(num);
            }
        }
        
        return result;
    }
    
    
    
    public static void main(String[] args) {
        System.out.println(getPrimeNumbers(0, 60));
    }
    
}
