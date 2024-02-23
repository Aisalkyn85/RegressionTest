import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;

public class Checkbox {
    public static void main(String[] args) {














        /*Write a function that checks if a string is a palindrome (reads the same forward and backward).*/
        String name = "palindrome";
        char ch1;
        String reversed = " ";
        for (int l = name.length() - 1; l >= 0; l--) {
            reversed += name.charAt(l);
        }

        // Trim the space and then compare
        reversed = reversed.trim();
        boolean isPalindrome = name.equals(reversed);

        System.out.println("Is '" + name + "' a palindrome? " + isPalindrome);

        /* Write a function that encodes a string by repeating each character twice.*/

        String text = "repeat";
        StringBuilder repeated = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            repeated.append(ch).append(ch); // Append the character twice
        }

        String encodedText = repeated.toString();
        System.out.println("Encoded Text: " + encodedText);

        /*Write a function to find the longest word in a string.*/

        String sentence = "I am a Software engineer and I earn six figures";
        String[] words = sentence.split("\\s+"); // Splitting the sentence into words

        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        System.out.println("Longest Word: " + longestWord);

        /*Write a function to count the number of vowels in a string.*/
        String letter = "Operation";
        int vowelCount = 0;

        for (int t = 0; t < letter.length(); t++) {
            char ch = letter.charAt(t);
            if (ch == 'A' || ch == 'a' ||
                    ch == 'E' || ch == 'e' ||
                    ch == 'I' || ch == 'i' ||
                    ch == 'O' || ch == 'o' ||
                    ch == 'U' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);

        /*Write a function to convert a string from CamelCase to snake_case.*/
        String camelCaseString = "CamelCaseToSnakeCase";
        String snake_case_string = camelCaseString
                .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                .toLowerCase();

        System.out.println("Snake Case: " + snake_case_string);



        /*count how many k letters*/

        String inputString = "ladle;sgha;lkhg;alkhg;alh;lkhg";
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }

        int Count = 0;
        while (!stack.isEmpty()) {
            if (stack.pop() == 'k') {
                Count++;
            }
        }

        System.out.println("Number of 'k' letters in the string: " + Count);

        /*In Java, a StringBuffer is a thread-safe, mutable sequence of characters. It's commonly
         used for creating and manipulating strings when you need to make lots of modifications to them,
          such as in loops. Here's a basic guide on how to use StringBuffer in Java:*/
        /*You can create a StringBuffer object either with an initial string or without it.
        If you don't provide a string, it starts empty.*/

        StringBuffer buffer = new StringBuffer(); // empty buffer
       // StringBuffer bufferWithText = new StringBuffer("Hello"); // buffer with "Hello"
        /*You can add text to the end of the StringBuffer using the append() method.*/
        buffer.append("World");
        System.out.println(buffer);
        /*Inserting Text:
To insert text at a specific position, use the insert() method.*/
        buffer.insert(0, "Start: My first "); // Inserts at the beginning
        System.out.println(buffer);
        /*Replacing Text:
Use the replace() method to replace text within a specific range.*/
        buffer.replace(0, 5, "End: sentence"); // Replaces characters from index 0 to 4
        System.out.println(buffer);
       /* Deleting Text:
        To remove text, use the delete() method.*/
        buffer.delete(0, 4); // Deletes characters from index 0 to 3
        System.out.println(buffer);
/*Converting to String:
When you're done manipulating the text, you can convert the StringBuffer to a String.*/
        String finalString = buffer.toString();
        System.out.println(finalString);

















    }
}
