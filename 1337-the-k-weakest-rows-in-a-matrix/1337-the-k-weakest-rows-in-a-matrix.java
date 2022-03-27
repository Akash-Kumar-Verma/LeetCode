class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] ans=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            int count=0;
            for(int j=0;j<mat[0].length;j++){
               if(mat[i][j]==1){
                    count++;
                }
            }
            ans[i]=count*1000+i;
        }
        Arrays.sort(ans);
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=ans[i]%1000;
        }
        return res;
    }
}