class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output=[]
        x = 1
        s = 0
        for i in nums:
            if i != 0:
                x *= i
            else:
                s += 1
        for i in range(len(nums)):
            if s == 0:
                output.append(int(x/nums[i]))
            else:
                if s > 1:
                    output.append(0)
                else:
                    if nums[i] != 0:
                        output.append(0)
                    else:
                        output.append(int(x))
        return output