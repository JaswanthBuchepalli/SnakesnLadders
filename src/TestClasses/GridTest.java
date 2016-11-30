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
import snakeandladder.Grid;
import snakeandladder.Player;

public class GridTest {
	
	Grid test = new Grid();
	private boolean s;
	private CustomizeBoard c;
	private GameMenu m;
	private Player p;
	private boolean b;
	private String p1;
	private String p2;
	private String p3;
	private int i;
	private ActionEvent evt;
	private int setRows;
	private CustomizeBoard cus;
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
	public void testSetVisibility() {
		test.setVisibility(s);
	}
	
	@Test
	public void testGUI() {
		
		test.GUI();
	}


	@Test
	public void testGetImage() {
		test.getImage(i);
	}


	@Test
	public void testSetNamesInTextField() {
		test.setNamesInTextField(p1, p2, p3);
	}
	@Test
	public void testSetClasses(){
		test.getClass();
	}
	


}
