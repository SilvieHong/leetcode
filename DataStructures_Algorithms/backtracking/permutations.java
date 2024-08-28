//https://leetcode.com/problems/permutations/description/
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backTrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for (int num : nums) {
                if (!tempList.contains(num)) {
                    tempList.add(num);
                    backTrack(list, tempList, nums);
                    tempList.remove(tempList.size() - 1);
                }
            }
        }
    }
}
