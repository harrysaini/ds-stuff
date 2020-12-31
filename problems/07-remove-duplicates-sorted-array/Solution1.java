import java.util.Arrays;

class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        int currentIndex = 0;
        int populatorindex = 0;
        int prevElem = -1;

        while(currentIndex < nums.length) {
            int elem = nums[currentIndex];
            if(elem != prevElem){
                nums[populatorindex] = elem;
                populatorindex++;
            }
            prevElem = elem;
            currentIndex++;

        }

        return populatorindex;
    }
    public static void main(String[] args) {
        int nums[] = {1,1, 2};
        Solution1 solution = new Solution1();
        int len = solution.removeDuplicates(nums);

        System.out.println(Arrays.toString(nums));
        System.out.println(len);
    }
}
