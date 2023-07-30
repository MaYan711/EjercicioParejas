package games.ahorcado;

import java.util.ArrayList;

import utils.ConsoleData;

public class HangmanGame {

    private Hangman hangman;
    private ArrayList<Character> lettersBag = new ArrayList<Character>();
    private char[] keyChars;

    public HangmanGame(Hangman hangman) {
        this.hangman = hangman;
        keyChars = new char[hangman.getKeyWord().length()];
        refilKeyChars();
        hangmanGame(hangman);

    }

    private void hangmanGame(Hangman hangman) {

        boolean openKey = false;
        do {
            String letter = ConsoleData.getString("ingresa la letra de la palbra: ");

            if (letter.equals(hangman.getKeyWord())) {
                System.out.println("felicidades encontro la palabra: " + hangman.getKeyWord());
                openKey = true;
            } else {

                if (!letter.equals("") && isNewLetter(letter.charAt(0))) {
                    boolean isPart = wordAnalyzer(hangman.getKeyWord(), letter.charAt(0));

                    if (isPart) {
                        System.out.println("felicidades la letra pertenece a la palabra");
                    } else {
                        hangman.setHints(hangman.getHints() - 1);
                        System.out.println("la letra ingresada no esta en lapalabra, vuelva a intentarlo\n"
                                + "le quedan " + hangman.getHints() + " intentos");
                    }

                }

                showKeyWord();
            }

        } while (hangman.getHints() != 0 && openKey == false);

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
        String keyWord = "";
        for (char letter : keyChars) {
            keyWord += letter;
        }
        System.out.println(keyWord);

    }

}