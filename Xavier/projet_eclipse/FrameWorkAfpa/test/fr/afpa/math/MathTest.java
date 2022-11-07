package fr.afpa.math;

import static fr.afpa.math.Math.facto;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

class MathTest {
	
	
	@BeforeEach void setUp() throws Exception {
		
	}
	
	@AfterEach void tearDown() throws Exception {
		
	}

	@Test public void testfactorielle1() {
		assertTrue(facto(0)==1,"la factorielle de zéro vaut 1 ");
	}

	
	
	@Test public void testfactorielle2() {
		assertFalse(facto(1)!=1,"la factorielle de zéro vaut 1 ");
	}
	
	@Test public void testfactorielle3() {
		assertEquals(facto(3),6,"la factorielle de 3 vaut 6 ");
	}

	@Test public void testfactorielle4() {
		assertThrows(IllegalArgumentException.class,()->{facto(21);}, " factorielle de 21 ne peut etre calculé ");
	}

//	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
