/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeandladder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;



public class GameMenu extends javax.swing.JFrame{
	
	//Here is all the variable for the interfacing the software.
	 public javax.swing.JButton backMainMenuButton;
	 private javax.swing.JButton computer;
     private javax.swing.JButton customizeBoardButton;
     private javax.swing.JButton exitButton;
     private javax.swing.JButton helpButton;
     private javax.swing.JButton aboutButton;
     private javax.swing.JButton returnaboutButton;
     private javax.swing.JButton highScoresButton;
     public javax.swing.JFrame helpFrame; 
     public javax.swing.JLabel scoreCard;
     private javax.swing.JLabel howToPlay;
     private javax.swing.JLayeredPane howToPlayPane1;
   //  private javax.swing.JLayeredPane logo1Panel;
     private javax.swing.JScrollPane scoreScrollPanel;
     private javax.swing.JLabel mainMenuLabel;
     private javax.swing.JButton newGameButton;
     private javax.swing.JFrame playersFrame;
     private javax.swing.JFrame aboutFrame;
     private javax.swing.JFrame HighscoreFrame;
     public javax.swing.JTable scoreTable;
     private javax.swing.JButton threePlayersButton;
     private javax.swing.JButton twoPlayersButton;
	 private javax.swing.JLayeredPane diceSnakePanel;
	 private javax.swing.JLayeredPane developerPane3;
	 private javax.swing.JLayeredPane featurePane4;
	 private javax.swing.JLayeredPane sentencePlayerPane5;
	 private javax.swing.JLayeredPane grid1Pane8;
	 private javax.swing.JLayeredPane dice1Pane7;
	 private javax.swing.JLayeredPane cusgamePane8;
	 private javax.swing.JLayeredPane scoresentence2Pane19;
	 private javax.swing.JLayeredPane sentencePlayer2Pane6;
	 private javax.swing.JLayeredPane sentencePlayer3Pane7;
	 private javax.swing.JLayeredPane grid2Pane9;
	 private javax.swing.JLayeredPane grid3Pane10;
	 private javax.swing.JLayeredPane scoresentencePane24;
	 private javax.swing.JLayeredPane dice2Pane25;
	 private javax.swing.JLayeredPane cusgamePane26;
	 private javax.swing.JLayeredPane cusgame3Pane27;
	 private javax.swing.JLayeredPane cusgame4Pane28;
	 private javax.swing.JLayeredPane scoresentence3Pane29;
	 private javax.swing.JLayeredPane scoresentence4Pane30;
	 private javax.swing.JLabel diceSnakepic;
	 private javax.swing.JLabel developer;
	 private javax.swing.JLabel feature;
	 private javax.swing.JLabel sentencePlayer;
	 private javax.swing.JLabel grid1;
	 private javax.swing.JLabel dice1;
	 //private javax.swing.JLabel logo2;
	 private javax.swing.JLabel cusgame;
	 private javax.swing.JLabel scoresentence2;
	 private javax.swing.JLabel sentencePlayer2;
	 private javax.swing.JLabel sentencePlayer3;
	 private javax.swing.JLabel grid2;
	 private javax.swing.JLabel grid3;
	 private javax.swing.JLabel scoresentence;
	 private javax.swing.JLabel dice2;
	 private javax.swing.JLabel cusgame2;
	 private javax.swing.JLabel cusgame3;
	 private javax.swing.JLabel cusgame4;
	 private javax.swing.JLabel scoresentence3;
	 private javax.swing.JLabel scoresentence4;
	//private javax.swing.JLabel logo3;
	//private javax.swing.JLayeredPane logo3Panel;

    /**
     * Creates new form MainMenu
     */
    public GameMenu() {
    	GUI(); //This method name is where all the swing items is made, I did it this way so I don't confuse myself. And also, to separate the GUI with the action listener.
        setLocation(500, 250);
    }
    
    /**
     * The constructor below is where all the swing programming is dealt. In other words the GUI of my first window.
     */
    @SuppressWarnings("unchecked")
    public void GUI() {	
    	//You will see several different types of swing features to make the project to work.
       HighscoreFrame = new javax.swing.JFrame();
       scoreCard = new javax.swing.JLabel();
       scoreScrollPanel = new javax.swing.JScrollPane();
       scoreTable = new javax.swing.JTable();
       helpFrame = new javax.swing.JFrame();
       howToPlayPane1 = new javax.swing.JLayeredPane();
       howToPlay = new javax.swing.JLabel();
       playersFrame = new javax.swing.JFrame();
       twoPlayersButton = new javax.swing.JButton();
       computer = new javax.swing.JButton();
       aboutButton = new javax.swing.JButton();
       returnaboutButton = new javax.swing.JButton();
       threePlayersButton = new javax.swing.JButton();
       backMainMenuButton = new javax.swing.JButton();
       newGameButton = new javax.swing.JButton();
       customizeBoardButton = new javax.swing.JButton();
       highScoresButton = new javax.swing.JButton();
       helpButton = new javax.swing.JButton();
       exitButton = new javax.swing.JButton();
       mainMenuLabel = new javax.swing.JLabel();
       aboutFrame = new javax.swing.JFrame(); 
       diceSnakepic = new javax.swing.JLabel();
       developer = new javax.swing.JLabel();
       feature = new javax.swing.JLabel();
       sentencePlayer = new javax.swing.JLabel();
       grid1 = new javax.swing.JLabel();
       dice1 = new javax.swing.JLabel();
       cusgame = new javax.swing.JLabel();
       scoresentence2 = new javax.swing.JLabel();
       sentencePlayer2 = new javax.swing.JLabel();
       sentencePlayer3 = new javax.swing.JLabel();
       grid2 = new javax.swing.JLabel();
     //  logo2 = new javax.swing.JLabel();
      // logo3 = new javax.swing.JLabel();
       grid3 = new javax.swing.JLabel();
       scoresentence = new javax.swing.JLabel();
       dice2 = new javax.swing.JLabel();
       cusgame2 = new javax.swing.JLabel();
       cusgame3 = new javax.swing.JLabel();
       cusgame4 = new javax.swing.JLabel();
       scoresentence3 = new javax.swing.JLabel();
       scoresentence4 = new javax.swing.JLabel();
       diceSnakePanel = new javax.swing.JLayeredPane();
       developerPane3 = new javax.swing.JLayeredPane();
    //   logo1Panel = new javax.swing.JLayeredPane();
       //logo3Panel = new javax.swing.JLayeredPane();
       featurePane4 = new javax.swing.JLayeredPane();
       sentencePlayerPane5 = new javax.swing.JLayeredPane();
       grid1Pane8 = new javax.swing.JLayeredPane();
       dice1Pane7 = new javax.swing.JLayeredPane();
       cusgamePane8 = new javax.swing.JLayeredPane();
       scoresentence2Pane19 = new javax.swing.JLayeredPane();
       sentencePlayer2Pane6 = new javax.swing.JLayeredPane();
       sentencePlayer3Pane7 = new javax.swing.JLayeredPane();
       grid2Pane9 = new javax.swing.JLayeredPane();
       grid3Pane10 = new javax.swing.JLayeredPane();
       scoresentencePane24 = new javax.swing.JLayeredPane();
       dice2Pane25 = new javax.swing.JLayeredPane();
       cusgamePane26 = new javax.swing.JLayeredPane();
       cusgame3Pane27 = new javax.swing.JLayeredPane();
       cusgame4Pane28 = new javax.swing.JLayeredPane();
       scoresentence3Pane29 = new javax.swing.JLayeredPane();
       scoresentence4Pane30 = new javax.swing.JLayeredPane();
		  
       
		 /**
		  * The score card is a JLabel, and the code below is making the JLabel to make the display the label. Please note, this JLabel displays the Chart Table button. 
		  * All code below is not needed to make the label to work but tom make the label a different look.
		  */
		 
        scoreCard.setFont(new java.awt.Font("Tahoma", 1, 18)); // Here I am setting the font to tahoma with the text size to be 18.
        scoreCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //Setting the jLabel in the centre of the window.
        scoreCard.setText("Score Card");  //Displaying this name in the JLabel.
        scoreCard.setForeground(Color.RED);
        scoreTable.setModel(new javax.swing.table.DefaultTableModel( //The code below is for making the high score table. You can see it has four colunms and 10 rows.
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},  //Adding more rows will mean, making another copy of nulls.
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "  S. No.", "  Name", "  Score", "  Dimension"  //These are title names, this will appear first in the high score table..
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class //Here I am stating all nulls to be strings.
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        scoreTable.setGridColor(new java.awt.Color(147,112,219));  //Here is the colour code for making the lines of the table purple.
        scoreTable.setRowHeight(18);
        scoreScrollPanel.setViewportView(scoreTable);  //This is an addition if i want to add more nulls.
        scoreScrollPanel.setBackground(new java.awt.Color(255, 48, 48));
        
        
        /**
         * The constructor below is for adding the necessary swing names in the right frames. 
         * Here is for the high score frame, the scroll panel and score table in the high score table.
         */
        //This is for the horizontal axis, this is where you can set your position in the horizontal axis.
        javax.swing.GroupLayout scoreCardFrameLayout = new javax.swing.GroupLayout(HighscoreFrame.getContentPane());
        HighscoreFrame.getContentPane().setLayout(scoreCardFrameLayout);
        scoreCardFrameLayout.setHorizontalGroup(
            scoreCardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, scoreCardFrameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scoreScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)  //Adding this component in the high score frame (horizontal).
                .addContainerGap())
            .addGroup(scoreCardFrameLayout.createSequentialGroup()
                .addGap(98, 98, 98) // I am adding gaps to use more space within thw window.
                .addComponent(scoreCard, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)  //Adding this component in the high score frame (horizontal).
                .addContainerGap(168, Short.MAX_VALUE)));
      //This is for the vertical axis, this is where you can set your position in the vertical axis.
        scoreCardFrameLayout.setVerticalGroup(
            scoreCardFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(scoreCardFrameLayout.createSequentialGroup()
                .addGap(43, 43, 43)  // I am adding gaps to use more space within thw window.
                .addComponent(scoreCard, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding this component in the high score frame (vertical).
                .addGap(18, 18, 18)
                .addComponent(scoreScrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)  //Adding this component in the high score frame (vertical).
                .addContainerGap()));
        
        helpFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);  //This is to set the red close button on the top right corner of the help frame window.
       


        
        
        /**
         * The code below is how I importing a picture to the how to play window. This window is just picture with three steps on how to play the tradition snake and ladders game. 
         */
        howToPlay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/help.png"))); //Importing a how to play picture
        howToPlay.setBounds(0, 0, 1000, 650);  //Here i am setting the int x, y, width and length.
        howToPlayPane1.add(howToPlay, javax.swing.JLayeredPane.DEFAULT_LAYER);  //Setting the panel for this window.
        
