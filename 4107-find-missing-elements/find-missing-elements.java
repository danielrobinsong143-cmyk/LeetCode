class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];
        List<Integer> lst = new ArrayList<>();
        for(int val : nums){
            lst.add(val);
        }

        for(int i=1; i<n; i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=min+1; i<max; i++){
            if(!lst.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}