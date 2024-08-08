class Solution {
    public boolean digitCount(String num) {
        char c[]=num.toCharArray();
        String ss="";
         int count=0;
        for(int i=0;i<c.length;i++)
        {
             count=0;
            for(int j=0;j<c.length;j++)
            {
                if(i==c[j]-'0')
                {
                    count++;
                }
            }
            ss+=count;
        }
        if(num.equals(ss))
        {
            return true;
        }
        return false;
    }
}