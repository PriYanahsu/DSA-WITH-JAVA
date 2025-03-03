import java.util.Stack;

public class Practice {
    public static void main(String[] args) {
        String str = "3[a]2[bc]";
        System.out.println(findStr(str)); // Output: "aaabcbc"
    }

    public static String findStr(String str) {
        Stack<Integer> numStack = new Stack<>(); // Stack for numbers
        Stack<StringBuilder> strStack = new Stack<>(); // Stack for substrings
        StringBuilder currentStr = new StringBuilder();
        int num = 0;

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); // Handle multi-digit numbers
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(currentStr);
                num = 0;
                currentStr = new StringBuilder(); // Start a new substring
            } else if (ch == ']') {
                int repeatTimes = numStack.pop();
                StringBuilder temp = strStack.pop();

                // Append the repeated version of currentStr
                temp.append(currentStr.toString().repeat(repeatTimes));

                currentStr = temp; // Update currentStr with the result
            } else {
                currentStr.append(ch);
            }
        }

        return currentStr.toString();
    }
}
