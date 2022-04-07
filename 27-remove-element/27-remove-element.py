class Solution:
    def removeElement(self, nums, val):
        while val in nums:
            nums.remove(val)
        return len(nums)
        #nums = sorted(nums)
        '''
         for i in range((len(nums)-1)):
            if nums[i] == val:
                #nums.pop(i)
                del nums[i]
        '''
       
            
            
        