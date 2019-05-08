public class MergeSortedArrayProblem88 {
    /**
     * Given two sorted integer arrays nums1 and nums2, solution1 nums2 into nums1 as one sorted array.
     * <p>
     * Note:
     * <p>
     * The number of elements initialized in nums1 and nums2 are m and n respectively.
     * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
     * Example:
     * <p>
     * Input:
     * nums1 = [1,2,3,0,0,0], m = 3
     * nums2 = [2,5,6],       n = 3
     * <p>
     * Output: [1,2,2,3,5,6]
     */
    public static void solution1(int[] nums1, int m, int[] nums2, int n) {

        for (int i = 0; i < nums2.length; i++) {
            int number = nums2[i];

            for (int j = 0; j < nums1.length; j++) {
                if (nums1[j] == 0) {
                    nums1[j] = number;
                    break;
                }
                if (number <= nums1[j]) {
                    int temp = j;

                    for (int c = j; c < nums1.length; c++) {
                        nums1[c + 1] = nums1[c];
                    }
                    nums1[temp] = number;
                }
            }
        }

    }

    public static void solution2(int[] nums1, int m, int[] nums2, int n) {
        int one = m - 1;
        int two = n - 1;
        for (int i = m + n - 1; i >= 0; i--) {
            if (one < 0) {
                nums1[i] = nums2[two--];
            } else if (two < 0) {
                nums1[i] = nums1[one--];

            } else if (nums1[one] >= nums2[two]) {
                nums1[i] = nums1[one--];
            } else
                nums1[i] = nums2[two--];
        }
    }
}
