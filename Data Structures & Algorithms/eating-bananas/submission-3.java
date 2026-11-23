class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        long lo = 1;
        long hi = 0;
        for(int i = 0; i < piles.length; i++){
            if(piles[i] > hi) hi = piles[i];
        }

        while(lo < hi){
            long mid = lo + (hi - lo)/2; 
            long count = 0;
            for(int p : piles){
                count = count + (long)Math.ceil((double)p/mid);
            }
            if(count <= h) hi = mid;
            else lo = mid + 1;
            
        }

        return (int)lo;

    }
}
