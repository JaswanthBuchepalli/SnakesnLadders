
package snakeandladder;

import java.awt.Color;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class CustomizeBoard implements Serializable{
    int setRows =5, setColumns=5;   //Here i am setting the amount of columns and rows, in this case, it is 100 box grid.
    ArrayList<Snakes> snakes = new ArrayList<>();  //We need to display the snakes icons, so we use a array to make the snake to change the player down to a lower number.
    ArrayList<Ladders> ladders = new ArrayList<>(); //We need to display the ladders icons, so we use a array to make the ladder to change the player up to a higher number.
    Player player=null;   //At this point, the Player class is in a black hole.
    GridComp play2 = null; //At this point, GridComp class is in a black hole.
    Grid play = null;        //At this point, Grid class is in a black hole.
    Snakes tempSnake=null;		//At this point, the Snakes class is in a black hole.
    Ladders tempLadder = null;		//At this point the Ladders class is in a black hole.
    
    /*
     * 
     * 
     */

    public void setDimension(int r, int c){
        setRows=r;   //I am calling my rows as "r".
        setColumns=c;	//I am calling my columns as "c".
        //customBoard(r, c);
    }
 
    
    public int getColumns() {
        return setColumns;
    }

    public int getRows() {
        return setRows;
    }

    public CustomizeBoard() {
        customBoard(setRows, setColumns); //Creating the grid
    }
    
    /**
     * The constructor below is the random code, the random code here is used to randomly generate a snake and ladders position anywhere in the grid. 
     * This way, we will get a new game every time we play the game.
     * @param snake
     * @param ladder
     */
    public final void customBoard(int snake, int ladder){
        snakes.clear();
        ladders.clear();
        int noOfSnakes =snake; int noOfLadders=ladder;       
        int prevI=0;
        
        for(int i=0;i<noOfSnakes;i++){  //This part is for the snake random.
            Snakes newSnake = new Snakes();  //It is linked with the snake class.
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;   
            //Here we are confirming the snakes should be ten snakes spread out in the grid. Which will have a starting and ending point.
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            
            prevI=i;
            if(randomFrom<=randomTo){
                i--;
                continue;
            }
            
            for(Snakes findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }    
            newSnake.setSnake(randomFrom, randomTo);
            snakes.add(newSnake); //The randomFrom and randomTo is from the Snake class.
        } 
        prevI = 0;
        for(int i=0;i<noOfLadders;i++){ //This is to set the random for the ladders.

            Ladders newLadder= new Ladders();         //This is using the Ladders class.       
            Random randomGenerator = new Random();
            int randomFrom  = randomGenerator.nextInt(setRows*setColumns-5)+5;  //It is confirming that 10 ladders will spread out in the grid.
            int randomTo = randomGenerator.nextInt(setRows*setColumns-5)+5;
            if(randomFrom>=randomTo){
                i--;
                continue;
            }
            prevI=i;
            for(Ladders findlLadders : ladders){
                if(findlLadders.from==randomFrom || findlLadders.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            for(Snakes findSnake : snakes){
                if(findSnake.from==randomFrom || findSnake.from==randomTo){
                    i--;
                    break;
                }
                else if(findSnake.to==randomFrom || findSnake.to==randomTo){
                    i--;
                    break;
                }
            }
            if(prevI!=i){
                continue;
            }
            newLadder.setLadders(randomFrom, randomTo);
            ladders.add(newLadder); //The randomFrom and randomTo is from the Ladder class.
        }   
    }
    /**
     * This constructor explains what it should do when the player is in the same box as the snake head.
     * @param random
     * @param position
     * @return
     */
    public int eatenBySnake(int random, int position){  //As it says on the method, it is the code when the player is on a grid with the snake head.     
    	position = setColumns*setRows-position;
        for(Snakes findSnake : snakes){
            if(findSnake.from==position){
                random+=findSnake.to-position;
                String message = "Snake at position : "+findSnake.from+" caught you. Go to location : "+findSnake.to;  
                //When the snake catch you out, a notification will display notice that you have been caught and send you down to a lower number
                String snake = "Snake for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, snake, JOptionPane.INFORMATION_MESSAGE);  //This the code for the JFrame to display the notification.
                break;
            }
        }
        return random;
    }
    /**
     * This constructor explains what it should do when the player is in same box as the bottom of the ladder.
     * @param random
     * @param position
     * @return
     */
    public int climbLadder(int random, int pos){  //As it says on the method, it is the code when the player is on a grid with a ladder.
        
        pos = setColumns*setRows-pos;  //From the amount of rows and columns, the ladder function will work in this amount of numbers. In this case it is a 100 number grid.
        for(Ladders findLadders : ladders){
            if(findLadders.from==pos){
                random+=findLadders.to-pos;
                String message = "Ladder found at : "+findLadders.from+". Go to location : "+findLadders.to;   
                //When you are on a random ladder (starting point), a notification will be displayed and send you up to a higher number box.
                String ladder = "Ladder for "+player.getPlayerName(player.turn);
                JOptionPane.showMessageDialog(new JFrame(), message, ladder, JOptionPane.INFORMATION_MESSAGE); //The code is to display the message above on the JFrame.
                break;
            }
        }
        return random;
    }
    
    public void setClasses(Player players,Grid grid, GridComp comp){  //Here we are setting variable for the class detailed in the brackets.
        player=players;  //The Player class is variable players
        play = grid;   //The Grid is variable grid
        play2 = comp;	////The GridComp is variable grid
    }
    
    /**
     * This is for to open a grid if you want to player against a human. This is separate grid to the constructor below. Putting these two feature will cause lot of program in general
     * As a result, I decided to separate them both. This for Grid class.
     */
    public void createSnakesAndLadder(){
    	GameImages image = new GameImages();
        int pos = setColumns*setRows;  //Creating the grid box as you want. For example the dimension is 5, then the grid will be 25.
        for(Snakes createSnake : snakes){ //This constructor basically displays the snake image that is coded in the Widget class.
            int from=setColumns*setRows-createSnake.from;
            
            int to=setColumns*setRows-createSnake.to;
            
            play.grid[from].setIcon(image.getSnake().getIcon());  
            //We are telling java that we want a icon from the GameImages class. Without having this will result a blank grid. This is the snake image.
            play.grid[from].setForeground(new Color(20, 200, 20));  //Here I am setting the background colour for the snake and ladders grid orange. 
            play.grid[from].setText("Go to : "+(pos-to));
        }
        for(Ladders createLadder : ladders){
            
            int from=setColumns*setRows-createLadder.from;      
            int to=setColumns*setRows-createLadder.to; 
            play.grid[from].setIcon(image.getLadder().getIcon());   //We are telling java that we want a icon from the GameImages class to import in the grid. Without having this will result a blank grid. This is the ladder image.
            play.grid[from].setForeground(new Color(20, 200, 20));  //Here I am setting the background colour for the snake and ladders grid orange. 
            play.grid[from].setText("Go to : "+(pos-to));
            
        } 
    }
    
    /**
     * 
     * This is for the purpose if the user want to play with the computer. I made a separate Grid for this action only. As it need several modification to the make the program to work.
     * This is part of GridComp class.
     */
    public void computerSnakesAndLadder(){
    	
    	GameImages image = new GameImages();
        int position = setColumns*setRows;  //Creating the grid box as you want. For example the dimension is 5, then the grid will be 25.
        for(Snakes createSnake : snakes){ //This constructor basically displays the snake image that is coded in the Widget class.
            int from=setColumns*setRows-createSnake.from;
            int to=setColumns*setRows-createSnake.to;
            play2.grid[from].setIcon(image.getSnake2().getIcon());  //We are telling java that we want a icon from the GameImages class to import in the grid. Without having this will result a blank grid. This is the snake image.
            play2.grid[from].setForeground(new Color(20, 200, 20));  //Here I am setting the background colour for the snake and ladders grid orange. 
            play2.grid[from].setText("Go to : "+(position-to));
        }
        for(Ladders createLadder : ladders){
            
            int from=setColumns*setRows-createLadder.from;      
            int to=setColumns*setRows-createLadder.to; 
            play2.grid[from].setIcon(image.getLadder2().getIcon());   //We are telling java that we want a icon from the GameImages class to import in the grid. Without having this will result a blank grid. This is the ladder image.
            play2.grid[from].setForeground(new Color(20, 200, 20));  //Here I am setting the background colour for the snake and ladders grid orange. 
            play2.grid[from].setText("Go to : "+(position-to));
            
        } 
    }
}
