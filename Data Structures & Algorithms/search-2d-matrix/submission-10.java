class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int lo = 0, hi = matrix.length;
        while(lo < hi){
            int mid = lo + (hi - lo)/2;
            if(matrix[mid][0] == target) return true;
            else if(matrix[mid][0] > target) hi = mid;
            else lo = mid + 1;
        }
        if(lo > 0) lo -= 1;
        int lo2 = 0;
        hi = matrix[0].length - 1;
        while(lo2 <= hi){
            int mid = lo2 + (hi - lo2)/2;
            if(matrix[lo][mid] == target) return true;
            else if (matrix[lo][mid] > target) hi = mid - 1;
            else lo2 = mid + 1; 
        }
        return false;
        
    }
}
