class Solution {
    public String getSmallestString(int n, int k) {
        char[] ch=new char[n];
        for(int i=0;i<n;i++){
            ch[i]='a';
        }
        k=k-n;
        for(int i=n-1;i>=0;--i){
            if(k>=25){
                ch[i]='z';
                k=k-25;
            }else{
                ch[i]=(char)('a'+k);
                k=0;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<ch.length;++i) sb.append(ch[i]);
        return sb.toString();
    }
}