class Solution:
    def missingNumber(self, nums):
        size = len(nums)
        return (size* (size+1)) // 2 -  sum(nums)
       
                
                
                                            
        