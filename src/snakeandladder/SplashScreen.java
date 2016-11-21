package snakeandladder;


import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import com.thehowtotutorial.splashscreen.JSplash;

public class SplashScreen {
	
public void splash(){
	try{
		
		Random randomSplash = new Random();
	    int random = randomSplash.nextInt(3)+1;
	    
	    if(random == 1){
	    	JSplash splash=new JSplash(GameLaunch.class.getResource("/snakeandladder/images/splash.jpg"), true, true, false, "V1", null, Color.RED, Color.BLUE);
	    	splash.splashOn();
	    	splash.setProgress(20, "Loading"); //Every time every 20% is completed, a new string will be presented in the loading bar.
	    	Thread.sleep(1000); //I create the delay, so the user can have time reading the string. This explanation to every other line.
	    	splash.setProgress(40, "Gathering Information");
	    	Thread.sleep(1000);
	    	splash.setProgress(60, "Setting Out Data");
	    	Thread.sleep(1000);
	    	splash.setProgress(80, "Starting Game");
	    	Thread.sleep(1000);
	    	splash.splashOff();
	    }
		if(random ==2){	
		    	JSplash splash2=new JSplash(GameLaunch.class.getResource("/snakeandladder/images/logo1.jpg"), true, true, false, "V1", null, Color.RED, Color.BLUE);
		    	splash2.splashOn();
		    	splash2.setProgress(20, "Loading"); //Every time every 20% is completed, a new string will be presented in the loading bar.
		    	Thread.sleep(1000); //I create the delay, so the user can have time reading the string. This explanation to every other line.
		    	splash2.setProgress(40, "Gathering Information");
		    	Thread.sleep(1000);
		    	splash2.setProgress(60, "Setting Out Data");
		    	Thread.sleep(1000);
		    	splash2.setProgress(80, "Starting Game");
		    	Thread.sleep(1000);
		    	splash2.splashOff();
		    	}
		  if(random==3){
			 
			    	JSplash splash2=new JSplash(GameLaunch.class.getResource("/snakeandladder/images/picture.png"), true, true, false, "V1", null, Color.RED, Color.BLUE);
			    	splash2.splashOn();
			    	splash2.setProgress(20, "Loading"); //Every time every 20% is completed, a new string will be presented in the loading bar.
			    	Thread.sleep(1000); //I create the delay, so the user can have time reading the string. This explanation to every other line.
			    	splash2.setProgress(40, "Gathering Information");
			    	Thread.sleep(1000);
			    	splash2.setProgress(60, "Setting Out Data");
			    	Thread.sleep(1000);
			    	splash2.setProgress(80, "Starting Game");
			    	Thread.sleep(1000);
			    	splash2.splashOff();
		  }  
	}catch (Exception e){
		e.printStackTrace();
		JOptionPane.showMessageDialog(null, "The program has abort the game");
		System.out.println("The program has abort the game");   //Testing the program
	}
	
}


}
