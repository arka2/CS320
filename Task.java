package taskService;

public class Task {
	
	private String taskId;
	private String name;
	private String description;
	
	/**
	 * Constructor
	 * 
	 * @param taskId
	 * @param name
	 * @param description
	 */
	public Task(String taskId, String name, String description) {
		setTaskId(taskId);
		setName(name);
		setDescription(description);
	}
	
	/**
	 * Get unique task ID
	 * 
	 * @return task's ID
	 */
	public String getTaskId() {
		return this.taskId;
	}
	
	/**
	 * Set task ID of task
	 * 
	 * @param taskId
	 */
	private void setTaskId(String taskId) {
		// Check if task ID is null and longer than 10 chars
		if ((taskId == null) || (taskId.length() > 10)) {
			throw new IllegalArgumentException("Invalid task ID");
		}
		
		// Set task ID
		this.taskId = taskId;
	}
	
	/**
	 * Get name of task
	 * 
	 * @return name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Set task name
	 * 
	 * @param name
	 */
	public void setName(String name) {
		// Check if name is null and longer than 20 chars
		if ((name == null) || (name.length() > 20)) {
			throw new IllegalArgumentException("Invalid name");
		}
		
		// Set name
		this.name = name;
	}
	
	/**
	 * Get task description
	 * 
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * Set task description
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		// Check if description is null and greater than 50 chars
		if ((description == null) || (description.length() > 50)) {
			throw new IllegalArgumentException("Invalid description");
		}
		
		//Set description
		this.description = description;
	}

}
