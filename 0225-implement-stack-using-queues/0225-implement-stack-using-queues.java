class MyStack {
    Queue <Integer> q=new LinkedList<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        int a=this.q.size();
        q.add(x);
        for(int i=0;i<a;i++){
            int b=this.q.poll();
            this.q.add(b);
        }
    }
    
    public int pop() {
        return this.q.poll();
    }
    
    public int top() {
        return this.q.peek();
    }
    
    public boolean empty() {
        return this.q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */