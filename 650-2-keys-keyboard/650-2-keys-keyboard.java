class Solution {
    public int minSteps(int n) {
        int ans=0;
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                n=n/i;
                ans+=i;
            }
        }
        if(n>1)
        {
            ans+=n;
        }
        return ans;
    }
}