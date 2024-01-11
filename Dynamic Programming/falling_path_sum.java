public class falling_path_sum {
    public static void main(String[] args) {
        
    }
    public int minFallingPathSum(int[][] grid) {
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            ans=Math.min(ans,solve(grid,0,i));
        }
        return ans;
    }
    static int solve(int [][]grid,int cr,int cc){
        if(cr==grid.length-1){
            return grid[cr][cc];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<grid[0].length;i++){
            if(i!=cc){
                ans=Math.min(ans,solve(grid,cr+1,i));
            }
        }
        return ans+grid[cr][cc];
    }
}
