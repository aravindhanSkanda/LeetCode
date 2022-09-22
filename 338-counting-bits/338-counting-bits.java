class Solution {
    public int[] countBits(int n) {
        int [] ans=new int[n+1];

for(int i=0;i<=n;i++)
{
int h=i;
int c=0;
	while(h!=0)
	{
	if((h&1)==1)
	{
	c++;
	}
	h=h>>1;
	}
	ans[i]=c;
}
return ans;
    }
}