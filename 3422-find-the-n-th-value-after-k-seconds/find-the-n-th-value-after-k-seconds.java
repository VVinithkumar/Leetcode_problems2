class Solution {
    public int valueAfterKSeconds(int n, int k) {
      int arr[]=new int[n];
      Arrays.fill(arr,1);
      int v=0;
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