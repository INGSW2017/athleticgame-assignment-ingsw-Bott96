package it.unical.test;

import java.time.Instant;

import org.junit.Assert;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame a = new AthleticGame("Maratona");

	@Test
	public void addArrivalTest() {
		
		a.addArrival("Agostino", Instant.now());
		
		Assert.assertEquals(1 , a.getArrivals().size() );
		
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParecipiantTimeTest()
	{
		//se voglio il tempo di un partecipante che non c'è, da eccezione ma è controllata
		a.addArrival("Agostino", Instant.now());
		a.getParecipiantTime("Agosastino");
		
	}
	
}
