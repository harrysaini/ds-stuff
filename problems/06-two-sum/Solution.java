import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for(int i = 0; i < nums.length ; i++){
            int num = nums[i];
            int diff = target - num;
            if(seen.containsKey(diff)){
                int result[] =  {i, seen.get(diff)};
                return result;
            }

            seen.put(num, i);
        }

        return new int[]{};

    }

    public static void main(String[] args) {
        int nums[] = {1,3,4,5,6,6,7,7,43,9};
        Solution solution = new Solution();
        int[] res = solution.twoSum(nums, 52);

        System.out.println(Arrays.toString(res));
    }
}
