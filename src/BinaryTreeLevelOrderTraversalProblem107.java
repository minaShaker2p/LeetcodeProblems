import helpers.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalProblem107 {
    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> list = new LinkedList<>();
        if (root == null) { return list; }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new LinkedList<>();
            for (int i = 0; i <size; i++) {
                if (queue.peek().left != null) { queue.offer(queue.peek().left); }
                if (queue.peek().right != null) { queue.offer(queue.peek().right); }
                subList.add(queue.poll().val);
            }
            list.add(0, subList);
        }
        return list;
    }


}
