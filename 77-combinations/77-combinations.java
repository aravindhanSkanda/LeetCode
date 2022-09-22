class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList();
		
		for(int i=1;i<=1<<n;i++)
		{
           // System.out.println(i);
		List <Integer> subList = new ArrayList();
		int c=0;
			for(int j=0;j<n;j++)
			{
                
					if((i&(1<<j))==(1<<j))
					{
					c++;
					subList.add(j+1);
					}
			}
        //    System.out.println(Arrays.toString(subList.toArray()));
			if(c==k)
			{
				ans.add(subList);
			}
		}
		return ans;
    }
}