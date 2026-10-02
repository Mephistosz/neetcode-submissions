class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> t = new HashSet<>();

        for (int num: nums){
            if(t.contains(num)){
            return true;
            }

            t.add(num);
        }

        return false;
    }
}