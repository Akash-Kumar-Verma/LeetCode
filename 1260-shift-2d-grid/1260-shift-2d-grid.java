class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int p=0;
         int a[]=new int[m*n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[p]=grid[i][j];
                p++;
            }
        }
        rotate(a,k);
        List<List<Integer>> ans=new ArrayList<>();
        int c=0;
        for(int i=0;i<m;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<n;j++){
                temp.add(a[c++]);
            }
            ans.add(temp);
        }
        return ans;
    }
    public static void rotate(int arr[],int p){
        int k=p%arr.length;
        int n=arr.length;
        while(k-->0){
        int i, temp;
        temp = arr[n-1];
        for (i = n-1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
        }
    }
    
}