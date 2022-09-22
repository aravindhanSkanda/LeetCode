class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList();
		
		for(int i=1;i<=1<<n;i++)
		{
		List <Integer> subList = new ArrayList();
			for(int j=0;j<n;j++)
			{
                
					if((i&(1<<j))==(1<<j))
					{
					subList.add(j+1);
					}
			}
			if(subList.size()==k)
			{
				ans.add(subList);
			}
		}
		return ans;
    }
}