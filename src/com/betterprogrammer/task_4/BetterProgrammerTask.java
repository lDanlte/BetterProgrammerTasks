package com.betterprogrammer.task_4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonov Denis (den007230@gmail.com)
 */
public class BetterProgrammerTask {
    
    

    public static List<String> transferFromAtoC(int n) {
        /*
          Towers Of Hanoi.
          There are three pegs: A, B and C. There are n disks. All disks are different in size.
          The disks are initially stacked on peg A so that they increase in size from the top to the bottom.
          The goal is to transfer the entire tower from the A peg to the C peg.
          One disk at a time can be moved from the top of a stack either to an empty peg or to
          a peg with a larger disk than itself on the top of its stack.

          The method should return a sequence of disk moves, each move is a String with two letters (A, B or C)
          corresponding to the peg the disk moves from and the peg it moves to.
          For example, the move "AC" means that a top disk from peg A should be moved to peg C.
         */
        
        if (n < 1) {
            throw new IllegalArgumentException("var 'n' must be greater than zero.");
        }
        
        List<String> result = new ArrayList<String>();
        
        hanoiRecursion(result, "A", "B", "C", n);
        return result;
    }
    
    private static void hanoiRecursion(List<String> moves, String start, String support, String end, int n) {
        if (n == 1) {
            moves.add(start + end);
        } else {
            hanoiRecursion(moves, start, end, support, n - 1);
            moves.add(start + end);
            hanoiRecursion(moves, support, start, end, n - 1);
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println(transferFromAtoC(3)); //O(2^n)
    }
    
}
