package chapter7;

import java.util.Scanner;

/*user inputs a value string
The letters are reversed
    To reverse, the loop starts printing the letters from the index at array.length
 */
public class ReverseNaming {
    private static String collectWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        return scanner.nextLine();
    }

    public static void reversePrinting(){
        String word = collectWord();
        for (int i = word.length()-1; i >= 0; i--){
            System.out.print(word.charAt(i));
        }
    }
    public static void main(String[] args) {
        reversePrinting();
    }
}
