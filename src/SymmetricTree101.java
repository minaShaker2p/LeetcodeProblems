import helpers.TreeNode;

public class SymmetricTree101 {

    public static boolean solution1(TreeNode root)
    {
        return  isMirror(root,root);
    }

    private static boolean isMirror(TreeNode t1,TreeNode t2)
    {
        if(t1==null&& t2==null) return true;
        if(t1 ==null || t2==null) return false;
        return (t1.val==t2.val) && isMirror(t1.left,t2.right)&& isMirror(t1.right,t2.left);
    }
}
