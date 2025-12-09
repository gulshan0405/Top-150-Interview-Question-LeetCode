import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
     public List<List<Integer>> threeSum(int[] nums) {
        //  int n = nums.length;
        // List<List<Integer>> list = new ArrayList<>();
        // for (int i = 0; i < n; i++) {
        //     for (int j = i + 1; j < n; j++) {
        //         for (int k = j + 1; k < n; k++) {
        //             List<Integer> triplet = new ArrayList<>();
        //             if (nums[i] + nums[j] + nums[k] == 0) {
        //                 triplet.add(nums[i]);
        //                 triplet.add(nums[j]);
        //                 triplet.add(nums[k]);
        //                 triplet.sort(null);
        //                 if (!list.contains(triplet)) {
        //                     list.add(triplet);
        //                 }
        //             }
        //         }
        //     }
        // }
        // return list;

        //better approach using hashmap
        // List<List<Integer>> result = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>();
        // int n = nums.length;
        // for (int i = 0; i < n; i++) {
        //     HashMap<Integer, Integer> map = new HashMap<>();
        //     for (int j = i + 1; j < n; j++) {
        //         int guess = -(nums[i] + nums[j]);
        //         List<Integer> triplet = new ArrayList<>();
        //         if (map.containsKey(guess)) {
        //             int k = map.get(guess);
        //             triplet.add(nums[i]);
        //             triplet.add(nums[j]);
        //             triplet.add(nums[k]);
        //             triplet.sort(null);
        //             set.add(triplet);
        //         }
        //         map.put(nums[j], j);
        //     }
        // }
        // result.addAll(set);
        // return result;

//optimal approach two pointers
          int n = nums.length;
    List<List<Integer>> list = new ArrayList<>();
    if (n < 3) {
        return list;
    }

    Arrays.sort(nums);

    for (int i = 0; i < n; i++) {
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue; // skip duplicates for n1
        }

        int target = -nums[i];

        List<List<Integer>> pairs = twoSum(nums, target, i + 1, n - 1);

        for (List<Integer> p : pairs) {
            List<Integer> triplet = new ArrayList<>();
            triplet.add(nums[i]);
            triplet.add(p.get(0));
            triplet.add(p.get(1));
            list.add(triplet);
        }
    }

    return list;
    }
    public List<List<Integer>> twoSum(int[] nums, int target, int a, int b) {
       List<List<Integer>> res = new ArrayList<>();

    while (a < b) {
        int sum = nums[a] + nums[b];

        if (sum > target) {
            b--;
        } else if (sum < target) {
            a++;
        } else {
            // found n2, n3
            res.add(Arrays.asList(nums[a], nums[b]));

            // skip duplicates
            int x = nums[a];
            int y = nums[b];

            while (a < b && nums[a] == x) a++;
            while (a < b && nums[b] == y) b--;
        }
    }

    return res;
    }
}
