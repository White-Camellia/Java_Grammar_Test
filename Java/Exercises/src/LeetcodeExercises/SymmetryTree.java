package LeetcodeExercises;

public class SymmetryTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return false;
        else return mirrorTraverse(root.left, root.right);
    }
    public boolean mirrorTraverse(TreeNode L, TreeNode R) {
       if(L == null || R == null) return true;
       if(L == null || R == null || L.val != R.val) return false;
       return mirrorTraverse(L.right, L.left) && mirrorTraverse(R.left, R.right);
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
