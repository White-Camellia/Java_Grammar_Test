package LeetcodeExercises;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class PrintTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null) return  Collections.emptyList();
        List<List<Integer>> finalAns = new ArrayList<>();
        Deque<TreeNode> deque = new LinkedList();
        deque.add(root);
        boolean flag = true;
        while(!deque.isEmpty()){
            List<Integer> linearAns = new ArrayList<>();
            for (int i = deque.size(); i > 0; i--) {
                TreeNode tmp = deque.poll();
                linearAns.add(tmp.val);
                if(tmp.left != null) deque.add(tmp.left);
                if(tmp.right!= null) deque.add(tmp.right);
            }
            if(flag == false){
                Collections.reverse(linearAns);
                flag = true;
            }else flag = false;
            finalAns.add(linearAns);
        }
        return finalAns;
    }

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }
}