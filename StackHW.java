package homeWork7;

import java.util.Stack;

public class StackHW {
    public static void main(String[] args) {

        Stack<String> newStack = new Stack<String>();
        newStack.push("Central Park, Manhattan");
        newStack.push("Prospect Park, Brookly,");
        newStack.push("Forest Park, Queens");
        newStack.push("Corona Park, Queens");
        newStack.push("Ramna Park, Dhaka");

        while (!newStack.isEmpty()){
            System.out.println(newStack.pop());
        }

    }
}
