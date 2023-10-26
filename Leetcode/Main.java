public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums = {0,4,3,0};
        int target = 0;

        int response[] = solution.twoSum(nums, target);
        System.out.println(response[0] + "," + response[1]);
    }
    
}
