class Solution {
    public int valueAfterKSeconds(int n, int k) {
      int arr[]=new int[n];
      int v=0;
      for(int i=0;i<n;i++)
      {
         arr[i]=1;
      }
      while(v<k)
      {
         for(int i=0;i<arr.length-1;i++)
        {
            int a=(arr[i]+arr[i+1])%1000000007;
            arr[i+1]=a;
        } 
        v++;
      } 
      return arr[n-1];
    }
}