        diceSnakepic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/diceSnake.jpg"))); // Importing another picture to the about window.
        diceSnakepic.setBounds(0, 0, 1000, 400); //Here i am setting the int x, y, width and length.
        diceSnakePanel.add(diceSnakepic, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the image as a default layer.
        
        
      /*  logo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/logo3.jpg"))); // Importing another picture to the about window.
        logo3.setBounds(0, 0, 2000, 400); //Here i am setting the int x, y, width and length.
        logo3Panel.add(logo3, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the image as a default layer. */
        
        
       /* logo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/logo2.png"))); // Importing another picture to the about window. 
        logo2.setBounds(0, 0, 2000, 400); //Here i am setting the int x, y, width and length.
        logo1Panel.add(logo2, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the image as a default layer.*/		 
        
        /**
         * The next set of codes is displaying JLabels in the about frame window. The structure for doing this is similar to the import picture code only it is not a image icon.
         */
		 developer.setFont(new java.awt.Font("Tahoma", 0, 20));  //Setting the font Tahoma font and size 20.
		 developer.setText("The Snake and Ladders game was designed by Azhan Rashid for Software Design and Development.");  //My label to be displayed in the about frame.
		 developer.setBounds(0, 170, 1000, 400);  //Here i am setting the int x, y, width and length.
		 developer.setForeground(Color.CYAN); //Setting the text a different colour.
		 developerPane3.add(developer, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 feature.setFont(new java.awt.Font("Tahoma", 0, 20)); //Setting the font Tahoma font and size 20.
		 feature.setText("The game has several features;"); //My label to be displayed in the about frame.
		 feature.setBounds(0, 200, 1000, 400);  //Here i am setting the int x, y, width and length.
		 feature.setForeground(Color.CYAN); //Setting the text a different colour.
		 featurePane4.add(feature, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 sentencePlayer.setFont(new java.awt.Font("Tahoma", 0, 18)); //Setting the font Tahoma font.
		 sentencePlayer.setForeground(Color.CYAN); //Setting the text a different colour.
		 sentencePlayer.setText("The maximum players in this game is 3 players. You can also have a game with the computer "); //My label to be displayed in the about frame.
		 sentencePlayer.setBounds(0, 230, 1000, 400); //Here i am setting the int x, y, width and length.
		 sentencePlayerPane5.add(sentencePlayer, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 sentencePlayer2.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 sentencePlayer2.setForeground(Color.CYAN); //Setting the text a different colour.
		 sentencePlayer2.setText("This game also let you to write down your name. ");  //My label to be displayed in the about frame.
		 sentencePlayer2.setBounds(0, 260, 1000, 400); //Here i am setting the int x, y, width and length.
		 sentencePlayer2Pane6.add(sentencePlayer2, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 sentencePlayer3.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 sentencePlayer3.setForeground(Color.CYAN); //Setting the text a different colour.
		 sentencePlayer3.setText("The icon for each player is colour blobs. Player 1 is green, player 2/computer is pink and player 3 is blue."); //My label to be displayed in the about frame.
		 sentencePlayer3.setBounds(0, 290, 1000, 400);  //Here i am setting the int x, y, width and length.
		 sentencePlayer3Pane7.add(sentencePlayer3, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		  
		 grid1.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 grid1.setForeground(Color.CYAN); //Setting the text a different colour.
		 grid1.setText("It will randamly generate a new game with different snakes and ladders position. ");  //My label to be displayed in the about frame. 
		 grid1.setBounds(0, 320, 1000, 400);  //Here i am setting the int x, y, width and length.
		 grid1Pane8.add(grid1, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 grid2.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 grid2.setForeground(Color.CYAN); //Setting the text a different colour.
		 grid2.setText("This means everytime you start a new game, it will display the snakes and ladder in different grid numbers.");//My label to be displayed in the about frame.
		 grid2.setBounds(0, 350, 1000, 400);  //Here i am setting the int x, y, width and length.
		 grid2Pane9.add(grid2, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 grid3.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 grid3.setForeground(Color.CYAN); //Setting the text a different colour.
		 grid3.setText("The maximum numbers of snakes and ladder within the game is 10.");  //My label to be displayed in the about frame.
		 grid3.setBounds(0, 390, 1000, 400);  //Here i am setting the int x, y, width and length.
		 grid3Pane10.add(grid3, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 scoresentence.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 scoresentence.setForeground(Color.CYAN); //Setting the text a different colour.
		 scoresentence.setText("It can also record your score and place it in a score table.");  //My label to be displayed in the about frame.
		 scoresentence.setBounds(0, 420, 1000, 400);  //Here i am setting the int x, y, width and length.
		 scoresentencePane24.add(scoresentence, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 dice1.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 dice1.setForeground(Color.CYAN); //Setting the text a different colour.
		 dice1.setText("In the game, when you press the Roll Dice button, it will display a dice image unlike text.");  //My label to be displayed in the about frame.  
		 dice1.setBounds(0, 450, 1000, 400);  //Here i am setting the int x, y, width and length.
		 dice1Pane7.add(dice1, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 dice2.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 dice2.setForeground(Color.CYAN); //Setting the text a different colour.
		 dice2.setText("This is used using the random method.");  //My label to be displayed in the about frame.
		 dice2.setBounds(0, 490, 1000, 400);  //Here i am setting the int x, y, width and length.
		 dice2Pane25.add(dice2, javax.swing.JLayeredPane.DEFAULT_LAYER);  //making the label as a default layer.
		 
		 cusgame.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 cusgame.setForeground(Color.CYAN); //Setting the text a different colour.
		 cusgame.setText("You can customise your own snake and ladder grid. This is done by pressing the customise button in the main menu.");  //My label to be displayed in the about frame.
		 cusgame.setBounds(0, 520, 1000, 400);  //Here i am setting the int x, y, width and length.
		 cusgamePane8.add(cusgame, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 cusgame2.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 cusgame2.setForeground(Color.CYAN); //Setting the text a different colour.
		 cusgame2.setText("when the button pressed, you must set the dimensions (e.g 8, 8 rows, 8 colums).");   //My label to be displayed in the about frame.
		 cusgame2.setBounds(0, 550, 1000, 400);  //Here i am setting the int x, y, width and length.
		 cusgamePane26.add(cusgame2, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 cusgame3.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 cusgame3.setForeground(Color.CYAN); //Setting the text a different colour.
		 cusgame3.setText("You then can select the amount of snake and ladders needed for your game.");  //My label to be displayed in the about frame.
		 cusgame3.setBounds(0, 590, 1000, 400);  //Here i am setting the int x, y, width and length.
		 cusgame3Pane27.add(cusgame3, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 cusgame4.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 cusgame4.setForeground(Color.CYAN); //Setting the text a different colour.
		 cusgame4.setText("Then finally set which grid number you want the snake and ladder starting and ending.");   //My label to be displayed in the about frame.
		 cusgame4.setBounds(0, 620, 1000, 400);  //Here i am setting the int x, y, width and length.
		 cusgame4Pane28.add(cusgame4, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 scoresentence2.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 scoresentence2.setForeground(Color.CYAN); //Setting the text a different colour.
		 scoresentence2.setText("It can also record your score and place it in a score table. The score system is only recorded when the person win the match.");  //My label to be displayed in the about frame.
		 scoresentence2.setBounds(0, 650, 1000, 400);  //Here i am setting the int x, y, width and length.
		 scoresentence2Pane19.add(scoresentence2, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 scoresentence3.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 scoresentence3.setForeground(Color.CYAN); //Setting the text a different colour.
		 scoresentence3.setText("It will display how many turns it took you to win the game.");  //My label to be displayed in the about frame.
		 scoresentence3.setBounds(0, 690, 1000, 400); //Here i am setting the int x, y, width and length.
		 scoresentence3Pane29.add(scoresentence3, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.
		 
		 scoresentence4.setFont(new java.awt.Font("Tahoma", 0, 18));  //Setting the font Tahoma font.
		 scoresentence4.setForeground(Color.CYAN); //Setting the text a different colour.
		 scoresentence4.setText("Followed by your name and rank your score with other members within the score table.");  //My label to be displayed in the about frame.
		 scoresentence4.setBounds(0, 720, 1000, 400);  //Here i am setting the int x, y, width and length.
		 scoresentence4Pane30.add(scoresentence4, javax.swing.JLayeredPane.DEFAULT_LAYER); //making the label as a default layer.	 
        
/**
 * Here I am adding the JLabels above in the about window.
 */
		 
		 javax.swing.GroupLayout aboutFrameLayout = new javax.swing.GroupLayout(aboutFrame.getContentPane());
	        aboutFrame.getContentPane().setLayout(aboutFrameLayout);
	        aboutFrameLayout.setHorizontalGroup(
	        		//The entire row is the same and indicates the that we are adding this swing in the about window. This is to position the swing tools in the horizontal axis.
	        		aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        		.addComponent(developerPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)  
	        		//A part from everything else, this is a image i am adding to the about window;
	            .addComponent(diceSnakePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)  
	            .addComponent(featurePane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(sentencePlayerPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(grid1Pane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(dice1Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgamePane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence2Pane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(sentencePlayer2Pane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(sentencePlayer3Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(grid2Pane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(grid3Pane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentencePane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(dice2Pane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgamePane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgame3Pane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(cusgame4Pane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence3Pane29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	            .addComponent(scoresentence4Pane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
	                .addComponent(returnaboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	            
	        );
	        aboutFrameLayout.setVerticalGroup(
	        		//The entire row is the same and indicates the that we are adding this swing in the about window. This is to position the swing tools in the vertical axis.
	        		aboutFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	        		.addComponent(developerPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	        		//A part from everything else, this is a image i am adding to the about window;
	            .addComponent(diceSnakePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(featurePane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(sentencePlayerPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(grid1Pane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(dice1Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgamePane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(scoresentence2Pane19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	             .addComponent(sentencePlayer2Pane6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(sentencePlayer3Pane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	             .addComponent(grid2Pane9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(grid3Pane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(scoresentencePane24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(dice2Pane25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(cusgamePane26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgame3Pane27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	            .addComponent(cusgame4Pane28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	      .addComponent(scoresentence3Pane29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	              .addComponent(scoresentence4Pane30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
	               .addGap(18, 18, 18)  //Here I am adding a gap
                .addComponent(returnaboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE));
		 
		 
	     /**
	      * The code below is putting the swing items in the help frame. This is just a picture in that window explaining how to the play the game.   
	      */
	        
        javax.swing.GroupLayout howToPlayLayout = new javax.swing.GroupLayout(helpFrame.getContentPane());
        helpFrame.getContentPane().setLayout(howToPlayLayout);  // Here I am setting the swing layout to be set in the help window.
        howToPlayLayout.setHorizontalGroup(  //This is for the horizontal axis for the how to play image.
        		howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addComponent(howToPlayPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE));  //Adding the component
        howToPlayLayout.setVerticalGroup(  //This is for the vertical axis for the how to play image.
        		howToPlayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        		.addComponent(howToPlayPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE));   //Adding the component
        

        aboutFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  //This is to set the red close button on the top right corner of the help frame window.
        aboutFrame.setBackground(new java.awt.Color(255, 48, 48));  
        
        playersFrame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);   //This is to set the red close button on the top right corner of the help frame window.
        playersFrame.setBackground(new java.awt.Color(202, 255, 112));   
        
        
        /**
         * The code below is to set the buttons for the window when you press the "Play Game" button. This button if you want to play a 2 player game of snake and ladders.
         * The principles the same for the threePlayersButton but it will be three player instead. All action listener below, will have a music sound when the JButton is pressed.
         */
        twoPlayersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        twoPlayersButton.setText("2 Players");  //setting the button name as "2 Players".
        twoPlayersButton.setForeground(Color.CYAN); //Setting the text a different colour.
        twoPlayersButton.setBackground(Color.BLUE); //Setting the background a different colour.
        twoPlayersButton.addActionListener(new java.awt.event.ActionListener() {  //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            //	Music music = new Music();
            //	music.ButtonSound("click.wav");
            	twoPlayersButton(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            }
        });
        
        /**
         * This JButton is for if you want to play with three player.
         */
        /* threePlayersButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        //threePlayersButton.setText("3 Players");  //setting the button name as "3 Players".
        threePlayersButton.setForeground(Color.CYAN); //Setting the text a different colour.
        threePlayersButton.setBackground(Color.BLUE); //Setting the background a different colour.
        threePlayersButton.addActionListener(new java.awt.event.ActionListener() {  //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	Music music = new Music();
            	music.ButtonSound("click.wav");
            	threePlayersButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
            }
        });*/
        
        /**
         * This JButton is for if you want to go back to the main menu. This is operation is valid in the window where the user can choose his/her number of players.
         */
        backMainMenuButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        backMainMenuButton.setText("Back To Main Menu"); //setting the button name as "Back To Main Menu".
        backMainMenuButton.setForeground(Color.CYAN); //Setting the text a different colour.
        backMainMenuButton.setBackground(Color.BLUE); //Setting the background a different colour.
        backMainMenuButton.addActionListener(new java.awt.event.ActionListener() {  //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backMainMenuButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
         //      Music music = new Music();
        //    	music.ButtonSound("click.wav");
            
            }
        });
        
        
        /**
         * This JButton is for if you want to play with the computer.
         */
      /*  computer.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        computer.setText("Computer vs Human"); //setting the button name as "Back To Main Menu".
        computer.setForeground(Color.CYAN); //Setting the text a different colour.
        computer.setBackground(Color.BLUE); //Setting the background a different colour.
        computer.addActionListener(new java.awt.event.ActionListener() {  //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	computerPlayersButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
          //      Music music = new Music();
          //  	music.ButtonSound("click.wav");
            
            }
        }); */

        /**
         * The code below shows we are adding the buttons mentioned above to another window when the "Play Game" button is pressed.
         */
        javax.swing.GroupLayout playersFrameLayout = new javax.swing.GroupLayout(playersFrame.getContentPane());
        playersFrame.getContentPane().setLayout(playersFrameLayout);  //This is for the playersFrame
        playersFrameLayout.setHorizontalGroup(  //Here we are positioning the button at the horizontal axis.
            playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersFrameLayout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        	            //.addComponent(logo3Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)  
                    .addComponent(backMainMenuButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the back main button
                    //.addComponent(threePlayersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //Adding the three player button
                    //.addComponent(computer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE) //Adding the three player button
                    .addComponent(twoPlayersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)) //Adding the two player button
                
             .addContainerGap(74, Short.MAX_VALUE)
                )); //creating a gap from the edge.
        playersFrameLayout.setVerticalGroup(
            playersFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playersFrameLayout.createSequentialGroup()
    	         //   .addComponent(logo3Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addGap(30, 30, 30)  //We are adding a gap from each button.
                .addComponent(twoPlayersButton)
                //.addGap(18, 18, 18)
                //.addComponent(threePlayersButton)
                //.addGap(18, 18, 18)
                //.addComponent(computer)
                .addGap(18, 18, 18)
                .addComponent(backMainMenuButton)
                .addContainerGap(30, Short.MAX_VALUE)));
        	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  // Setting the close button function on the window.

        newGameButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        newGameButton.setText("Play Game");
        newGameButton.setForeground(Color.GREEN); //Setting the text a different colour.
        newGameButton.setBackground(Color.BLUE); //Setting the background a different colour.
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
           // 	Music music = new Music();
            	newGameButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
           // 	music.ButtonSound("GameMenu.wav");
            
            }
        });
        
        
        /**
         * @Exception "InterupttedException". I am using a catch method, the purpose for the catch method is the delay. When you want a sleep method involved. The try catch method is needed to make it work.
         * If the action performed is pressed and does not get interrupted, then it will work normally. Otherwise, it will cancel the normal operation and display a message in the console.
         * The other purpose i put the catch method is to make sure the user hears the full music. 
         * This is why i used the sleep method. Not having the try/catch method will process the operation to fast for the user to hear the music button.
         */
        customizeBoardButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        customizeBoardButton.setText("Customize Board"); //setting the button name as "Customize Board".
        customizeBoardButton.setForeground(Color.GREEN); //Setting the text a different colour.
        customizeBoardButton.setBackground(Color.BLUE); //Setting the background a different colour.
        customizeBoardButton.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//If not interruption is caused, the program will work fine. Otherwise, a message will be presented in the console.
            	try {
            //		Music music = new Music();
                	customizeBoardButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
            //    	music.ButtonSound("GameMenu.wav");
            	    Thread.sleep(1500);   
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	    System.out.println("The Action Performed has been interuptted");
            	    JOptionPane.showMessageDialog(null, "Interruption occurred"); //Popping up a JFrame message that a interruption is occurred.
            	}
            }
            
        });
        
        /**
         * This JButton is for if you want to go on the about window.
         */
        aboutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        aboutButton.setText("About"); //setting the button name as "About".
        aboutButton.setForeground(Color.GREEN); //Setting the text a different colour.
        aboutButton.setBackground(Color.BLUE); //Setting the background a different colour.
        aboutButton.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
           // 	Music music = new Music();
            	aboutButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
           // 	music.ButtonSound("GameMenu.wav");
            }
        });
        
        
        /**
         * This JButton is for if you want to the main menu. This only works when you are currently on the about window. This button is displayed at the top.
         */
        returnaboutButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        returnaboutButton.setText("Return"); //setting the button name as "Return".
        returnaboutButton.setBackground(new java.awt.Color(240,230,140));
        returnaboutButton.setForeground(Color.blue); //Setting the text a different colour.
        returnaboutButton.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	returnaboutButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
           // 	Music music = new Music();
           // 	music.ButtonSound("GameMenu.wav");
            }
        });

        /**
         * This JButton is for if the user want to see the high score.
         */
        highScoresButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        highScoresButton.setText("Game score");  //setting the button name as "Chart Table".
        highScoresButton.setForeground(Color.GREEN); //Setting the text a different colour.
        highScoresButton.setBackground(Color.BLUE); //Setting the background a different colour.
        highScoresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //The action listener here is used what should the button do when the button is pressed.
            	highScoresButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
            //	Music music = new Music();
           // 	music.ButtonSound("GameMenu.wav");
            }
        });
        

        /**
         * This JButton is for if you want to go to the help window.
         */
        helpButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        helpButton.setText("Need Help?"); //setting the button name as "Need Help?".
        helpButton.setForeground(Color.GREEN); //Setting the text a different colour.
        helpButton.setBackground(Color.BLUE); //Setting the background a different colour.
        helpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //The action listener here is used what should the button do when the button is pressed.
            	helpButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
            	//Music music = new Music();
            	//music.ButtonSound("GameMenu.wav");
            }
        });

        /**
         * @Exception "InterupttedException". I am using a catch method, the purpose for the catch method is the delay. When you want a sleep method involved. The try catch method is needed to make it work.
         * If the action performed is pressed and does not get interrupted, then it will work normally. Otherwise, it will cancel the normal operation and display a message in the console.
         * The other purpose i put the catch method is to make sure the user hears the full music. 
         * This is why i used the sleep method. Not having the try/catch method will process the operation to fast for the user to hear the music button.
         */
        exitButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // Setting the font to tahoma with text size 14.
        exitButton.setText("Close");  //setting the button name as "Close".
        exitButton.setForeground(Color.GREEN); //Setting the text a different colour.
        exitButton.setBackground(Color.BLUE); //Setting the background a different colour.
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //The action listener here is used what should the button do when the button is pressed.
            	
            	try {
            		//Music music = new Music(); //From Music class.
                	//music.ButtonSound("GameMenu.wav"); //the sound file
            	    Thread.sleep(1500); //setting a delay so the full music background is heard from the user.
            	    exitButton(evt);  //When the button is pressed, the method name here will be called and make the game to do its action.
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	    System.out.println("The Action Performed has been interuptted");
            	    JOptionPane.showMessageDialog(null, "Interruption occurred"); //Popping up a JFrame message that a interruption is occurred.
            	}
            }
        });

        //This is displayed on blue box on the top.
        mainMenuLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // Setting the font to tahoma with text size 14.
        mainMenuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER); //Setting this label in the centre of the window.
        mainMenuLabel.setForeground(Color.BLUE);
        mainMenuLabel.setText("Enjoy A Game of Snakes And Ladders...");  //setting the button name as "Main Menu".
        getContentPane().setBackground(Color.WHITE); //setting the background of the background
/**
 * Here I am setting buttons for the main menu. This was discussed above, This is the window which will be shown first when you boot the program.
 */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
        	            //.addComponent(logo1Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)  
                    .addComponent(highScoresButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(customizeBoardButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(helpButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(aboutButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  //Adding the component
                    .addComponent(mainMenuLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))  //Adding the component
                .addGap(60, 60, 60)));
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap() //Gap from the edges from the window.
	           // .addComponent(logo1Panel, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addComponent(mainMenuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addGap(18, 18, 18) //Adding a gap from each button in the vertical axis
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(customizeBoardButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addGap(18, 18, 18) //Adding a gap from each button in the vertical axis
                .addComponent(highScoresButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)//Adding the component
                .addGap(18, 18, 18)  //Adding a gap from each button in the vertical axis
                .addComponent(helpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addGap(18, 18, 18) //Adding a gap from each button in the vertical axis
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addGap(18, 18, 18)//Adding a gap from each button in the vertical axis
                .addComponent(aboutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE) //Adding the component
                .addContainerGap(31, Short.MAX_VALUE))); //The gap value from the edge of the window.
        		pack();
    }

    /**
     * The constructor below shows when this method is used it will close the program. This constructor is used for the close button in the first window.
     * @param evt
     */
    private void exitButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0); //Closes the program
    }

    /**
     * The constructor below is for the players frame, this is activated when the "Play Game" button is pressed which will display a new window with a option to choose the amount of players who wants to play.
     * It also displays the a button which allows you return to the first window.
     * @param evt
     */
    private void newGameButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        setVisible(false);

        playersFrame.setSize(450, 350);  //setting the player frame with the given dimensions
        playersFrame.setLocation(200, 200); //Moving the window to a new location.
        playersFrame.setVisible(true); //setting the window visible, this means what you want to be seen and which does not.
        playersFrame.getContentPane().setBackground(Color.WHITE); //setting the background of the background
    }
    
    /**
     * The constructor below is for the about frame, this is activated when the "About" button is pressed which will display a new window with a description of the snake and ladders game..
     * It also displays the a button which allows you return to the first window.
     * @param evt
     */
    private void aboutButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        setVisible(false);
        aboutFrame.setSize(1000, 1000); //setting the player frame with the given dimensions
        aboutFrame.setLocation(50, 50); //Moving the window to a new location.
        aboutFrame.setVisible(true); //setting the window visible, this means what you want to be seen and which does not.
        aboutFrame.getContentPane().setBackground(Color.RED); //setting the background of the background
    }
    
    /**
     * The constructor below is for the about frame, this is activated when the "return" button is pressed which return you back to the main menu window.
     * I also makes the players frame invisible as well.
     * @param evt
     */
    public void returnaboutButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
    	playersFrame.setVisible(false);
        setVisible(true);
        aboutFrame.setVisible(false);
       
    }//GEN-LAST:event_newGameButtonActionPerformed
    

    
    /**
     * The code below is how to make your own snake and ladder game, You press the customise button, several notification will pop up.
     * Asking you how many ladders and snakes you want in your game and which number box you want the item to start and finish.
     * It will also tell you the dimensions.
     * @param evt
     */
    public void customizeBoardButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customizeBoardButtonActionPerformed	
    
    		try {
  
    		int dimension =0;
			String  stringD = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the dimension : ","");  //This is the code to set the notification to say the dimensions of the snake and ladders grid.
	        if(stringD == null)
	        {
	        	return;
	        }
	        dimension = Integer.parseInt(stringD);
	        if(dimension<4 || dimension>8){
	            dimension=6;
	            String error = "Dimensions must be between 5 and 12!!!";
	            JOptionPane.showMessageDialog(new JFrame(), error, "Error Message", JOptionPane.ERROR_MESSAGE);  //The code to make the notification to show in the GUI.
	            cus.setDimension(dimension,dimension);
	            cus.customBoard(4, 4);	
	            return;   
	        } 
	        cus.setDimension(dimension,dimension);

	       
	        //This code below is telling you if you want to customise your snakes and ladders. 
	        if (JOptionPane.showConfirmDialog(new JFrame(),
	        "Do you want to Change the position of Snakes and Ladders ?", "Customize",  //The Label
	        JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION){  //Here i have coded to put two buttons on yes and no.
	            if(dimension<=6){
	                cus.customBoard(6, 6); 
	            }
	            else{
	                cus.customBoard(4, 4);
	            }
	            return;
	        }
	        
	       
	        
	        /**
	         * The code below, demonstrates how many snakes and ladders you want in you customise game.
	         */
	        int noOfSnakes =0;
	        String stringsnake  = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the number of Snakes : ","");  //The label for the snakes
	        if(stringsnake == null)
	        {
	        	return;
	        }
	        noOfSnakes = Integer.parseInt(stringsnake);
	        
	        
	        
	        int noOfLadders =0;
	        String stringladder = JOptionPane.showInputDialog(
	        new JFrame(),
	        "Please Enter the number of Ladders : ",""); //The label for the ladders
	        
	        if(stringladder == null)
	        {
	        	return;
	        }
	        noOfLadders = Integer.parseInt(stringladder);
	        
	        if(noOfSnakes>(cus.setRows/2+2)||noOfLadders>(cus.setRows/2+2)){
	            JOptionPane.showMessageDialog(new JFrame(),"Number of Snakes or Ladders is too high!!!", "Error Message", JOptionPane.ERROR_MESSAGE);  //The message which will pop up the message in the GUI
	            cus.customBoard(cus.setRows/2, cus.setRows/2);
	            return;
	        }
	        
	        
	        /**
	         * The code below tells you if the users want to choose its boxes.
	         * If you choose yes, then you can number down the starting and ending points.
	         */
	        if (JOptionPane.showConfirmDialog(new JFrame(),
	        "Do you want to set new positions of Snakes and Ladders ?", "Customize",
	        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){//Here i done further research about other option for the message box. It will be in the reference.
	            //This is the code for the snake.
	            cus.snakes.clear();
	            cus.ladders.clear();
	            for(int q=0; q<noOfSnakes; q++){
	                cus.tempSnake = (new Snakes());
	                int snakeFrom=0;
	                String stringSnakeFrom = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the starting position of snake "+q+" : ",""); 
	                if(stringSnakeFrom == null)
	    	        {
	    	        	return;
	    	        }
	                snakeFrom = Integer.parseInt(stringSnakeFrom);
	                
	                
	                int snakeTo=0;
	                String stringSnakeTo = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the end position of snake "+q+" : ","");
	                if(stringSnakeTo == null)
	    	        {
	    	        	return;
	    	        }
	                snakeTo = Integer.parseInt(stringSnakeTo);
	                cus.tempSnake.setSnake(snakeFrom, snakeTo);
	                cus.snakes.add(cus.tempSnake);
	                
	            }
	            //This is the code for the ladders.
	            for(int q=0;q<noOfLadders;q++){
	                cus.tempLadder = (new Ladders());
	                
	                
	                int ladderFrom =0;
	                String StringLadderFrom = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the starting position of ladder "+q+" : ","");
	                if(StringLadderFrom == null)
	    	        {
	    	        	return;
	    	        }
	                ladderFrom = Integer.parseInt(StringLadderFrom);
	                
	                int ladderTo = 0;
	                String stringLadderTo = JOptionPane.showInputDialog(
	                new JFrame(),
	                "Please Enter the end position of ladder "+q+" : ","");
	                if(stringLadderTo == null)
	    	        {
	    	        	return;
	    	        }
	                ladderTo = Integer.parseInt(stringLadderTo);
	                cus.tempLadder.setLadders(ladderFrom, ladderTo);
	                cus.ladders.add(cus.tempLadder);
	                
	            }
	        }
	        else{
	            cus.customBoard(noOfSnakes, noOfLadders); 
	            //Here is where your details is imported to the snake and ladders game, You then go to "Play Game" button and follow those steps to play you customised game.
	           
	        }	
		}
		   catch (NumberFormatException  IME) {
			   IME.printStackTrace();
			   JOptionPane.showMessageDialog(null, "Numbers Only!");
			   
		   }
    }
    
    
    /**
     * The constructor below is for the high score frame, this is activated when the "Chart Table" button is pressed which will display a new window showing you the score table.
     * @param evt
     */
    public void highScoresButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highScoresButtonActionPerformed
    	HighscoreFrame.setSize(450, 400); //Here I am setting the dimensions for this window.
    	HighscoreFrame.setVisible(true);  //Setting the visibility to true, meaning this will appear to your desktop.
    	HighscoreFrame.getContentPane().setBackground(Color.BLUE); //setting the background of the background
    	printHighScores();  //This is from another constructor, which is basically printing the details of all the past people who achieved high scores.
    }

    /**
     * The constructor below is for the help frame, this is activated when the "Need Help" button is pressed which will display a new window showing you a picture.
     * @param evt
     */
    public void helpButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpButtonActionPerformed
    	helpFrame.getContentPane().setBackground(Color.BLUE);
    	helpFrame.setSize(870, 700);  //Setting the dimension of the help frame
    	helpFrame.setVisible(true);  //Setting the help window visible. Meaning making the window to display on screen.
    }

    /**
     * The constructor below is where you enter your names before you start the game itself. These name is for the benefits for the players and also keeps a record of you results.
     * If you get a high score, then you name will be printed in the high score table. In this case, it is for the purpose for two players only.
     * @param evt
     */
    public void twoPlayersButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoPlayersButtonActionPerformed
        player.setNoOfPlayers(2);  //Setting the amount of player in the game.
        player.setPlayer1(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 1 : ","")); //Label for entering the first player name.
        player.setPlayer2(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 2 : ","")); //Label for entering the second player name.
        startPlay(2); //Making both players to play after they processed this window.
    }//GEN-LAST:event_twoPlayersButtonActionPerformed

    /**
     * The constructor below is where you enter your names before you start the game itself. These name is for the benefits for the players and also keeps a record of your results.
     * If you get a high score, then your name will be printed in the high score table. In this case, it is for the purpose for three players.
     * @param evt
     */
    /*public void threePlayersButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePlayersButtonActionPerformed
        player.setNoOfPlayers(3); //Setting the amount of player in the game.
        player.setPlayer1(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 1 : ",""));  //Label for entering the first player name.
        player.setPlayer2(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 2 : ","")); //Label for entering the second player name.
        player.setPlayer3(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 3 : ","")); //Label for entering the third player name.
        startPlay(3); //Making three players to play after they processed this window.
    }*/
    //GEN-LAST:event_threePlayersButtonActionPerformed
    
    /**
     * The constructor below is where you enter your names before you start the game itself. These name is for the benefits for the players and also keeps a record of your results.
     * If you get a high score, then your name will be printed in the high score table. In this case, it is for the purpose to play with the computer.
     * @param evt
     */
  /*  public void computerPlayersButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threePlayersButtonActionPerformed
        player.setNoOfPlayers(2); //Setting the amount of player in the game.
        player.setPlayer1(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Player 1 : ",""));  //Label for entering the first player name.
        player.setPlayer2(JOptionPane.showInputDialog(
        new JFrame(),"Please Enter the name of Computer : ","Computer")); //Label for entering the second player name.
        startComputerPlay(2); //Making three players to play after they processed this window.
    }//GEN-LAST:event_threePlayersButtonActionPerformed
    
    */
    
/**
 * The constructor below is if you want to back to the first window again.
 * This constructor is used twice in the snake and ladder game window.
 * A button called Restart and in the menu.
 * @param evt
 */
    public void backMainMenuButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backMainMenuButtonActionPerformed
        playersFrame.setVisible(false);  //setting the playersFrame invisible
        setVisible(true);
    }//GEN-LAST:event_backMainMenuButtonActionPerformed

    CustomizeBoard cus = null;  //At this point customizeBoard is in a black hole
    GridComp comp = null;
    Grid play = null;    //At this point PlayingBoard is in a black hole
    Players player=null;     //At this point Players is in a black hole
    int highScoreValue=0;
    
    public void setVisibility(boolean s){
        setVisible(s);  //Shows or hides this Window depending on the value of parameter s
    }
    
    public void setClasses(CustomizeBoard customise, Players players){
        cus=customise;  //calling new variable for the given class.
        player=players; //calling new variable for the given class.
        
    }
    
    /**
     * The constructor below makes you to display the player frame. You will also see am using the classes mentioned above in here as well.
     * This will let you display the other classes in the player frame.
     * @param p
     */
    public void startPlay(int HumanPlayers){
        playersFrame.setVisible(false);  //setting this false because this process happens after that
        play = new Grid(cus);  
        play.setVisibility(true); //Making the Playing Board class visible.
        play.setClasses(cus, this,player);
        if(HumanPlayers==2){ //This tells if its two player, then two icon will appear.
            play.setNamesInTextField(player.getPlayerName(0),player.getPlayerName(1),player.getPlayerName(2));
            play.setButton3Visible(false);
        }
        /*else{ //This tells if its three player, then three icon will appear.
            play.setNamesInTextField(player.getPlayerName(0),player.getPlayerName(1),player.getPlayerName(2));
            play.setButton3Visible(true);
        }*/
        cus.setClasses(player, play, null);
        cus.createSnakesAndLadder(); //Here I am using a constructor from the customizeBoard class.
        String message = "Let's Begin The Game!!!\n"+player.getPlayerName(0)+" to begin the game.";  //The label displayed in the information message
        JOptionPane.showMessageDialog(new JFrame(), message, "Start", JOptionPane.INFORMATION_MESSAGE); //The GUI design for the label to be displayed.
        
    }
    
    /**
     * This is for the purpose to play with the computer.
     * @param p
     */
   /* public void startComputerPlay(int CompPlayers){
    

    	playersFrame.setVisible(false);  //setting this false because this process happens after that
        comp = new GridComp(cus);  
        comp.setVisibility(true); //Making the Playing Board class visible.
        comp.setClasses(cus, this,player);
        if(CompPlayers==2){ //This tells if its two player, then two icon will appear.
        	comp.setNamesInTextField(player.getPlayerName(0),player.getPlayerName(1), player.getPlayerName(2));
        	comp.setButton3Visible(false);
        }
        else{ //This tells if its three player, then three icon will appear.
        	comp.setNamesInTextField(player.getPlayerName(0),player.getPlayerName(1),player.getPlayerName(2));
        	comp.setButton3Visible(true);
        }
        cus.setClasses(player, null, comp);
        cus.computerSnakesAndLadder(); //Here I am using a constructor from the customizeBoard class.
        String message = "Let's Begin The Game!!!\n"+player.getPlayerName(0)+" to begin the game.";  //The label displayed in the information message
        JOptionPane.showMessageDialog(new JFrame(), message, "Start", JOptionPane.INFORMATION_MESSAGE); //The GUI design for the label to be displayed.
    }
    */
    
    /**
     * The constructor below is for the high score  frame, this is activated when the "Chart Table" button is pressed which will display a new window displaying the high score chart.
     * @param evt
     */
    public void setScoreCardFrameVisible(boolean b){
        if(b==false){
            return;
        }
        HighscoreFrame.setSize(450, 400); //Setting the dimensions
        HighscoreFrame.setVisible(true); //Setting this to be visible
    }
    
    
    /**
     * This constructor handles all the people scores. You name, rank number, score and dimension will be displayed in the high score table.
     * I am using a score array list to generate the amount of turns you did you win the game. The lower turns you made to win the game, the more rank number you will get.
     * The collection used here is the sort collection. I believed this collection was the less messy by listing data as a rank table. 
     */
    /**
     * @exception, I used several kinds of exception here for the high score. The exception is the purpose for reading stream, so the program can read and understand the details inserted before the user plays the game.
     */
    public void printHighScores(){
        
        ArrayList<GameScore> oldScores = new ArrayList<>();   //Here is the array list for the scores.     
        //Exception number 1.
        try {
            FileInputStream fileStream = new FileInputStream("HighScoreList.ser");
            try (ObjectInputStream os = new ObjectInputStream(fileStream)) {
                Object one = os.readObject();
                oldScores = (ArrayList<GameScore>)one;
            }
        } catch (IOException ex) {
            //Exception number 2.
        	try {
                FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
                ObjectOutputStream os = new ObjectOutputStream(fileStream);
                os.writeObject(oldScores);            
                os.close();
            } catch (IOException ef) {
                System.out.println("\nFile Not Found!!!");  //This will be displayed in the console of the Eclipse. I found it better to be displayed here.
                ef.printStackTrace(); //Prints this throwable and its backtrace to the standard error stream.
            }
        }catch(ClassNotFoundException ec){
            System.out.println("\nClass Not Found!!!"); //This will be displayed in the console of the Eclipse. I found it better to be displayed here.
            ec.printStackTrace(); //Prints this throwable and its backtrace to the standard error stream.
        }
        Collections.sort(oldScores); //I am using a sort collection for calculating each player information.
        int i=0;
        int size=oldScores.size();
        for(int k=0;k<size;k++){  //This code is for if your score is high enough to be in the top ten in the high score table.
            if(i>=10){
               oldScores.remove(i);
               size--;
            }
            i++;
        }
        i=0;
        for(GameScore score : oldScores){
            if(i==9){
                highScoreValue = score.playerMoves; //If it is the top 10 then continue with the process.
            }
            if(i>=10){
                break; //Here I am saying if its not in the top ten then forget about it.
            }
            scoreTable.getModel().setValueAt(i+1, i, 0);  
            scoreTable.getModel().setValueAt(score.name+" ", i, 1);  //This is to set the name in the high score table.
            scoreTable.getModel().setValueAt(score.playerMoves, i, 2); //This calculates the amount of turn you take to complete the game, This start each time you pressed the "Roll Dice" button.
            scoreTable.getModel().setValueAt(score.dimension, i, 3); //Printing the dimension you have chosen.
            i++;
        }
        //Exception number 3.
        try {
            FileOutputStream fileStream = new FileOutputStream("HighScoreList.ser");
            ObjectOutputStream os = new ObjectOutputStream(fileStream);
            os.writeObject(oldScores);            
            os.close();
        } catch (IOException ex) {
            System.out.println("\nFile Not Found!!!"); //This will be displayed in the console of the Eclipse. I found it better to be displayed here.
            ex.printStackTrace(); //Prints this throwable and its backtrace to the standard error stream.
        }      
    }
    
    
    
    
}
