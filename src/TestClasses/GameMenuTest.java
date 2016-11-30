package TestClasses;

import static org.junit.Assert.*;

import java.awt.event.ActionEvent;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.CustomizeBoard;
import snakeandladder.GameMenu;
import snakeandladder.Player;

public class GameMenuTest {

	private static final int HumanPlayers = 0;
	GameMenu test = new GameMenu();
	private CustomizeBoard c;
	private Player p;
	private boolean s;
	private boolean b;
	private ActionEvent evt;
	private Object setVisible;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}


	@Test
	public void testSetVisibility() {
		test.setVisibility(s);
	}

	@Test
	public void testSetClasses() {
		test.setClasses(c, p);
		test.getClass();
	}


	@Test
	public void testSetScoreCardFrameVisible() {
		test.setScoreCardFrameVisible(b);
	}

	@Test
	public void testPrintHighScores() {
		test.printHighScores();
	}
	
	@Test
	public void testHighScoresButton() {
		test.highScoresButton(evt);
	}
	@Test
	public void testHelpButton() {
		test.helpButton(evt);
	}
	
	@Test
	public void testbackMainMenuButton() {
		test.backMainMenuButton(evt);
	}
	@Test
	public void testreTurnAboutButton() {
		test.returnaboutButton(evt);
	}
	
	
	

	@Test
	public void testGUI() {
		test.GUI();

		
	}

}
