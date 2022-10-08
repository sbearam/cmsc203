import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	private GradeBook gradebook1;
	private GradeBook gradebook2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception 
	{
		gradebook1 = new GradeBook(5);
		gradebook2 = new GradeBook(5);
		gradebook1.addScore(65.0);
		gradebook1.addScore(55.0);
		gradebook2.addScore(40.0);
		gradebook2.addScore(45.0);
	}

	@AfterEach
	void tearDown() throws Exception 
	{
		gradebook1 = null;
		gradebook2 = null;
	}

	@Test
	void testSum() 
	{
		assertEquals(120, gradebook1.sum(), .0001);
		assertEquals(85, gradebook2.sum(), .0001);
	}
	
	@Test
	void addScoreTest()
	{
		assertTrue(gradebook1.toString().equals("65.0 55.0 "));
		assertTrue(gradebook2.toString().equals("40.0 45.0 "));	
	}

	@Test
	void testMinimum()
	{
		assertEquals(55, gradebook1.minimum(), .001);
		assertEquals(40, gradebook2.minimum(), .001);
	}
	
	@Test
	void FinalScore()
	{
		assertEquals(65, gradebook1.finalScore(), .001);
		assertEquals(45, gradebook2.finalScore(), .001);
	}
}
