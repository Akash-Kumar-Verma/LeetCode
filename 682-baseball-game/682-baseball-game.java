class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> st=new Stack<>();
        for(String s:ops){
            if(s.charAt(0)=='+'){
                int a=st.pop();
                int b=st.peek();
                st.push(a);
                st.push(a+b);
            }else if(s.charAt(0)=='D'){
                st.push(st.peek()*2);
            }else if(s.charAt(0)=='C'){
                st.pop();
            }else{
                st.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!st.isEmpty()){
            ans+=st.pop();
        }
        return ans;
    }
}