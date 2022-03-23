class Solution {
    public int brokenCalc(int startValue, int target) {
        if(startValue>=target) return startValue-target;
        int count=0;
        while(target>startValue){
            count++;
            if(target%2==0){
                target/=2;
            }else
                target+=1;
        }
        return count+(startValue-target);
    }
}