class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(i==j || i+j==n-1){
                    if(grid[i][j]==0){
                        return false;
                    }
                }
                if(i!=j && i+j!=n-1){
                    if(grid[i][j]!=0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
