package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import desafio.Main;

public class SolutionTest {

	@Test
	public void testSolution() {
		int n = Main.solution(213);
		assertEquals(321, n);
	}
	
	@Test
	public void testSolution2() {
		int n = Main.solution(553);
		assertEquals(553, n);
	}
	
	@Test
	public void testSolution3() {
		int n = Main.solution(100000001);
		assertEquals(-1, n);
	}

}
