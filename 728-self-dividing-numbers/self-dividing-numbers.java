class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al=new ArrayList<>();
        int count=0;
        for(int i=left;i<=right;i++)
        {
            String s=String.valueOf(i);
            char c[]=s.toCharArray();
            count=0;
            for(int j=0;j<c.length;j++)
            {
                int a=c[j]-'0';
                if(a==0)
                continue;
                if(i%a==0)
                {
                    count++;
                }
            }
            if(count==s.length())
            {
                al.add(i);
            }
        }
        return al;
    }
}