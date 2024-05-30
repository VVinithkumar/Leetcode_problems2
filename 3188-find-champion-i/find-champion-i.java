class Solution {
    public int findChampion(int[][] grid) {
        int sum=0;
        int n=grid.length;
        int n1=grid[0].length;
       for(int i=0;i<n;i++)
       {
        sum=0;
        for(int j=0;j<n1;j++)
        {
            if(grid[i][j]==1)
            {
                sum++;
            }
        }
        if(sum==n-1) return i;
       }
         return -1;
    }
}