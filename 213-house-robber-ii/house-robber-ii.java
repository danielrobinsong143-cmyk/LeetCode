class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int val1 = find(nums, 0, n-1);
        int val2 = find(nums, 1, n);
        return Math.max(val1, val2);
    }

    private int find(int[] nums, int start, int end){
        if(start == end-1) return nums[start];
        int prev2 = nums[start];
        int prev1 = Math.max(prev2, nums[start+1]);
        for(int i=start+2; i<end; i++){
            int curr = Math.max(prev1, nums[i]+prev2);

            prev2 = prev1;
            prev1 = curr;
        }
        return prev1;
    }
}