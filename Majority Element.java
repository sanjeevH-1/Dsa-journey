class Solution {
    public int majorityElement(int[] nums) {
        int cmp=0;
        int cnt=0;
        int maj=nums[0];
        for(int i=0;i<nums.length;i++){
            cnt=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    cnt++;
                }
            }
            if(cnt>cmp){
                maj=nums[i];
                cmp=cnt;
            }
        }
        return maj;
    }
}