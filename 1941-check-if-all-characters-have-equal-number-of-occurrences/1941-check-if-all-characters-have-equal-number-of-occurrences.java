class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] a=new int[26];
        Arrays.fill(a,0);
        for(int i=0;i<s.length();i++){
            a[s.charAt(i)-'a']++;
        }
         int k=0;
        for(int i=0;i<26;++i){
            if(a[i]!=0){
                k=a[i];
                break;
            }
        }
        for(int i=1;i<26;++i){
            if(a[i]!=0){
                if(k!=a[i]) return false;
            }
        }
        return true;
    }
}