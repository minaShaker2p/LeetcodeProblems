import helpers.TreeNode;

public  class ConvertSortedArraytoBSTProblem108 {
    TreeNode sortedArrayToBST(int[] nums) {

        return toBST(nums, 0, nums.length - 1);


    }


    private TreeNode toBST(int[] nums, int start, int end) {
        if (end < start) return null;
        int middle = (end + start) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = toBST(nums, start, middle - 1);
        node.right = toBST(nums, middle + 1, end);
        return node;

    }
}