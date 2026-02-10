class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] temp = path.split("/");
        for (String i : temp) {
            if (i.equals(".") || i.isEmpty()) {
                continue;
            } else if (i.equals("..")) {
                if (!stack.isEmpty()) { 
                    stack.pop();
                }
            } else { 
                stack.push(i);
            }
        }
        return "/" + String.join("/", stack);
    }
}