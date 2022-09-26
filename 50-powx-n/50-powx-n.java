class Solution {
    public double myPow(double x, int n) {
         if(n==0)
        {
            return 1;
        }
        double ans= pow(x, Math.abs(n));
        if(n<0)
        {
            ans=1/ans;
        }
       
        return ans;
    }
    
    public static double pow(double x, int n)
    {
         if(n==0)
        {
            return 1;
        }
        
        if(n==1)
        {
            return x;
        }
        else
        {
            if(n%2==0)
            return pow(x*x, n/2);
            else
            return pow(x*x,n/2)*x;
        }
    }
}