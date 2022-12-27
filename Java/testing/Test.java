package testing;
import java.util.List;
import java.util.LinkedList;

public class Test
{
    public static void main(String[] args)
    {
        List<Character> itemsTest = new LinkedList<>(); // Define char list
        String word = "pies";
        char[] splitedWord = word.toCharArray();
        System.out.println(splitedWord[3]);
        char letter = 'e';
        
        if (letter == splitedWord[2])
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
        
        System.out.println(word.indexOf(letter)); // Return index of letter
        
    }
}