package Problems;

import java.util.ArrayList;
import java.util.List;

public class subarray_combination {
    
    // Function to generate all subarrays
    public static List<List<Integer>> generateSubarrays(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        
        // Loop to generate all subarrays
        for (int i = 0; i < n; i++) {
            List<Integer> subarray = new ArrayList<>();
            for (int j = i; j < n; j++) {
                subarray.add(nums[j]);
                result.add(new ArrayList<>(subarray)); // Add a copy of subarray to result
            }
        }
        return result;
    }
    
    // Function to print subarrays
    public static void printSubarrays(List<List<Integer>> subarrays) {
        for (List<Integer> subarray : subarrays) {
            System.out.println(subarray);
        }
    }
    
    // Main method
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> subarrays = generateSubarrays(nums);
        printSubarrays(subarrays);
    }
}

