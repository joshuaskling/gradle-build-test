import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class GameCarTest extends TestCase{

	@Test
	public void test() {
		testMoveFoward();
		testMoveBackward();
		testNewCar();
		testRace();
		testEquals();
	}
	
	@Test
	public void testMoveFoward(){
		assertEquals(9, GameCar.moveForward(9));
		assertEquals(0, GameCar.moveForward(0));
		assertEquals("error", GameCar.moveForward(-9));
	}
	
	@Test
	public void testMoveBackward(){
		assertEquals(9, GameCar.moveForward(9));
		assertEquals(0, GameCar.moveForward(0));
		assertEquals("error", GameCar.moveForward(-9));
	}
	
	@Test
	public void testNewCar(){
		assertNotNull(new GameCar ("MyBuddy", "Red", 19));
		assertNotNull(new GameCar ("", "Red", 19));
		assertNotNull(new GameCar ("", "Red", 0));
		assertNotNull(new GameCar ("", "", 0));
	}
	
	@Test
	public void testRace(){
		assertEquals("MyBuddy", GameCar.race(new GameCar ("MyBuddy", "Red", 30)));
		assertEquals("BlueJay", GameCar.race(new GameCar ("MyBuddy", "Red", 10)));
		assertEquals("tie", GameCar.race(new GameCar ("MyBuddy", "Red", 20)));
	}
	
	@Test
	public void testEquals(){
		assertFalse(GameCar.equals(new GameCar ("MyBuddy", "Red", 30)));
		assertTrue(GameCar.equals(new GameCar ("BlueJay", "Blue", 20)));
	}
}
