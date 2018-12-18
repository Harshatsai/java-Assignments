package assignments;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPerson2 {


	@Test
	public void testGetFullName() {
		System.out.println("from TestPerson2");
		Person per = new Person("Robert","King");
		assertEquals("Robert King",per.getFullName());

	}

	@Test
	public void testGetFirstName() {
		Person p=new Person("Robert","King");
		 assertEquals(p.getFirstName(), "Robert");
	}

	@Test
	public void testGetLastName() {
		Person p=new Person("Robert","King");
		 assertEquals(p.getLastName(), "King");
	}

}
