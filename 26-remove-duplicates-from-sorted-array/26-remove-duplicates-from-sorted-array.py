class Solution:
    def removeDuplicates(self, nums):
        '''
        size = len(nums)
        expectedNums = []
        length=1
        expectedNums.append(nums[0])
        for i in range(1, size-1):
                if nums[i] != expectedNums[i-1]:
                    length += 1
                    expectedNums[i] = nums[i]
                else:
                    continue
        print(expectedNums)
        return length
        '''
        nums[:] = sorted(list(set(nums)))
        return len(nums)
        
        