class FreqStack {
    Map<Integer,Integer> freqMap;
    Map<Integer,Stack<Integer>> freqStack;
    int maxfreq;
    public FreqStack() {
        freqMap=new HashMap<>();
        freqStack=new HashMap<>();
        maxfreq=0;
    }
    
    public void push(int x) {
        int freq=freqMap.getOrDefault(x,0)+1;
        freqMap.put(x,freq);
        maxfreq=Math.max(freq,maxfreq);
        freqStack.computeIfAbsent(freq,f->new Stack()).push(x);
    }
    
    public int pop() {
        Stack<Integer> s=freqStack.get(maxfreq);
        int top=s.pop();
        if(s.isEmpty()) maxfreq--;
        freqMap.put(top,freqMap.get(top)-1);
        return top;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */