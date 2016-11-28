
package snakeandladder;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Players {
    
	public String[] playerNames = new String[3];  
    public int[] playerMoves = new int[3];  
    public int[] playerLocations = new int[3]; 
    public int numberOfPlayers=2; //The minimum amount of players.
    public int turn=0, won=0; //At this point, the amount of turns and winning is zero.
    CustomizeBoard cus=null;  
    GameMenu menu;
    public GameScore newPlayersScore;
    
    public GameScore getNewScore(){
        return (new GameScore());
    }
    
    public Players() { //The constructor for all players stated here.
        for(int i=0;i<2;i++){
            playerNames[i] = new String();
            playerNames[i]="Player "+i;
            playerMoves[i]=0;
            playerLocations[i]=1;
        }
    }

    public int getNoOfPlayers() {
        return numberOfPlayers;
    }
    
    //Setting the string player 1
    public void setPlayer1(String p1){
        playerNames[0]=new String(p1);
    }
  //Setting the string player 2 and it is for if you are playing with the computer.
    public void setPlayer2(String p2){
        playerNames[1]=new String(p2);
    }
    
    public void setNoOfPlayers(int noOfPlayers) {
        this.numberOfPlayers = noOfPlayers;
    }
    public String getPlayerName(int i){
        return playerNames[i];
    }
    public int getLocation(int i){
        return ((cus.getColumns()*cus.getRows())-playerLocations[i]);
    }
    public void setLocation(int i, int n){
        if(checkValidity(i, n)==1){
            playerLocations[i]+=n;
        }
    }
    public int checkValidity(int i, int n){
        
        if(won==1){
            return 1;
        }
        /**
         * When you are the remaining few numbers to 100, this code will start operating, displaying a message that you got this many boxes left to win the game.
         */
        playerLocations[i]+=n;
        if((playerLocations[i])>(cus.getColumns()*cus.getRows())){
            playerLocations[i]-=n;
            int tot=cus.getColumns()*cus.getRows()-playerLocations[i];
            JOptionPane.showMessageDialog(new JFrame(),"You need "+tot+" to Win", "Retry", JOptionPane.INFORMATION_MESSAGE); //The information sign tells you how many boxes needed to win.
            return 0;
        }
        if((playerLocations[i])==(cus.getColumns()*cus.getRows())){
            playerLocations[i]-=n;
            JOptionPane.showMessageDialog(new JFrame(),"Congratulations "+playerNames[turn]+"!!!. You have won in "+playerMoves[turn]+" turns.","Victory", JOptionPane.INFORMATION_MESSAGE);
            //This is where the message pops up when you have completed the game.
            won=1;
            saveHighScore(); //Here is where you details is saved. After this is done, high score constructor will start generating if you fit in the top 10.
            congratulate(); //If successful a message will pop telling you are within the top 10.
            return 1;
        }
        playerLocations[i]-=n;
        return 1;
    }
    public void setMoves(int i){
        playerMoves[i]++;  //Adding the player moves.
    }
    public void setTurn(){
        turn++; //setting how to replace the amount of turns
        turn = turn %numberOfPlayers;
    } 
    //Setting customizeBoard and MainMenu class with new names.
    public void setClasses(CustomizeBoard customise,GameMenu gameMenu){
        cus = customise;
        menu=gameMenu;
    } 
    
    /**
     * The constructor below is similar to the high score constructor in the MainMenu class.
     * Here we are using the same classes from the MainMenu class.
     */
    public void saveHighScore(){
        GameScore newScore =new GameScore();
        ArrayList<GameScore> oldScores = new ArrayList<>();        
        newScore.setName(playerNames[turn]);
        newScore.setPlayerMoves(playerMoves[turn]);
        newScore.setDimension(cus.setColumns);
        
        try {
            FileInputStream fileStream = new FileInputStream("HighScoreList.ser");  //A FileInputStream obtains input bytes from a file in a file system.
            try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                Object one = os.readObject();
                oldScores = (ArrayList<GameScore>)one;
            }
        } catch (IOException ex) {
            try {
                FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(oldScores);            
                os.close();  //closing object one
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!"); //This will be displayed in the console of the Eclipse. I don't think it is needed to create a JOptionPane window for this.
                ef.printStackTrace();
            }
        }catch(ClassNotFoundException ec){
            System.out.println("\nClass Not Found!!!"); //This will be displayed in the console of the Eclipse. I don't think it is needed to create a JOptionPane window for this.
            ec.printStackTrace();
        }
        oldScores.add(newScore);
        Collections.sort(oldScores);  //Again using the sort collection.      
        
        int maxMin=0, i=1;
        for(GameScore score : oldScores){
            if(score.getPlayerMoves() >maxMin){
                maxMin=score.getPlayerMoves();
            }
            i++;
            if(i>=10){
                break; //If the score is below the top ten, then abort the process.
            }
        }
        menu.highScoreValue=maxMin;
        if(i<10){ //if the score is within the top 10, then continue with process. The process continues to the congratulate constructor.
            menu.highScoreValue=1000;
        }
        
        try {
            FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(oldScores);    //Here is the process how the code overwrites one of the old scores with this new score.        
            os.close();
        } catch (IOException ef) {
            System.out.println("\nFile Not Found!!!"); 
            ef.printStackTrace(); 
        }      
    }
   
    
    public void congratulate(){
        if(menu.highScoreValue>playerMoves[turn]){
        	
            JOptionPane.showMessageDialog(new JFrame(),"You are our new High Scorer", "New High Score", JOptionPane.INFORMATION_MESSAGE); 
            menu.setScoreCardFrameVisible(true); 
            menu.printHighScores();            
            
        }
    }
}
