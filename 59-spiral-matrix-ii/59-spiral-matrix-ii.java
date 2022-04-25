class Solution {
    public int[][] generateMatrix(int n) {
        
        int left=0,top=0;
        int right=n-1,bottom=n-1;
        int k=1;
        int arr[][]=new int[n][n];
        int dir=1;
        
        while(left<=right && top<=bottom){
            if(dir==1){
                for(int i=left;i<=right;i++){
                    arr[top][i]=k++;
                }
                top++;
            }else if(dir==2){
                for(int i=top;i<=bottom;i++){
                    arr[i][right]=k++;
                }
                right--;
            }else if(dir==3){
                for(int i=right;i>=left;i--){
                    arr[bottom][i]=k++;
                }
                bottom--;
            }else{
                for(int i=bottom;i>=top;i--){
                    arr[i][left]=k++;
                }
                left++;
            }
            dir=(++dir)%4;
        }
        return arr;
    }
}