package games.ahorcado;

import java.util.Random;

import player.Player;

public class Hangman {

    private Player player;
    private String keyWord;
    private int hints = 8;

    public Hangman(Player player) {
        this.keyWord = getNewKeyWord();
        this.player = player;
        new HangmanGame(this);
    }

    private String getNewKeyWord() {
        int pick = new Random().nextInt(enumKeyWords.values().length);
        return enumKeyWords.values()[pick].toString();
    }

    /**
     * @return Player return the player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * @param player the player to set
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * @param keyWord the keyWord to set
     */
    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    /**
     * 
     * @return String return the keyWord
     */

    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return int return the hints
     */
    public int getHints() {
        return hints;
    }

    /**
     * @param hints the hints to set
     */
    public void setHints(int hints) {
        this.hints = hints;
    }

}