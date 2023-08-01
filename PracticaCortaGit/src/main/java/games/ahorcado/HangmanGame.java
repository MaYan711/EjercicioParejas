package games.ahorcado;

import java.util.ArrayList;

import player.Player;
import utils.ConsoleData;
import utils.TextArt;

public class HangmanGame {

    private ArrayList<Character> lettersBag = new ArrayList<Character>();
    private char[] keyChars;
    private Player player;

    public HangmanGame(Hangman hangman) {
        keyChars = new char[hangman.getKeyWord().length()];
        this.player = hangman.getPlayer();
        refilKeyChars();
        hangmanGame(hangman);
    }

    private void hangmanGame(Hangman hangman) {

        boolean openKey = false;
        do {
            String letter = ConsoleData.getString("ingresa la letra de la palbra: ");

            if (letter.equals(hangman.getKeyWord())) {
                TextArt.showWinMessage();
                System.out.println(TextArt.GREEN+"\nfelicidades encontro la palabra: " + hangman.getKeyWord()+TextArt.RESET);
                openKey = true;
                this.player.setPoints(this.player.getPoints()+1);
            } else {

                if (!letter.equals("") && isNewLetter(letter.charAt(0))) {

                    boolean isPart = wordAnalyzer(hangman.getKeyWord(), letter.charAt(0));

                    if (isPart) {
                        System.out.println("felicidades la letra pertenece a la palabra");
                    } else {
                            hangman.setHints(hangman.getHints() - 1);
                        System.out.println(TextArt.RED+ "Has fallado" + TextArt.RESET);
                        TextArt.drawHangaman(hangman.getHints());
                    }
                }

                showKeyWord();
            }

        } while (hangman.getHints() != 0 && openKey == false);

        endGame();

    }

    private boolean wordAnalyzer(String keyWord, char letter) {

        boolean isPart = false;
        char[] letters = keyWord.toCharArray();
        int count = 0;
        if (isNewLetter(letter)) {
            lettersBag.add(letter);
            for (char c : letters) {
                if (letter == c) {
                    isPart = true;
                    keyChars[count] = letter;
                }
                count++;
            }
        }

        return isPart;
    }

    private boolean isNewLetter(char newLetter) {

        boolean isNew = true;

        for (char letter : lettersBag) {
            if (letter == newLetter) {
                System.out.println("Ya has ingresado esa letra");
                isNew = false;
                break;
            }
        }

        return isNew;
    }

    private void refilKeyChars() {
        for (int i = 0; i < keyChars.length; i++) {
            keyChars[i] = '_';
        }
    }

    private void showKeyWord() {
        String keyWord = "\n\t";
        for (char letter : keyChars) {
            keyWord += letter;
        }
        System.out.println(TextArt.GREEN + keyWord + TextArt.RESET);

    }

    private void endGame() {
        switch (ConsoleData.getInt("Para continuar jugando presione 1\n" +
                "Para regresar al menu presione 0\n", false)) {
            case 1:
                new HangmanGame(new Hangman());
                break;

            default:
                break;
        }

    }

}