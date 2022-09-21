class Solution {
    public boolean isPowerOfTwo(int n) {
        long y=0;
        
        for(long i=1;i<=n;i=i*2)
        {
            if((n&i)==i)
            {
                y++;
            }
            if(y>1)
            {
                return false;
            }
        }
        return y==1;
    }
}