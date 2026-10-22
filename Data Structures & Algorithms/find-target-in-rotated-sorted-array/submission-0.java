class Solution {
    public int  search(int[] nums, int target) {
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
        int min = low;
        low = 0;
        hight = n - 1;

        while(low <= hight){
            int mid = (low + hight) / 2;
            int reaLMid = indexInNormalArray(mid, min, n);
            if(nums[reaLMid] > target){
                hight = mid - 1;
            }else if(nums[reaLMid] < target){
                low = mid + 1;
            }else{
                return reaLMid;
            }
        }

        return -1;
    }

    public static int indexInNormalArray(int index, int start, int n){
        
        int newIndex;
        if((index + start) % n == 0){
            if(index + start == n){
                return 0;
            }
            newIndex = index + start;
        }else{
            newIndex = ((index + start) % n);
        }
        return newIndex;
    }
}
