package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;
import taskService.Task;
import taskService.TaskService;

class TaskServiceTest {

	@Test
	void testNewTaskService() {
		TaskService taskService = new TaskService();
		taskService.newTask("1", "Wash dishes", "Hand wash dishes and put in rack");
		Task task = taskService.findTask("1");
		assertNotNull(task);
	}
	
	@Test
	void testRemoveTask() {
		TaskService taskService = new TaskService();
		taskService.newTask("1", "Wash dishes", "Hand wash dishes and put in rack");
		taskService.deleteTask("1");
		assertNull(taskService.findTask("1"));
	}
	
	@Test
	void testUpdateTask () {
		TaskService taskService = new TaskService();
		taskService.newTask("1", "Wash dishes", "Hand wash dishes and put in rack");
		taskService.updateTask("1", "Hang clothes", "Take clothes from wash and pin to line");
		Task task = taskService.findTask("1");
		assertNotNull(task);
	}
	
	@Test
	void testTaskDuplicatedTaskId() {
		TaskService taskService = new TaskService();
		taskService.newTask("1", "Wash dishes", "Hand wash dishes and put in rack");
	    assertThrows(IllegalArgumentException.class,
            ()->{
            	taskService.newTask("1", "Hang clothes", "Take clothes from wash and pin to line");
            });
	}

}
