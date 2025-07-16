
class Solution {

    public int removeDuplicates(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i : nums) {
            set.add(i);
        }
        Arrays.fill(nums, 0);
        int j = 0;
        for (int i : set) {
            nums[j++] = i;
        }

        int s = set.size();
        return s;
    }
}
