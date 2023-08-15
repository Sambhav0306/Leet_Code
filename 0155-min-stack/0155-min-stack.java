class MinStack {
    int min=Integer.MAX_VALUE;
    Stack<Integer> stack;
    Stack<Integer> stack1;
    HashSet<Integer> set=new HashSet<>();
    public MinStack() {
        stack=new Stack<>();
        stack1=new Stack<>();
    }
    
    public void push(int val) {
        if(stack1.isEmpty() || stack1.peek()>=val){
            stack1.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
         if(stack.peek().equals(stack1.peek())) {
            stack1.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return stack1.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */