class Solution {
    public int findChampion(int[][] grid) {
        int sum=0;
        int ans=0;
        int n=grid.length;
        int n1=grid[0].length;
        List<Integer> al=new ArrayList<>();
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
        al.add(sum);
       } 
       int max=Collections.max(al);
       for(int i=0;i<al.size();i++)
       {
         if(max==al.get(i))
         {
            return i;
         }
       }
       return -1;
    }
}