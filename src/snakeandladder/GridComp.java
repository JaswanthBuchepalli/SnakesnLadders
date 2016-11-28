package snakeandladder;



import java.awt.Color;
import java.awt.Dimension;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;


public class GridComp extends javax.swing.JFrame{
	
	//Codes for the JFrame
	private javax.swing.JLabel bluePlayerLabel;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JLabel greenPlayerLabel;
    private javax.swing.JLabel imageLabelPlayer1;
    private javax.swing.JLabel imageLabelPlayer2;
    private javax.swing.JLabel imageLabelPlayer3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem newGameMenuItem;
    private javax.swing.JLabel playersTurnLabel;
    private javax.swing.JButton rollDiceButton;
    private javax.swing.JButton Restart;
    private javax.swing.JMenuItem scoreCardMenuItem;
    private javax.swing.JLabel pinkPlayerLabel;
    private javax.swing.JLabel diceString;


	/**
     * Here I am setting the amount of rows needed to make the grid. In this case, my grid is to be 100
     */
    public GridComp() {
        setRows=5; //The amount of rows is 10
        setColumns=5; //The amount of columns is 10, so 10*10 is 100.
        grid = new JLabel[setColumns*setRows]; //creating the JLabel for the grid.
        GUI(); //This is a constructor.
    }
    public GridComp(CustomizeBoard cus) { //We are using customizeBoard class.
        this.cus=cus;
        setRows=cus.getRows(); //We are using the row number mentioned in CustomizeBoard class.
        setColumns=cus.getColumns();  //We are using the columns number mentioned in CustomizeBoard class.
        grid = new JLabel[setColumns*setRows]; //Setting the grid will require to make the to have 100 little boxes.
        for(int i=0;i<setColumns*setRows;i++){
            grid[i] = new JLabel();
        }
        GUI(); //This is a constructor.
      
    }

    /**
     * The constructor below is to create the interface for the given window.
     */
    @SuppressWarnings("unchecked")
    public void GUI() {

        jPanel1 = new javax.swing.JPanel();
        rollDiceButton = new javax.swing.JButton();
        imageLabelPlayer1 = new javax.swing.JLabel();
        imageLabelPlayer2 = new javax.swing.JLabel();
        imageLabelPlayer3 = new javax.swing.JLabel();
        playersTurnLabel = new javax.swing.JLabel();
        greenPlayerLabel = new javax.swing.JLabel();
        pinkPlayerLabel = new javax.swing.JLabel();
        bluePlayerLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGameMenuItem = new javax.swing.JMenuItem();
        scoreCardMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        Restart = new javax.swing.JButton();
        diceString = new javax.swing.JLabel();
        Icon dice1;
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1500, 1500));

        /**
         * @Exception "InterupttedException". I am using a catch method, so the user can hear the sound when the button is pressed. 
         * Not having the sleep delay will result the user not hearing the full button sound.
         */
        rollDiceButton.setText("Roll Dice"); //setting the button name as "Roll Dice".
        rollDiceButton.setBackground(new java.awt.Color(240,128,128));
        rollDiceButton.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	
            	try {
            	    rollDiceButton(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            	    rollDiceButton(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            	    Thread.sleep(1000);
            	 //   Music music = new Music();
                //	music.ButtonSound("aliensound.wav");
            	} catch (InterruptedException e) {
            	    e.printStackTrace();
            	}
            	
            }
        });
        
        Restart.setText("Restart Game"); //setting the button name as "Restart Game".
        Restart.setBackground(new java.awt.Color(124,252,0));
        Restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) { //The action listener here is used what should the button do when the button is pressed.
            	newGameMenuItem(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            //	Music music = new Music();
            //	music.ButtonSound("aliensound.wav");
            }
        });

        
        
        /**
         * The next several line is for importing pictures to the snake and ladder grid.
         */

        imageLabelPlayer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button1s.png"))); // Importing the first player icon
        imageLabelPlayer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/button2.png"))); // Importing the second player icon
        imageLabelPlayer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snakeandladder/images/buttons3.png"))); // Importing the third player icon


        playersTurnLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // Setting the font as Tahoma and the size as 14.
        greenPlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // Setting the font as Tahoma and the size as 14.
        pinkPlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // Setting the font as Tahoma and the size as 14.
        bluePlayerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // Setting the font as Tahoma and the size as 14.
        jPanel1.setBackground(Color.YELLOW); //setting the background of the background
        
        

        /**
         * Here we are adding the following swing items in to snake and ladders game.
         */
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
        		//These are the position for the horizontal axis.
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                //Most of them are buttons with a grid, and other swing items.
                .addComponent(rollDiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)       
               .addComponent(diceString, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Restart, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)               
                .addComponent(playersTurnLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageLabelPlayer1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(greenPlayerLabel)
                .addGap(18, 18, 18) //We are adding a gap from each button.
                .addComponent(imageLabelPlayer2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pinkPlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(imageLabelPlayer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bluePlayerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
        		//These are the position for the vertical axis.
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19) //We are adding a gap from each button.
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(greenPlayerLabel) //These are player variables, This is player 1.
                    .addComponent(pinkPlayerLabel) //This is player 2
                    .addComponent(bluePlayerLabel)) //This is player 3
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playersTurnLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rollDiceButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Restart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diceString, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageLabelPlayer2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageLabelPlayer3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imageLabelPlayer1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(setRows, setColumns));

        /**
         * This is the menu, this located at the top of the window, it consists only one menu option which is called "File".
         */
        jMenu1.setBackground(new java.awt.Color(176,196,222)); //????
        jMenu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 102), new java.awt.Color(102, 255, 0), null, null));
        jMenu1.setForeground(new java.awt.Color(153, 0, 153));
        jMenu1.setText("File");   //the name of the menu item
        
        /**
         * The next few lines of codes is the items under the file menu item. A new game, score card and exit item within the menu item.
         */

        newGameMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newGameMenuItem.setText("New Game");  //the name of the menu item
        newGameMenuItem.setBackground(new java.awt.Color(0,255,127));
        newGameMenuItem.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	newGameMenuItem(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
        //    	Music music = new Music();
         //   	music.ButtonSound("aliensound.wav");
            }
        });
        jMenu1.add(newGameMenuItem);

        /**
         * This is the purpose if you want to see the high score table in the game window. This is located as a file item in the JMenu
         */
        scoreCardMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        scoreCardMenuItem.setText("Score Card"); //the name of the menu item
        scoreCardMenuItem.setBackground(new java.awt.Color(250,128,114));
        scoreCardMenuItem.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	scoreCardMenuItem(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            //	Music music = new Music();
            //	music.ButtonSound("aliensound.wav");
            }
        });
        jMenu1.add(scoreCardMenuItem);

        /**
         * This is the purpose if you want to close the program. This is located as a file item in the JMenu
         */
        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        exitMenuItem.setText("Exit"); //the name of the menu item
        exitMenuItem.setBackground(new java.awt.Color(245,245,220));
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() { //The action listener here is used what should the button do when the button is pressed.
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	exitMenuItem(evt); //When the button is pressed, the method name here will be called and make the game to do its action.
            //	Music music = new Music();
            //	music.ButtonSound("aliensound.wav");
            }
        });
        
        jMenu1.add(exitMenuItem);
        jMenuBar1.add(jMenu1);
        setJMenuBar(jMenuBar1);

        //Adding the the grid and all the other buttons in the snake and ladders game.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup( //positioning in the horizontal axis.
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            //JPanel 1 is the snake and ladder other items.
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            //JPanel 2 is the snake and ladder grid
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup( //positioning in the vertical axis.
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        pack(); //This is pack the entire swing components together.
        
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    
/**
 * This constructor is when you have pressed the roll dice button in the snake and ladders game.
 * This constructor uses a random code (just like the snakes and ladder function), but the difference is it will generate a random number instead. 
 * It will display the number value in the Eclipse console and in the snake and ladders grid window.
 * @param evt
 */
    public void rollDiceButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rollDiceButtonActionPerformed
        
        if(player.won==1){
            return;
        }
        
        Random randomGenerator = new Random(); 
        int random = randomGenerator.nextInt(6)+1; //Random values to be 1 to 6
        System.out.println(random); //This is to also print the value in the Eclipse console.
        
        
        /**
         * The if statements below connects to the random method. When a random is generated, a suitable picture will be displayed on the snake and ladders grid.
         * For example, if random generates a one, then the dice icon with one dot will be displayed. And so on...
         * I also coded the string version, this is commented it. You can try it out of course this will mean you would have to comment out the if statements.
         */
 
        if(random == 1){
        	diceString.setIcon(getImage(30));
        }
        if(random ==2){
        	diceString.setIcon(getImage(31));
        }
        if(random ==3){
        	diceString.setIcon(getImage(32));
        }
        if(random ==4){
        	diceString.setIcon(getImage(33));
        	
        }
        if(random ==5){
        	diceString.setIcon(getImage(34));
        }
        if(random ==6){
        	diceString.setIcon(getImage(35));
        }
        
    /**
     * IF YOU WANT TO MAKE A STRING WORD INSTRAD OF DICE PICTURE, THE CODE IS ALREADY AVAILABLE. YOU CAN COMMENT OUT THE IF STATEMENTS ABOVE AND UNCOMMENT THE CODE BELOW.       
     * 		String random2 = Integer.toString(random); //setting a new variable for the JLabel.
     *      diceString.setFont(new java.awt.Font("Tahoma", 0, 16));  //Setting the text size 16 and font to be tahoma.
     *      diceString.setText("Dice No: " + random2); //The String to be displayed in the snake and ladder window.   
     */
        diceString.setBounds(0, 170, 1000, 400); // int x, int y, the height and width
        
        if(player.checkValidity(player.turn, random)==0){
            player.setMoves(player.turn); //Here we are using the Player class constructor, this is important, so what ever number is generated, it will move the player icon.
            player.setTurn();
            return;
        }
   
      //When eaten by a snake, this variable is used in the CustomiseBoard class. 
      //If you are on the snake head, the constructor in the CustomiseBoard class will move the player icon to its new number grid.
        random = cus.eatenBySnake(random,player.getLocation(player.turn)-random); 
        //When at the bottom of a ladder, this will use the constructor provided in the customiseBoard class and move your player icon to its new grid value.
        random = cus.climbLadder(random,player.getLocation(player.turn)-random);
        if(player.checkValidity(player.turn, random)==0){
            player.setMoves(player.turn); //Here are using set moves constructor to make the player pictures to move within the grid. This is from the  Players class.
            player.setTurn(); //Here are using set turn constructor to make each player to make a turn. This is from the  Players class.
            return;
        }  
        
        //The constructor below is if their is more than two players in one grid box, This will generate a new picture. This works in all combination.
        //The number values in brackets is from the icon picture from the getImage constructor.
        if(grid[player.getLocation(player.turn)].getIcon()==getImage(6)){
            if(player.turn==0){
               grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
            if(player.turn==1){
               grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
            if(player.turn==2){
               grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(3)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(1));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(0));
            }
        }
        
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(4)){
            if(player.turn==1){
                grid[player.getLocation(player.turn)].setIcon(getImage(2));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(1));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(5)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(2));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(0));
            }
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(null);
        }  

        player.setLocation(player.turn, random);
        
        if(grid[player.getLocation(player.turn)].getIcon()!=null){
            checkTheButtons();
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(getImage(player.turn));
        }
        player.setMoves(player.turn);
        player.setTurn();
        playersTurnLabel.setText(player.getPlayerName(player.turn) +" its your turn now");}
    //GEN-LAST:event_rollDiceButtonActionPerformed

    /**
     * The MainMenu class to print the high score. This high score table works when you press the "Chart Table" button in the first window.
     * @param evt
     */
    public void scoreCardMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreCardMenuItemActionPerformed
        menu.printHighScores(); //Using the printHighScore constructor in the MainMenu class.
        menu.setScoreCardFrameVisible(true); //This is to set the score table visible, in this case it is.
    }//GEN-LAST:event_scoreCardMenuItemActionPerformed

    /**
     * When you press this event, it will close the program.
     * @param evt
     */
    public void exitMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0); //This constructor basically closes the program in the snake and ladder game.     
    }//GEN-LAST:event_exitMenuItemActionPerformed

    /**
     * When you want to press the menu item called new game, this will return you back to the main menu window.
     * @param evt
     */
    private void newGameMenuItem(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameMenuItemActionPerformed
        setVisibility(false);        
        menu = new GameMenu();  //This is from the MainMenu class.
        cus = new CustomizeBoard(); //This is from the customizeBoard class.
        player = new Players(); //This is from the Players class.
        menu.setClasses(cus, player);
        cus.setClasses(player, null, null);
        menu.setVisibility(true);
        menu.printHighScores();
    }//GEN-LAST:event_newGameMenuItemActionPerformed

    //setting variables for each class. At this point it is null, these classes will be used in several constructor below.
    CustomizeBoard cus =null;
    GameMenu menu = null;    
    Players player = new Players();
    int setRows, setColumns;
    javax.swing.JLabel[] grid;
    Icon previousIcon=null;
    int twoSame=0,threeSame=0;
    GameImages t =new GameImages();
    
    /**
     * This constructor actually display the grid in the snake and ladders game. Here you can adjust the size of the game window.
     * This constructor has a relationship with CustomizeBoard class, when you play the tradition game, all the details is sent to Grid and CustomiseBoard class.
     */
    public void showGrids(){
        
       setRows=cus.getRows(); setColumns=cus.getColumns();
       if(cus.getRows()>=4){ //Giving a total of 100 boxes in a box.
           setSize(1500+setRows*20, 1000); 
           
       }
       else{
           setSize(500+setRows*44, 350+setColumns*40);  
       }
       
       for(int i=0;i<setColumns*setRows;i++){
           
           
           grid[i].setBackground(Color.ORANGE); //I set the grid background orange.
           
           grid[i].setOpaque(true);
           grid[i].setBorder(BorderFactory.createLineBorder(Color.BLUE));
           
           grid[i].setHorizontalAlignment(SwingConstants.RIGHT);
           grid[i].setVerticalAlignment(SwingConstants.BOTTOM);
           grid[i].setText(setColumns*setRows-i+"");
           jPanel2.add(grid[i]); //This code is added to grid, JPanel2 is the grid, so we add it with this panel variable.
       }       
    }
    
    /**
     * Setting the visibility for the showGrids constructor.
     * @param s
     */
    public void setVisibility(boolean s){
        if(s==true){
            showGrids();
            setVisible(true);      //Set the showGrid constructor visible.     
        }
        else{
            setVisible(false); //Otherwise, don't display it.
        }
    }
    
    /**
     * It is the same variable made in the other classes.
     * @param c
     * @param m
     * @param p
     */
    public void setClasses(CustomizeBoard c, GameMenu m, Players p){
        cus=c;
        menu=m;
        player=p;
        player.setClasses(cus,menu);
    }
    /**
     * If i chose to play a three player game, all three players colour will be displayed in the snake and ladders grid.
     * @param b
     */
    public void setButton3Visible(boolean b){
        imageLabelPlayer1.setVisible(true);
        imageLabelPlayer2.setVisible(true);
        imageLabelPlayer3.setVisible(b);
        if(b==false){
            grid[cus.setColumns*cus.setRows-1].setIcon(getImage(3));
        }
        else{
            grid[cus.setColumns*cus.setRows-1].setIcon(getImage(6));
        }
    }
    //Here i am return each picture from the GameImages class.
    public Icon getImage(int i){
        switch(i){
            case 0 : 
                return imageLabelPlayer1.getIcon();                
            case 1 :
                return imageLabelPlayer2.getIcon();
            case 2 :
                return imageLabelPlayer3.getIcon();
            case 3 :
                return t.getTwoLabel().getIcon();
            case 4 :
                return t.get23Button().getIcon();
            case 5 :
                return t.get13Button().getIcon();
            case 6 :
                return t.getThreeLabel().getIcon();   
            case 12 :
                return t.getTwoLabel().getIcon();
            case 23 :
                return t.get23Button().getIcon();
            case 13 :
                return t.get13Button().getIcon();
            case 30 :
            	return t.getdice1().getIcon();
            case 31 :
            	return t.getdice2().getIcon();
            case 32 :
            	return t.getdice3().getIcon();
            case 33 :
            	return t.getdice4().getIcon();
            case 34 : 
            	return t.getdice5().getIcon();
            case 35 : 
            	return t.getdice6().getIcon();
            	
        }
        return null;
    }
    //The constructor below is if their is more than two players in one grid box, This will generate a new picture. This works in all combination.
    public void checkTheButtons(){
        if(grid[player.getLocation(player.turn)].getIcon()==getImage(0)){
            if(player.turn==1){
                grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
        }
        
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(1)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(12));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(2)){
            if(player.turn==0){
                grid[player.getLocation(player.turn)].setIcon(getImage(13));
            }
            else{
                grid[player.getLocation(player.turn)].setIcon(getImage(23));
            }
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(3)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(4)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else if(grid[player.getLocation(player.turn)].getIcon()==getImage(5)){
            grid[player.getLocation(player.turn)].setIcon(getImage(6));
        }
        else{
            grid[player.getLocation(player.turn)].setIcon(null);
        }
    }
    
    /**
     * If you choose the two player, then two string will appear.
     * This is used for both Human vs Human and Computer vs Human
     * @param p1
     * @param p2
     * @param p3
     */
    public void setNamesInTextField(String p1, String p2, String p3){
        if(player.getNoOfPlayers()==2){
            greenPlayerLabel.setText(p1);
            pinkPlayerLabel.setText(p2);
           
            
        }
        //Otherwise, three strings will appear.
        else if(player.getNoOfPlayers()==2){
            greenPlayerLabel.setText(p1);
            pinkPlayerLabel.setText(p2);
            //bluePlayerLabel.setText(p3);
        }
    }
 
    
}