class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int ans=0;
        Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int k=costs.length/2;
        for(int i=0;i<costs.length;++i){
            if(k-->0) ans+=costs[i][0];
            else
            ans+=costs[i][1];
        }
        return ans;
    }
}