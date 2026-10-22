class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int low = 0;
        int hight = n - 1;

        while(low < hight){
            int mid = (low + hight) / 2;
            if(nums[hight] > nums[mid]){
                hight = mid;
            }else{
                low = mid + 1;
            }
        }
        return nums[low];
    }
}
