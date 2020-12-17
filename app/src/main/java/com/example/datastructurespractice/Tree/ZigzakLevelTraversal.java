package com.example.datastructurespractice.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzakLevelTraversal {

    public static void main(String[] args) {
        System.out.println("Z:"+zigzak( new TreeNode( 2 ) ));
    }

public static  List<List<Integer>> zigzak(TreeNode root){
    List<List<Integer>> sol = new ArrayList<>();

    travel(root, sol, 0);
    return sol;
}
    private static void travel(TreeNode curr, List<List<Integer>> sol, int level)
    {
        if(level == 5)return;
        if(sol.size() <= level)
        {
            List<Integer> newLevel = new LinkedList<>();
            sol.add(newLevel);
            System.out.println( "S: "+newLevel.size() );
        }

        List<Integer> collection  = sol.get(level);

        System.out.println( "C1: "+collection.size() );
        if(level % 2 == 0) collection.add(curr.val);
        else collection.add(0, curr.val);

        System.out.println( "C2: "+collection.size() );

        travel(curr, sol, level + 1);
        travel(curr, sol, level + 1);
    }
}
