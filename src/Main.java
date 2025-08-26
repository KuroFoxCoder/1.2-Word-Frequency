import java.util.Scanner; //https://www.w3schools.com/java/java_user_input.asp
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please type a sentence: ");
        String sentence = input.nextLine();
        if(sentence.split(" ").length > 20)
        {
            System.out.println("Your sentence was more than 20 words. Please type a new sentence: ");
            sentence = input.nextLine();
        }
        String[] wordList = sentence.split(" ");
        for(int i=0; i < wordList.length-1; i++)
        {
            int freq = getWordFrequency(wordList, wordList.length, wordList[i]);
            System.out.println(wordList[i] + " " + freq);
        }
    }
    public static int getWordFrequency(String[] wordList, int listSize, String currentWord)
    {
        int frequency = 0;
        for(int i = 0; i<listSize; i++)
        {
            if(wordList[i].equalsIgnoreCase(currentWord))
            {
                frequency = frequency + 1;
            }
        }
        return frequency;
    }
}