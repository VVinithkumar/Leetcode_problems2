import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        List<BigInteger> al=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            al.add(new BigInteger(nums[i]));
        }
        Collections.sort(al);
        BigInteger ans=al.get(al.size()-k);
        return ans.toString();
    }
}