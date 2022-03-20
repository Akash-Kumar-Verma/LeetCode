class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int a[]=new int[2];
        a[0]=tops[0];
        a[1]=bottoms[0];
        int min=Integer.MAX_VALUE;
       
        for(int i=0;i<2;i++){
            int top=0;
            int bot=0;
             boolean flag=true;
            for(int j=0;j<tops.length;++j){
                if(tops[j]==a[i] || bottoms[j]==a[i]){
                    if(tops[j]!=a[i]) top++;
                    else if(bottoms[j]!=a[i]) bot++;
                }else{
                    flag=false;
                    break;
                }
            }
          if(flag)  min=Math.min(top,bot);
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
}