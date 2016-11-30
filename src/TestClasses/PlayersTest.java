package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.CustomizeBoard;
import snakeandladder.GameMenu;
import snakeandladder.Player;

public class PlayersTest {
	
	
	private static final int noOfPlayers = 0;

	private static final CustomizeBoard c = null;
	private static final GameMenu m = null;
	Player test = new Player();
	private String p1;
	private String p2;
	private String p3;

	private int i;

	private int n;

	private CustomizeBoard customise;

	private GameMenu gameMenu;

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
	public void testGetNewScore() {
		test.getNewScore();
	}


	@Test
	public void testGetNoOfPlayers() {
		test.getNoOfPlayers();
	}


	@Test
	public void testSetNoOfPlayers() {
		assertEquals(test.getNoOfPlayers(), test.numberOfPlayers);
		test.setNoOfPlayers(noOfPlayers);
	}


	@Test
	public void testSetMoves() {
		test.setMoves(i);
	}



	@Test
	public void testSetTurn() {
		test.setTurn();
		
	}

	@Test
	public void testSetClasses() {
		test.setClasses(c, m);
	}


}
