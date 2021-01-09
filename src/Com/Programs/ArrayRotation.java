package Com.Programs;

import java.util.*;

public class ArrayRotation {
    // Write your code here.
    Stack<Character> stk = new Stack<Character>();
    Queue<Character> queue = new LinkedList<>();
    public void pushCharacter(char ch){
        stk.push(ch);

    }
    public void enqueueCharacter(char ch){
        queue.add(ch);


    }
    public char popCharacter(){
        return stk.pop();

    }
    public char dequeueCharacter(){
        return queue.poll();

    }



    public static void main(String[] args) {

        String input = "racecar";


        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        ArrayRotation p = new ArrayRotation();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
