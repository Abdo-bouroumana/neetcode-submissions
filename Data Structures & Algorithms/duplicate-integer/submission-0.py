from collections import defaultdict
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        num_map = defaultdict(list)
        
        for i in nums:
            num_map[i].append(i)

        for j in num_map.values():
            if len(j) > 1:
                return True
        return False
         