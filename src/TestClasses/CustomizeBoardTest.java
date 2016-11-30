package TestClasses;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import snakeandladder.CustomizeBoard;
import snakeandladder.Grid;
import snakeandladder.GridComp;
import snakeandladder.Player;

public class CustomizeBoardTest {
	
	CustomizeBoard test = new CustomizeBoard();
	private int random;
	private int n;
	private int m;
	private int pos;
	private Player p;
	private Grid g;
	private Object obj;
	private int r;
	private int c;
	private Player players;
	private Grid grid;
	private GridComp comp;
	private int setColumns;
	private int setRows;
	private int snake;
	private int ladder;
	private int position;
	private Player player;

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
	public void testSetDimension() {
		r = 10;
		c = 10;
		test.setDimension(r, c);
		assertEquals(test.getColumns()+test.getRows(),20);
	}

	@Test
	public void testGetColumns() {
		test.getColumns();
		assertEquals(test.getColumns(),10);
	}

	@Test
	public void testGetRows() {
		test.getRows();
		assertEquals(test.getRows(),10);
	}



	@Test
	public void testCustomBoard() {
		test.customBoard(snake, ladder);
		
	}

	@Test
	public void testEatenBySnake() {
		test.eatenBySnake(random, position);
		assertEquals(test.eatenBySnake(random, position),position = setColumns*setRows-position);
	}

	@Test
	public void testClimbLadder() {
		test.climbLadder(random, pos);
		assertEquals(test.climbLadder(random, pos),pos = setColumns*setRows-pos);
	}




	@Test
	public void testGetClass() {
		test.getClass();
		assertEquals(test.getClass(), CustomizeBoard.class);
	}

	@Test
	public void testHashCode() {
		test.hashCode();
	}

	@Test
	public void testEquals() {
		test.equals(obj);
	}


	@Test
	public void testToString() {
		test.toString();
	}

	@Test
	public void testFinalize() {
		
	}
}
