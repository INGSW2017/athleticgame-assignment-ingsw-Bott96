package it.unical.test;

import java.time.Instant;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnersTest {

	private static AthleticGame c = null;

	@BeforeClass
	public static void inizializzazione() {
		c = new AthleticGame("Running");
	}

	@After
	public void resetTest() {
		c.reset();
	}

	@Before
	public void startTest() {
		c.start();
	}
	
	@Test
	public void getWinnerTest()
	{
		c.addArrival("p1", Instant.now());
		c.addArrival("p2", Instant.now().plusMillis(1000));
		c.addArrival("p3", Instant.now().plusMillis(1000));
		
		String s = new String();
		
		s = c.getWinner();
		
		Assert.assertEquals("p1", s);
		
	}
	
	@Test
	public void getWinnerNull()
	{
		String s = new String();
		
		s = c.getWinner();
		
		Assert.assertEquals(null, s);
		
	}
	

}
