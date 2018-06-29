package Lab_P06_StackOfStrings;

public class Main {
    public static void main(String[] args) {
StackOfStrings stack = new StackOfStrings();
stack.push("three");
        stack.push("two");
        stack.push("one");
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}