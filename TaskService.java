package taskService;

import java.util.Vector;

public class TaskService {
	
	// Declare vector to hold all tasks
	private Vector<Task> tasks = new Vector<>();
	
	/**
	 * Create new task, check if its ID already exists within the tasks vector, and adds it to vector if not already existing
	 * 
	 * @param taskId
	 * @param name
	 * @param description
	 */
	public void newTask(String taskId, String name, String description) {
		// New task
		Task task = new Task(taskId, name, description);
		
		// Check if task already exists with taskId
		for (int i = 0; i < tasks.size(); i++) {
			Task currTask = tasks.get(i);
			
			// If task matches
			if (currTask.getTaskId().equals(taskId)) {
				throw new IllegalArgumentException("Invalid task ID");
			}
		}
		
		// Add task to vector
		tasks.add(task);
	}
	
	public void deleteTask(String taskId) {
		
		// Search for task with taskId
		for (int i = 0; i < tasks.size(); i++) {
			Task currTask = tasks.get(i);
			
			// If task found
			if (currTask.getTaskId().equals(taskId)) {
				// Remove task from vector
				tasks.remove(currTask);
				return;
			}
		}
	}
	
	/**
	 * Find and return a task via its ID
	 * 
	 * @param taskId
	 * @return matching Task or a null Task
	 */
	public Task findTask(String taskId) {
		
		// Search for task with matching taskId
		for (int i = 0; i < tasks.size(); i++) {
			Task currTask = tasks.get(i);
			
			// If match found, return the current task
			if (currTask.getTaskId().equals(taskId)) {
				return currTask;
			}
		}
		// Otherwise, return a null task
		return null;
	}
	
	/**
	 * Find task that matches an ID and update its name and description
	 * 
	 * @param taskId
	 * @param name
	 * @param description
	 */
	public void updateTask(String taskId, String name, String description) {
		// Search for task that matches taskId
		for (int i = 0; i < tasks.size(); i++) {
			Task currTask = tasks.get(i);
			
			// If match found, update name and description
			if (currTask.getTaskId().equals(taskId)) {
				currTask.setName(name);
				currTask.setDescription(description);
				break;
			}
		}
	}

}
