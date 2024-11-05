class Solution {
    public int getLucky(String s, int k) {
        char c[]=s.toCharArray();
        String ss="";
        int sum=0;
        for(int i=0;i<c.length;i++)
        {
            int a=c[i]-96;
            ss+=a;
        }
        for(int i=0;i<k;i++)
        {
            char c1[]=ss.toCharArray();
             ss="";
            for(int j=0;j<c1.length;j++)
            {
                sum+=c1[j]-'0';
            }
            if(k==1 || k==0)
            {
                return sum;
            }
            else
            {
                ss+=sum;
                sum=0;
            }
        }
        return Integer.parseInt(ss);
    }
}