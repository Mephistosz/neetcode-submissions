class Solution {

    public boolean hasDuplicate(int[] nums) {
        Map<String, Integer> t = new HashMap<>();
        
        for(int i = 0 ;i<nums.length; i++){
            int x = i;
            for(int j = 0; j< nums.length; j++){
                int z = j;
                if(nums[i] == nums[j] && x != z){
                    return true;
                }
            }
        }
        return false;
    }

}