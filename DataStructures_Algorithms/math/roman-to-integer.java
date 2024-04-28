//https://leetcode.com/problems/roman-to-integer/
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (i < s.length() - 1 && map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                answer -= map.get(s.charAt(i));
            } else {
                answer += map.get(s.charAt(i));
            }
        }
        return answer;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */





class betterSolution {
    public int romanToInt(String s) {
        int answer=0, value=0, prev=0;

        for(int i=s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'M' -> value=1000;
                case 'D' -> value=500;
                case 'C' -> value=100;
                case 'L' -> value=50;
                case 'X' -> value=10;
                case 'V' -> value=5;
                case 'I' -> value=1;
            }
            if(value<prev){
                answer -= value;
            }else{
                answer += value;
            }
            prev=value;
        }
        return answer;
    }
}
/**
 * Complexity:
 * Time:O(n) and Space:O(1)
 */
