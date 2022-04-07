class Solution:
    def reverseWords(self, s):
        str = s.split(" ")
        for i in range(len(str)):
            str[i] = str[i][::-1]
        return " ".join(i for i in str)
        