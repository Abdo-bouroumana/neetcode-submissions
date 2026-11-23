class MinStack {
    
    Deque<Integer> s;
    Deque<Integer> minTrackStack;


    public MinStack() {
        this.s = new ArrayDeque<>();
        this.minTrackStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        s.push(val);
        if(minTrackStack.peek() == null || val <= minTrackStack.peek()){
            minTrackStack.push(val);
        }
    }
    
    public void pop() {
        if(s.pop().equals(minTrackStack.peek())){
            minTrackStack.pop();
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minTrackStack.peek();
    }
}
