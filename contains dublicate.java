

class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int len=nums.length;
        for (int n : set){
            int cnt=0;
            for(int i=0;i<len;i++){
                if(n==nums[i]){
                    cnt++;
                }
                if(cnt>1){
                   return true;
                }
            }
            
        }
        return false;
    }
}