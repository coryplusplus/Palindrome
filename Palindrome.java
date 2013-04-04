import java.util.*;
import java.io.*;

public class Palindrome
{

    public static BufferedReader reader;

    public static String getCommand()

    {

        System.out.println("Enter Word:");

        return getLine();

 

    }


    public static String getLine()

    {

        String line = new String();

        try

        {

            line = reader.readLine();

        }

        catch (IOException ioe)

        {

            //statement to execute if an input/output exception occurs

            System.out.println("An unexpected error occured.");

        }
        if(line.equals("exit") || line.equals("quit"))
        {
             System.exit(0);
        }

        return line;

    }




    public static boolean isPalindrome(String word)
    {
        int start_iterator = 0;
        int end_iterator = word.length();
        if(end_iterator == 1)
        {
            System.out.println("There is only one character in this word silly, of course it is a palindrome!");
            return true;
        }
        for(int i = 0 ; start_iterator < end_iterator; start_iterator = start_iterator + 1, end_iterator = end_iterator - 1)
        {
            if(word.charAt(start_iterator) != word.charAt(end_iterator-1))
            {
                return false;
            }

        }
        return true;


    }

    public static void main(String args[]) 
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I will tell you if the word you enter is a palindrome!");
        System.out.println("Type exit or quit if you would like to quit.");
        while(true)
        {
            if(isPalindrome(getCommand()))
            {
                System.out.println("This word is indeed a palindrome!");
                System.out.println();
            }
            else
            {
                System.out.println("This word is not a palindrome");
                System.out.println();
            }
        }

    }

}
