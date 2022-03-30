class Solution {
    public int reverse(int x) {
        int uperlimit=2147483647;
        int lowerlimit=-2147483648;
        if(x>0){
            long ans=0;
            while(x>0){
                ans=ans*10+x%10;
                x=x/10;
            }
            if(ans<=uperlimit && ans>=lowerlimit) return (int) ans;
            else return 0;
        }else{
            long ans=0;
            x=-x;
            while(x>0){
                ans=ans*10+x%10;
                x=x/10;
            }
            ans=-ans;
            if(ans<=uperlimit && ans>=lowerlimit) return (int) ans;
            else return 0;
        }
    }
}