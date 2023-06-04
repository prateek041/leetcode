package dayone;

import java.util.HashSet;

public class ContainsDuplilcate {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    // This is bruto force.::wq O(n2) and therefore TLE on the leetcode platform.
    public static boolean containsDuplicate(int [] nums){
        int length = nums.length;
        for (int i = 0; i<length; i++){
            for(int j = i+1; j<length;j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    // Using hashset, it becomes o(n) and on leetcode 12ms, faster than 78% and memory usage 55.8mb, less than 78%.
    public static boolean containsDuplicateHash(int [] nums){
        int length = nums.length;
        if (length == 0){
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i<length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}

// check if any of the values have appreared twice in the array. Brute force

