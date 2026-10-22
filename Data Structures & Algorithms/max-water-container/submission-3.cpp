class Solution {
public:
    int maxArea(vector<int>& heights) {
        int max(0), misaha;
        int i = 0,j = heights.size() - 1;
        while(i != j){
            misaha = (j-i) * min(heights[i], heights[j]);
            if(misaha > max) max = misaha;
            if(heights[i] > heights[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
};
