
package snakeandladder;

import java.io.Serializable;


public class GameScore implements Comparable<GameScore>,Serializable {
    private String name; //This handles the name of the person who is playing.
    private int playerMoves;  //This counts the player moves when the game is finished.
    private int dimension; //This displays the dimension, when the user customise his/her own grid with a different dimension value, this will display rather than the default (High Score Table).

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPlayerMoves() {
		return playerMoves;
	}

	public void setPlayerMoves(int playerMoves) {
		this.playerMoves = playerMoves;
	}

	public int getDimension() {
		return dimension;
	}

	public void setDimension(int dimension) {
		this.dimension = dimension;
	}

	@Override
    public int compareTo(GameScore score) {
        GameScore gameScore = (GameScore)score;
        if(playerMoves>gameScore.playerMoves){ 
            return 1;
        }
        else{
            return -1;
        }
    }
}
