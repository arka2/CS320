package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import taskService.Task;

class TaskTest {

	@Test
	void testTask() {
		Task task = new Task("1", "Wash dishes", "Hand wash dishes and put in rack");
		assertTrue(task.getTaskId().equals("1"));
		assertTrue(task.getName().equals("Wash dishes"));
		assertTrue(task.getDescription().equals("Hand wash dishes and put in rack"));
		assertNotNull(task);
	}

	@Test
	void testTaskIdTooLong() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task("12345678910", "Wash dishes", "Hand wash dishes and put in rack");
		        });
	}
	
	@Test
	void testTaskIdIsNull() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task(null, "Wash dishes", "Hand wash dishes and put in rack");
		        });
	}
	
	@Test
	void testTaskNameTooLong() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task("1", "Wash dishes and put dishes in rack", "Hand wash dishes and put in rack");
		        });
	}
	
	@Test
	void testTaskNameIsNull() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task("1", null, "Hand wash dishes and put in rack");
		        });
	}
	
	@Test
	void testTaskDescriptionTooLong() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task("1", "Wash dishes", "Hand wash dishes and put in rack or hand dry them before putting them away in the cabinet");
		        });
	}
	
	@Test
	void testTaskDescriptionIsNull() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Task task = new Task("1", "Wash dishes", null);
		        });
	}
}
