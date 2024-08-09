class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al=new ArrayList<>();
         List<Integer> al1=new ArrayList<>();
        int count=0;
        for(int i=left;i<=right;i++)
        {
            if(i%10!=0)
            {
                al1.add(i);
            }
        }
        for(int i=0;i<al1.size();i++)
        {
            // int n=1;
            // if(al1.get(i)!=1) 
            // n=(int)Math.ceil(Math.log10(al1.get(i)));
            String s=String.valueOf(al1.get(i));
            char c[]=s.toCharArray();
            count=0;
            for(int j=0;j<c.length;j++)
            {
                int a=c[j]-'0';
                if(a==0)
                continue;
                if(al1.get(i)%a==0)
                {
                    count++;
                }
            }
            if(count==s.length())
            {
                al.add(al1.get(i));
            }
        }
        return al;
    }
}