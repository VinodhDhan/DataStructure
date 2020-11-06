package Stack;

import java.util.Stack;

public class InternalStack {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.pop();
        System.out.println(integerStack.peek());
    }
}
