// https://leetcode.com/problems/find-the-highest-altitude/
class Solution {
    public int largestAltitude(int[] gain) {
        int[] arr = new int[gain.length + 1];
        arr[0] = 0;
        int temp = 0;

        for(int i=1; i<arr.length; i++){
            arr[i] = temp + gain[i-1];
            temp = arr[i];
        }
        
        int answer = 0;
        for(int i=0; i<arr.length; i++){
            answer = Math.max(answer, arr[i]);
        }
        return answer;
    }
}

/**
 * Complexity:
 * Time:O(n) and Space:O(n)
 */
