class CustomStack {
int tos=-1;

 int []arr;

    public CustomStack(int maxSize) {
        this.arr=new int[maxSize];

    }
    
    public void push(int x) {
            if(tos<arr.length-1){
                tos++; 
                this.arr[tos]=x;
                
            }
         }
    
    public int pop() {
        if(tos==-1){
            return -1;
        }
            return arr[tos--];
    }
    
    public void increment(int k, int val) {
        for(int i=0;i<Math.min(k,tos+1);i++){
            this.arr[i]+=val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */