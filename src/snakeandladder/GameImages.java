/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snakeandladder;


import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * 
 * 
 * 
 */

public class GameImages extends javax.swing.JFrame implements Serializable{
	
	//All the JLabel below are for picture use.
    public javax.swing.JLabel blueAndGreen;
    public javax.swing.JLabel player2And3;
    public javax.swing.JLabel pinkGreeAndBlue;
    public javax.swing.JLabel pinkAndBlue;
    public javax.swing.JLabel ladderImage;
    public javax.swing.JLabel ladderImage2;
    public javax.swing.JLabel snakePic;
    public javax.swing.JLabel snakePic2;
    public javax.swing.JLabel dice1;
    public javax.swing.JLabel dice2;
    public javax.swing.JLabel dice3;
    public javax.swing.JLabel dice4;
    public javax.swing.JLabel dice5;
    public javax.swing.JLabel dice6;
    
    
    /**
     * Creates new form GameImages
     */
    public GameImages() {
    	GUI();
    }

    /**
     * The constructor below shows i am importing picture from my project file. I will use inheritance to display the necessary picture for my project.
     */
    @SuppressWarnings("unchecked")
    public void GUI() {

    	//Setting a JLabel for each picture, this is happens to be the best  way to display pictures.
    	pinkAndBlue = new javax.swing.JLabel();
        pinkGreeAndBlue = new javax.swing.JLabel();
        blueAndGreen = new javax.swing.JLabel();
        player2And3 = new javax.swing.JLabel();
        ladderImage = new javax.swing.JLabel();
        ladderImage2 = new javax.swing.JLabel();
		snakePic = new javax.swing.JLabel();
		snakePic2 = new javax.swing.JLabel();
		dice1 = new javax.swing.JLabel();
		dice2 = new javax.swing.JLabel();
		dice3 = new javax.swing.JLabel();
		dice4 = new javax.swing.JLabel();
		dice5 = new javax.swing.JLabel();
		dice6 = new javax.swing.JLabel();
		
		//Import these picture in the snake and ladder window, not having the snake and ladder images will result not knowing where is the snake and ladder withing the grid.
        snakePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/snake.jpg"))); // NOI18N
        snakePic2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/snake3.jpg"))); // NOI18N
        ladderImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/ladder.jpg"))); // NOI18N
        ladderImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/ladder3.png"))); // NOI18N
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        pinkAndBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/twobuttons.png"))); // Importing a picture to the GameImages class.
        pinkGreeAndBlue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/threeButton.png"))); // Importing a picture to the GameImages class.
        blueAndGreen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button13.png"))); // Importing a picture to the GameImages class.
        player2And3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button23.png"))); // Importing a picture to the GameImages class.

        dice1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice1.PNG"))); // Importing a picture to the GameImages class.
        dice2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice2.PNG"))); // Importing a picture to the GameImages class.
        dice3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice3.PNG"))); // Importing a picture to the GameImages class.
        dice4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice4.PNG"))); // Importing a picture to the GameImages class.
        dice5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice5.PNG"))); // Importing a picture to the GameImages class.
        dice6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/dice6.PNG"))); // Importing a picture to the GameImages class.


        
        
        /**
   * Here we are adding each image in the snake and ladder game window. Not adding this will result not know where the player position is on the grid.
   * The variable below is if their is two players counters in the same grid number. For example, if all 3 players are in the same grid, then the "pinkGreenAndBlue" picture will display in the game grid.
         */
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup( //Positioning the horizontal axis.
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blueAndGreen))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 226, Short.MAX_VALUE)
                                        .addComponent(player2And3)
                                        .addGap(124, 124, 124))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(154, 154, 154)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pinkGreeAndBlue)))))
                .addGap(30, 30, 30))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(170, 170, 170)
                    .addComponent(pinkAndBlue)
                    .addContainerGap(351, Short.MAX_VALUE))));
        
        layout.setVerticalGroup( //Positioning the vertical axis.
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(pinkGreeAndBlue)))
                .addGap(45, 45, 45)
                .addComponent(blueAndGreen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(player2And3)
                        .addGap(13, 13, 13)
                .addGap(36, 36, 36))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(121, 121, 121)
                    .addComponent(pinkAndBlue, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGap(122, 122, 122))))));
        		pack();
    }

 

/**
 * The constructor below, is for returning each picture and is used in the PlayingBoard class (majority of them).
 * @return
 */
  //Here i am returning each picture.
    public JLabel getSnake(){
        return snakePic;
    }
    public JLabel getSnake2(){
        return snakePic2;
    }
    public JLabel getLadder(){
        return ladderImage;
    }
    public JLabel getLadder2(){
        return ladderImage2;
    }
    public JLabel getTwoLabel(){
        return pinkAndBlue;
    }
    public JLabel getThreeLabel(){
        return pinkGreeAndBlue;
    }
    public JLabel get13Button(){
        return blueAndGreen;
    }
    public JLabel get23Button(){
        return player2And3;
    } 
    public JLabel getdice1(){
        return dice1;
    }
    public JLabel getdice2(){
        return dice2;
    }
    public JLabel getdice3(){
        return dice3;
    }
    public JLabel getdice4(){
        return dice4;
    }
    public JLabel getdice5(){
        return dice5;
    }
    public JLabel getdice6(){
        return dice6;
    }

}
