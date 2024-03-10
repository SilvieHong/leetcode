// https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
class Solution {
    public int minimumSum(int num) {
        ArrayList<Integer> arrNum = new ArrayList<>();
        while (num > 0) {
            arrNum.add(num % 10);
            num /= 10;
        }
        Collections.sort(arrNum);

        int num1 = Integer.parseInt(arrNum.get(0).toString() + arrNum.get(2).toString());
        int num2 = Integer.parseInt(arrNum.get(1).toString() + arrNum.get(3).toString());

        return num1 + num2;
    }
}

/**
 Complexity:
 Time:O(nlogn) and Space:O(1)
 */
