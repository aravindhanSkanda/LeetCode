class Solution {
    public boolean isPowerOfTwo(int n) {
        long y=1;
        while(y<n)
        {
            y=y*2;
        }
        return y==n;
    
    }
}