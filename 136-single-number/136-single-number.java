class Solution {
    public int singleNumber(int[] nums) {
        int h=0;
        for(int n:nums)
        {
            h=h^n;
        }
        return h;
    }
}