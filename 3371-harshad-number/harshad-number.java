class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int num=0;
        int ans=0;
        int t=x;
        while(x>0)
        {
            num=x%10;
            ans+=num;
            x/=10;
        }
        if(t%ans==0)
        {
            return ans;
        }
            return -1;
    }
}