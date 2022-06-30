class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int len = nums.length;
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
    
        for (int i = 0 ; i <= len - 3 ; i++){
            if(i > 0 && nums[i-1] == nums[i])
                continue;
           int start = i + 1;
           int end = len - 1;
            while(start < end){
                if(nums[i] + nums[start] + nums[end] > 0){
                    end--;
                }else if(nums[i] + nums[start] + nums[end] < 0){
                    start++;
                }else{
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    while(nums[start] == nums[start-1] && start < end ){
                        start++;
                    }
                }
            }
        }
        
        return result;
    }
}