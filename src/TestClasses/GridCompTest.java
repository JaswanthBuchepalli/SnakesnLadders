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
import snakeandladder.GridComp;
import snakeandladder.Player;

public class GridCompTest {
	
	private static final int i = 0;
	private static final String p1 = null;
	private static final String p2 = null;
	private static final String p3 = null;
	private static final boolean s = false;
	private static final ActionEvent evt = null;
	private static final Player p = null;
	private static final GameMenu m = null;
	private static final CustomizeBoard c = null;
	GridComp t = new GridComp();
	private boolean b;
	

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
		t.setVisibility(s);
	}


	@Test
	public void testGetImage() {
		t.getImage(i);
	}


	@Test
	public void testSetNamesInTextField() {
		t.setNamesInTextField(p1, p2, p3);
	}
@Test
	public void testGUI(){
		t.GUI();
	}

}
