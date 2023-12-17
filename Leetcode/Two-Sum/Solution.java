import java.util.HashMap;
import java.util.Map;

class Solution {

    // key: complement; value: index
    private Map<Integer, Integer> complements = new HashMap<>();
    
    public int[] twoSum(int[] nums, int target) {
        int[] twoSum = {-1, -1};

        for(int i = 0; i < nums.length; i++) {
            int valueComplements =  target - nums[i];

            if(complements.containsKey(nums[i])){
                twoSum[0] = complements.get(nums[i]);
                twoSum[1] = i;
                return twoSum;
            }

            complements.put(valueComplements, i);
        }
        
        return twoSum;
    }

}