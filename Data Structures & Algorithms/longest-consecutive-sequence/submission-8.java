class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        List<Integer> sequencesStarts = new ArrayList<>();
        int lengthLongestSequence = 0;
        int count = 0;
        for(int num : nums){
            numsSet.add(num);
        }

        for(int e : numsSet){
            if(!numsSet.contains(e - 1)){
                sequencesStarts.add(e);
            }
        }

        for(int e : sequencesStarts){
            int x = e;
            count = 1;
            while(numsSet.contains(x + 1)){
                count++;
                x += 1;
            }
            if(count > lengthLongestSequence) lengthLongestSequence = count;
        }

        return lengthLongestSequence;

    }
}
