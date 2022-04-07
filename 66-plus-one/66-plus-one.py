class Solution:
    def plusOne(self, digits):
        s = ""
        for i in digits:
            s += str(i)
        s = int(s)+1
        s = str(s)
        return [int(i) for i in s]
            
       

        