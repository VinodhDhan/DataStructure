package test;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    static int result =0;
    public static void main(String[] args) {
     //   dfs(0, "132", 0, 0);
        int[] nums = {1,1,1,2,3,1};
       // productExceptSelf(nums)
        System.out.println(contionousSubArray(nums,3));
    }

    public static int contionousSubArray(int[] nums, int k){
        int result =0, sum =0;
        HashMap<Integer, Integer> preSum = new HashMap<>();
        preSum.put(0,1);
        for(int i=0; i<nums.length;i++){
            sum = sum + nums[i];
            int complement = sum - k ;
            if(preSum.containsKey(complement)){
                result = result + preSum.get(complement);
            }
            preSum.put(sum, preSum.getOrDefault(sum,0)+1);
        }
        return result;
    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        // Calculate lefts and store in res.
        int left = 1;
        for (int i = 0; i < n; i++) {
            if (i > 0)
                left = left * nums[i - 1];
            res[i] = left;
        }
        // Calculate rights and the product from the end of the array.
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i < n - 1)
                right = right * nums[i + 1];
            res[i] *= right;
        }
        return res;
    }

    private static void dfs(int index, String input, int num, int k) {
        if (index == input.length()) {
            if (num == k) {
                result++;
            }

            return;
        }

        int currDigit = input.charAt(index) - '0';

        dfs(index+1, input, num + currDigit, k);
        dfs(index+1, input, num - currDigit, k);
    }
}
