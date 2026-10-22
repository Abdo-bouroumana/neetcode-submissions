import heapq

class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        def heap_sort(lst):
            heapq.heapify(lst) 
            sorted_list = [heapq.heappop(lst) for _ in range(len(lst))]  
            return sorted_list

        s = heap_sort(nums)
        maxi = 0
        count = 0
        if len(s) > 0:
            count = 1
            maxi = 1
            for i in range(len(s)):
                if i > 0:
                    if s[i] == s[i - 1] + 1:
                        count += 1
                        if count > maxi :
                            maxi = count
                    elif s[i] == s[i - 1]:
                        count = count
                        if count > maxi :
                            maxi = count
                    elif s[i] != s[i - 1] + 1 or i == len(s):
                        if count > maxi :
                            maxi = count
                        count = 1
            
        return maxi
                