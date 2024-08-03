class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
           String s=String.valueOf(nums[i]);
           char c[]=s.toCharArray();
           for(int j=0;j<c.length;j++)
           {
            int n=c[j]-'0';
              al.add(n);
           }
        }
        int arr[]=new int[al.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=al.get(i);
        }
        return arr;
    }
}