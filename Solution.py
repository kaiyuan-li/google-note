class Solution:
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) == 1:
            return [[],nums]
        res = []
        for subset in self.subsets(nums[1:]):
            res.append(subset)
            res.append(subset.insert(0,nums[0]))
        return res


s = Solution()

s.subsets([1,2,3])