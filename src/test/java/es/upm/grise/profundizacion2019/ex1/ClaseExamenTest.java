package es.upm.grise.profundizacion2019.ex1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class ClaseExamenTest {

	private ClaseExamen test;

	@Before
	public void before(){
		test = new ClaseExamen();
	}

	@Test
	public void test1() {
		int a = 1; int b = 2;
		float exp = 0;
		assertEquals(exp, test.metodoAProbar(a,b),0);
	}

	@Test
	public void test2() {
		int a = 5; int b = 1;
		float exp = 0;
		assertEquals(exp, test.metodoAProbar(a,b),0);
	}

}
