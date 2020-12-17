package com.example.datastructurespractice.BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class BSTIterator {
    Stack<TreeNode> stack = new Stack<TreeNode>();
    public BSTIterator(TreeNode root) {
        inOrder(root);
    }


    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        //inOrder(temp.right);
        return temp.val;
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    private void inOrder(TreeNode root){
        if(root==null)  return;

                inOrder(root.left);
        stack.push(root);
        inOrder(root.right);

    }
    int xHeight;
    int yHeight;

    TreeNode xParent;
    TreeNode yParent;

    int foundCount = 2;

    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            int a=0,b=0,parent1=0,parent2=0;

            for(int i=0;i<level;i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                    if(node.left.val==x || node.left.val==y)
                        if(a==0){a=1; parent1=node.val;}
                        else {b=1; parent2 = node.val;}
                }
                if(node.right!=null){
                    queue.add(node.right);
                    if(node.right.val==x || node.right.val==y)
                        if(a==0){a=1; parent1=node.val;}
                        else {b=1; parent2 = node.val;}
                }
            }
            if(a==1 && b==1 && parent1!=parent2)
                return true;
            if(a==1 || b==1){
                return false;
            }
        }
        return false;

    }

    public void IsCousinsUtil(TreeNode root, int x, int y, TreeNode parent, int depth) {
        if(foundCount == 0)
            return;

        if(root == null)
            return;

        if(root.val == x) {
            xHeight = depth;
            xParent = parent;
            foundCount--;
        }

        if(root.val == y) {
            yHeight = depth;
            yParent = parent;
            foundCount--;
        }

        IsCousinsUtil(root.left, x, y, root, depth + 1);
        IsCousinsUtil(root.right, x, y, root, depth + 1);
    }

}
