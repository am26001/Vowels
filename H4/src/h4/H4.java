// program uses while loop and if-else to check if a string contains vowels and outputs the number of each vowel (a,e,i,o,u) then the total number of vowels 

package h4;

// import a scanner 
import java.util.Scanner;

public class H4 {

    public static void main(String[] args) {

        // create a scanner
        Scanner scnr = new Scanner(System.in);

        // prompt the user to enter a phrase
        System.out.println("Enter a phrase");

        // create a string to take user's phrase - call it "input"
        String input = scnr.nextLine();

        // create integer variable for string length - call it "len"
        int len = input.length();

        // create integer variable to keep track of where you are in the string, set it to 0 - call it "index"
        int index = 0;

        // create six integer variables for each vowel letter as a counter, set them all to 0 - call them to their appropriate letter, "vowelA"... "vowelU"
        int vowelA = 0;
        int vowelE = 0;
        int vowelI = 0;
        int vowelO = 0;
        int vowelU = 0;

        // create integer variable to add all the occurences of the six variables within the string input, should be set to 0 at the start - call it "totalVowels"
        int totalVowels = vowelA + vowelE + vowelI + vowelO + vowelU;

        // create while loop, index is less than length to check entire string, adds to vowel counter if index includes the character vowel while ignoring cases
        while (index < len) {

            if (Character.toLowerCase(input.charAt(index)) == 'a') {
                vowelA = vowelA + 1;
            } else if (Character.toLowerCase(input.charAt(index)) == 'e') {
                vowelE = vowelE + 1;
            } else if (Character.toLowerCase(input.charAt(index)) == 'i') {
                vowelI = vowelI + 1;
            } else if (Character.toLowerCase(input.charAt(index)) == 'o') {
                vowelO = vowelO + 1;
            } else if (Character.toLowerCase(input.charAt(index)) == 'u') {
                vowelU = vowelU + 1;
            }

            // move index by index or character by character within the string   
            index++;

        }

        // after going through loop and if-else branch, the vowels add each other and updates the total number of vowels variable
        totalVowels = vowelA + vowelE + vowelI + vowelO + vowelU;

        // output the user's string with double quotes
        System.out.println("The phrase is " + "\"" + input + "\"");

        // output the number of vowels: a,e,i,o,u and adds them up to output the total number of vowels, each print separate lines
        System.out.println("The number of a's: " + vowelA);
        System.out.println("The number of e's: " + vowelE);
        System.out.println("The number of i's: " + vowelI);
        System.out.println("The number of o's: " + vowelO);
        System.out.println("The number of u's: " + vowelU);
        System.out.println("The total number of vowels is: " + totalVowels);

    } // end main
} // end class    

