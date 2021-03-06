package problem.model;

import static org.junit.Assert.*;

import org.junit.Test;

import problem.library.Data;

public class DataTest {

	@Test
	public final void testCreateData() {
		int expectedId = 1;
		String expectedCntn = "Data - 1"; 
		Data d = new Data(expectedId, expectedCntn);
		
		assertEquals(expectedId, d.getId());
		assertEquals(expectedCntn, d.getContent());
	}

	@Test
	public final void testEqualsAndHashCodeContract() {
		Data d1 = new Data(1, "YoYoYo!!");
		Data d2 = new Data(1, "YoYoYo!!");
		
		assertEquals(d1.hashCode(), d2.hashCode());
		assertTrue(d1.equals(d2));
	}
}
