public class guessChecker {
    private String wordToGuess;

    public guessChecker(String wordToGuess) {
        this.wordToGuess = wordToGuess;
    }

    public color[] check(String guess) {
        color[] result = new color[wordToGuess.length()];
        for (int i = 0; i < guess.length(); i++) {
            if (wordToGuess.charAt(i) == guess.charAt(i))
                result[i] = color.GREEN;
            else if (wordToGuess.indexOf(guess.charAt(i)) > -1)
                result[i] = color.YELLOW;
            else
                result[i] = color.GRAY;
        }
        return result;
    }

    public boolean check(color[] result) {
        for (color c : result) {
            if (c != color.GREEN)
                return false;
        }
        return true;
    }
}
