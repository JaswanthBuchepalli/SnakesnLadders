
package snakeandladder;

import java.io.Serializable;


public class GameScore implements Comparable<GameScore>,Serializable {
    String name; //This handles the name of the person who is playing.
    int playerMoves;  //This counts the player moves when the game is finished.
    int dimension; //This displays the dimension, when the user customise his/her own grid with a different dimension value, this will display rather than the default (High Score Table).

    /**
     * The constructor is used to calculate each players score and compare it with the past score obtained previously.
     * If a new user player moves are less compared to any in the high score list, then it will update the table with the new user details in.
     */
    @Override
    public int compareTo(GameScore score) {
        GameScore gameScore = (GameScore)score;
        if(playerMoves>gameScore.playerMoves){ //If the a new user score is worser than the current high score people, then it does not do anything. 
        	//Otherwise, it update the the rank table.
            return 1;
        }
        else{
            return -1;
        }
    }
}
