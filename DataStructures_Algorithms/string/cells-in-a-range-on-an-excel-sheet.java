// https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/
class Solution {
    public List<String> cellsInRange(String s) {
        // extracting alphabets
        int head = s.charAt(0);
        int tail = s.charAt(3);
        // extracting numbers
        int start = Integer.parseInt(String.valueOf(s.charAt(1)));
        int end = Integer.parseInt(String.valueOf(s.charAt(4)));

        List<String> list = new ArrayList<>();
        for (int i = 0; i < tail - head + 1; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append((char) (head + i));
            for(int j=start; j<=end; j++){
                sb.append(j);
                list.add(String.valueOf(sb));
                sb.deleteCharAt(1);
            }
        }
        return list;
    }
}

/**
 * Complexity:
 * Time:O(n^2) and Space:O(n)
 */
