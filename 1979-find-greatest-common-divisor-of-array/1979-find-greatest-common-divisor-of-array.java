class Solution {
    public int findGCD(int[] nums) {
        int small=nums[0];
        int large=nums[0];
        for(int num:nums)
        {
            small=small>num?num:small;
            large=large<num?num:large;
        }
        
        return findGCD(small, large);
    }
    
    public static int findGCD(int a, int b)
    {
        if(a==0)
        {
            return b;
        }
        return findGCD(b%a,a);
    }
        
}