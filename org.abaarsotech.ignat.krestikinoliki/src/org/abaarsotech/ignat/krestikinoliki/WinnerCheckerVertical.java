package org.abaarsotech.ignat.krestikinoliki;

/**
 * Created by IntelliJ IDEA.
 * User: frol
 * Date: 01.12.10
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
public class WinnerCheckerVertical implements WinnerCheckerInterface {
    private Game game;

    public WinnerCheckerVertical (Game game) {
        this.game = game;
    }
    public Player checkWinner() {
        Square[][] field = game.getField();
        Player currPlayer;
        Player lastPlayer = null;
        for (int i = 0, len = field.length; i < len; i++) {
            lastPlayer = null;
            int successCounter = 1;
            for (int j = 0, len2 = field[i].length; j < len2; j++) {
                currPlayer = field[j][i].getPlayer();
                if (currPlayer == lastPlayer && (currPlayer != null && lastPlayer !=null)) {
                    successCounter++;
                    if (successCounter == len2) {
                        return currPlayer;
                    }
                }
                lastPlayer = currPlayer;
            }
        }
        return null;
    }
}
