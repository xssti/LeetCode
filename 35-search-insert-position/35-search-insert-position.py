class Solution:
    def searchInsert(self, nums, target):
        res=0
        fla=0
        for i in range(len(nums)):
            if nums[i]==target:
                res= i
                fla=1
                break
        if fla==1:
            return res
        else:
            for i in range(0,len(nums)):
                if len(nums)==1:
                    if nums[0]>target:
                        res=0
                    else:
                        res=1
                if nums[i-1]<target and nums[i]>target:
                        res=i
                if nums[0]>target:
                    res=0
                if nums[len(nums)-1]<target:
                    res=len(nums)
            return res
                    
            
        