package chapter14;

import java.security.SecureRandom;

public class sentenceGenerator {
    private static String [] noun = {"Wale", "boy", "lion", "money", "friend"};
    private static String [] preposition = {"to", "from", "over", "under", "an"};
    private static String [] article = {"a", "the", "some", "one", "any"};
    private static String [] verb = {"drove", "walked", "spent", "one", "any"};
    
    public static String createSentence(){
        SecureRandom random = new SecureRandom();
        int index = random.nextInt(5);
        StringBuilder stringBuilder = new StringBuilder();
        String firstWord = article[index];
        char firstLetter = firstWord.charAt(0);
        char capitalLetter = Character.toUpperCase(firstLetter);
        firstWord = firstWord.replace(firstWord.charAt(0), capitalLetter);
        stringBuilder.append(firstWord).append(" ");
        stringBuilder.append(noun[index]) .append(" ");
        stringBuilder.append(verb[index]).append(" ");
        stringBuilder.append(preposition[index]).append(" ");
        stringBuilder.append(article[index]).append(" ");
        stringBuilder.append(noun[random.nextInt(5)]).append(" ");

        return stringBuilder.toString();
    }

    public static void createMultipleSentences(){
        for (int index = 0; index <20; index++){


            System.out.println(createSentence());
        }
    }

    public static void main(String[] args) {
        createMultipleSentences();
    }
}
