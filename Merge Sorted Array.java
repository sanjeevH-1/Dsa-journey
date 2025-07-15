
class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int start = nums1.length - m;
        for (int i = m; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {
                nums1[i++] = nums2[j];

            }
        }
        Arrays.sort(nums1);
        System.out.println(nums1);
    }
}
