import java.util.Stack;

public class JavaClass {
    public static void main(String[] args) {
        /*Write a function that checks if a string is a palindrome (reads the same forward and backward).*/
        String name = "BAAB";
        String reversed = " ";
        for(int l = name.length()-1; l>=0;l--){
            reversed +=name.charAt(l);
        }
        reversed = reversed.trim();
        boolean isPalindrome = name.equals(reversed);

        System.out.println("Is "+name+" a palindrome? "+isPalindrome);

        /* Write a function that encodes a string by repeating each character twice.*/
        String text = "doubleExample";
        StringBuilder repeated = new StringBuilder();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            repeated.append(ch).append(ch);// Append characters twice;
        }
        String encodedText = repeated.toString();
        System.out.println("Encoded text: "+encodedText);


        /*Write a function to count the number of vowels in a string.*/
        String letter = "Terminator";
        int vowelCount = 0;
        for(int t=0;t<letter.length();t++){
            char ch = letter.charAt(t);
            if(ch == 'A'||ch=='a'||
               ch == 'O'|| ch=='o'||
               ch == 'E'|| ch =='e'||
               ch == 'I' || ch=='i'||
               ch == 'U' || ch == 'u'){
                vowelCount++;
            }
        }
        System.out.println("Numbers of vowels "+vowelCount+ " in a letter "+letter);

        /*Write a function to convert a string from CamelCase to snake_case_text.*/
        String camelCaseString = "CamelCaseStringToSnakeCase";
        String snake_case_string = camelCaseString
                .replaceAll("([a-z])([A-Z])","$1_$2")
                .toLowerCase();
        System.out.println("Snake case: "+snake_case_string);


        /*count how many k letters*/
        String inputString = "lasdjkfsl;kdfs;lkdghshgs;lhgas;ahdgagfffffhjhhhhfddddd";
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for(int h=0;h<inputString.length();h++){
            stack.push(inputString.charAt(h));
        }
        int Count = 0;// count the letters;
        while(!stack.isEmpty()){
            if(stack.pop()=='f'){
                Count++;
            }
        }
        System.out.println("Count of letters in this sentense is "+Count +" in a letter "+inputString);





    }
}
