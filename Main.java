import uulib.Console;
import uulib.ArrayUtils;

public class Main {

    // Challenge question 1
    public static void countdown(int x) {
        // complete this method
      char[] word = {'C', 'O', 'D', 'E'};
      int i = 0;
      while (x >= 1){
        System.out.println(x + " " + word[i]);
        i = i + 1;
        if (i == word.length){
          i = 0;
        }
        x = x - 1;
      }
    }

    public static void question1() {
        // COMPLETE THIS METHOD
      int num = Console.getInt("Please enter a positive number: ");
      countdown(num);
    }

    // Challenge Question 2    
    public static void question2() {
        // Create an interactive program that calls the methods in the morse class to prove they work
       // Morse.messageToMorse("the quick brown") and Morse.messageFromMorse("._ / ....") to prove they work
      System.out.println();  // separating line
        String morseCodeTest = Morse.messageToMorse("the quick brown");
        System.out.println(morseCodeTest + "\n\n" + Morse.messageFromMorse(morseCodeTest));
        System.out.println();
        System.out.println(Morse.messageFromMorse("._ / ...."));
        
        String userMessage = Console.getString("\nPlease enter a message: ");
        String morseCode = Morse.messageToMorse(userMessage);
        String decodedMessage = Morse.messageFromMorse(morseCode);
    }


    public static void main(String[] args) {
        
        question1();
        question2();

    }




}