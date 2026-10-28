class MinStack {
    private Deque<Integer> regStack;
    private Deque<Integer> minStack;

    public MinStack() {
        regStack = new ArrayDeque();
        minStack = new ArrayDeque();
    }
    
    public void push(int val) {
        regStack.push(val);
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int min = minStack.pop();
            if (min <= val) {
                minStack.push(min);
                minStack.push(min);
            } else {
                minStack.push(min);
                minStack.push(val);
            }
        }
    }
    
    public void pop() {
        regStack.pop();
        minStack.pop();
    }
    
    public int top() {
        int top = regStack.pop();
        regStack.push(top);
        return top;
    }
    
    public int getMin() {
        int min = minStack.pop();
        minStack.push(min);
        return min;
    }
}
