class Solution {
    public int countPrimes(int n) {
        boolean [] arr= new boolean[n];
    
        if(n<=2)
        {
            return 0;
        }
        int c=0;
        for(int i=2;i*i<n;i++)
        {
            if(!arr[i])
            {
                int j=2;
                while(j*i<n)
                {
                    arr[j*i]=true;
                    j++;
                }
            }
        }
        for(Boolean b:arr)
        {
            if(!b)
            {
             c++;   
            }
        }
        return c-2;
        
    }
}