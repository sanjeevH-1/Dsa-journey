class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i =0
        j=0
        for j in range(0,len(nums)):
            nums[i]=nums[j]
            j+=1
            if nums[i] != val:
                i+=1
        return i