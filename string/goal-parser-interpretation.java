// https://leetcode.com/problems/goal-parser-interpretation/submissions/1195383007/
class Solution {
    public String interpret(String command) {
        String str = command.replace("()", "o");
        String answer = "";

        for(int i=0; i<str.length(); i++){
            answer += str.charAt(i)!=')'&& str.charAt(i)!='('? str.charAt(i) : "";
        }
        return answer;
    }
}
