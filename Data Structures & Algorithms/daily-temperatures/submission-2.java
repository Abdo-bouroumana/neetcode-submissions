class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> monotonicStack = new ArrayDeque<>();
        int[] output = new int[temperatures.length];
        for(int i = 0; i < temperatures.length; i++){
            if(monotonicStack.isEmpty() || monotonicStack.peek()[0] >= temperatures[i]){
                monotonicStack.push(new int[]{temperatures[i], i});
            }else{
                while(!monotonicStack.isEmpty() && monotonicStack.peek()[0] < temperatures[i]){
                    output[monotonicStack.peek()[1]] = i - monotonicStack.peek()[1];
                    monotonicStack.pop();
                }
                monotonicStack.push(new int[]{temperatures[i], i});
            }
        }
        return output;
    }
}
