class MyQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        this.s1.push(x);
    }
    
    public int pop() {
        if(this.s2.isEmpty()){
            while(!this.s1.isEmpty()){
                int a=this.s1.pop();
                
                this.s2.push(a);
            }
            return this.s2.pop();
        }
        else{
            return this.s2.pop();
        }
    }
    
    public int peek() {
        if(this.s2.isEmpty()){
            while(!this.s1.isEmpty()){
                int a=this.s1.pop();
                
                this.s2.push(a);
            }
            return this.s2.peek();
        }
        else{
            return this.s2.peek();
        }
    }
    
    public boolean empty() {
        return this.s1.isEmpty()&&this.s2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */