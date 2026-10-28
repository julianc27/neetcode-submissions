class Solution {
    public int evalRPN(String[] tokens) {
        int answer = 0;
        if (tokens.length == 1) {
            try {
                return Integer.parseInt(tokens[0]);
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        Deque<Integer> stack = new ArrayDeque();
        for (int i = 0; i < tokens.length; i++) {
            try {
                stack.push(Integer.parseInt(tokens[i]));
            } catch (NumberFormatException e) {
                if (tokens[i].equals("+")) {
                    answer = (stack.pop() + stack.pop());
                    stack.push(answer);
                } else if (tokens[i].equals("-")) {
                    int secondNum = stack.pop();
                    int firstNum = stack.pop();
                    answer = firstNum - secondNum;
                    stack.push(answer);
                } else if (tokens[i].equals("*")) {
                    int secondNum = stack.pop();
                    int firstNum = stack.pop();
                    answer = firstNum * secondNum;
                    stack.push(answer);
                } else if (tokens[i].equals("/")) {
                    int secondNum = stack.pop();
                    int firstNum = stack.pop();
                    answer = firstNum / secondNum;
                    stack.push(answer);
                }
            }
        }
        return answer;
    }
}
