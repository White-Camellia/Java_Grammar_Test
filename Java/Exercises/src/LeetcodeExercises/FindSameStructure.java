package LeetcodeExercises;
//剑指 offer 26

class FindSameStructure {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        return (A != null && B != null) && (isTheSameStructure(A, B) || isSubStructure(A.left, B) || isSubStructure(A.right, B));
    }

    public boolean isTheSameStructure(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null || b.val != a.val) return false;
        return (isTheSameStructure(a.left, b.left) && isTheSameStructure(a.right, b.right));
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}



