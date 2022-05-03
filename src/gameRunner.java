import java.io.*;
import java.util.*;

public class gameRunner {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<String> wordList = new ArrayList<String>();
        Scanner s = new Scanner(new File("words"));
        while (s.hasNext()){
            wordList.add(s.next());
        }
        s.close();

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to play: ");
        System.out.println("a) Single Player");
        System.out.println("b) Player VS AI");
        System.out.println("c) Player VS Player");
        System.out.println("d) AI Demo");

        String i = sc.next();
        i = i.toLowerCase();

        String wordToPlay = getRandomWord(wordList);
        if (i.equals("a"))
            playSingle(wordToPlay);
        if (i.equals("b"))
            playAI(wordToPlay);
        if (i.equals("c"))
            playPVP(wordToPlay);
        if (i.equals("d"))
            playDEMO(wordToPlay);
        else {
            System.out.println("Please enter either a, b, c, or d");
            main(args);
        }

    }

    private static void playSingle(String keyword) {
        System.out.println();
        System.out.println();
        System.out.println();

        getGuess();
    }

    private static void playAI(String keyword) {
    }

    private static void playPVP(String keyword) {

    }

    private static void playDEMO(String keyword) {

    }
    private static String getRandomWord(List<String> wordList) {
        return wordList.get((int) (Math.random() * wordList.size()));
    }

    private static void getGuess() {

    }
}
