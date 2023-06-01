import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import junitproj.Student;
import junitproj.StudentDriver;

public class TestClass {

	@Test
	public void useStub() {
		
		StudentDriver sd = new StudentDriver();
		List<Student> list = sd.stdData();
		
		assertEquals(3, list.size());
		
		for(Student sobj : list) {
			String name = sobj.getName();
			int age = sobj.getAge();
			int id =sobj.getId();
			
			assertEquals("Prajwal", name);
			assertEquals(23, age);
			assertEquals(1, id);
			break;
		}
		
		
	}
}
