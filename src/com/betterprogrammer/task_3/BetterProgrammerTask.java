package com.betterprogrammer.task_3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Antonov Denis (den007230@gmail.com)
 */
public class BetterProgrammerTask {
    
    // Please do not change this interface
    public static interface Node {
        int getValue();
        List<Node> getChildren();
    }

    public static List<Node> traverseTreeInWidth(Node root) {
        /*
          Please implement this method to
          traverse the tree in width and return a list of all passed nodes.

          The list should start with the root node, next
          it should contain all second-level nodes, then third-level nodes etc.

          The method shall work optimally with large trees.
         */
        
        List<Node> result = new ArrayList<Node>();
        result.add(root);

        for (int i = 0; i < result.size(); i++)
        {  
            for (Node child: result.get(i).getChildren()) {
                result.add(child);
            }
                
        }

        return result;
        
    }


}
