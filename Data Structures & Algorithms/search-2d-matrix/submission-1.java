class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int low = 0;
        int high = n - 1;

        int mid = (low+high)/2;
        while(low <= high){
            mid = (low+high)/2;
            if(target < matrix[mid][0] ){
                high = mid - 1;
            }else if(target > matrix[mid][0]){
                low = mid + 1;
            }else{
                return true;
            }
        }

        int found;
        if(matrix[mid][0] > target){
            if(mid - 1 >= 0){
                found = Arrays.binarySearch(matrix[mid - 1], target);
            }else{
                return false;
            }  
        }else{
            found = Arrays.binarySearch(matrix[mid], target);
        }

        if(found >= 0) return true;
        else return false;
    }
}
