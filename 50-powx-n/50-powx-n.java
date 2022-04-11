class Solution {
    public double myPow(double x, int n) {
        return power(x,n);
       
    }
    public double power(double x,long n){
         if(n==0) return 1;
        else if(n<0){
            return 1.0/power(x,-1*n);
        }else if(x==1){
            return x;
        }else{
            return n%2==0 ? power(x*x,n/2):x*power(x*x,(n-1)/2);
        }
    }
}