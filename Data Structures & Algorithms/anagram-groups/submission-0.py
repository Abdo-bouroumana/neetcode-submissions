class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_str = defaultdict(list)
        result = []
        for a in strs:
            s = tuple(sorted(a))
            anagram_str[s].append(a)

        for b in anagram_str.values():
            result.append(b)
        return result