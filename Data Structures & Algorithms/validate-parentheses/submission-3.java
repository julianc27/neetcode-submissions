class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (stack.isEmpty()){
                return false;
            }
            if (c == '}' && !stack.pop().equals('{')) {
                return false;
            }

            if (c == ']' && !stack.pop().equals('[')) {
                return false;
            }
            
            if (c == ')' && !stack.pop().equals('(')) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
