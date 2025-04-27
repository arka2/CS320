package appointmentService;

import java.util.Date;
import java.time.LocalDate;

public class Appointment {
	
	// Declare members
	private String appointmentId;
	private LocalDate date;
	private String description;
	
	public Appointment(String appointmentId, LocalDate date, String description) {
		setAppointmentId(appointmentId);
		setDate(date);
		setDescription(description);
	}
	
	/**
	 * Get unique appointment ID
	 * 
	 * @return appointment's ID
	 */
	public String getAppointmentId() {
		return this.appointmentId;
	}
	
	/**
	 * Set appointment ID
	 * 
	 * @param appointmentId
	 */
	private void setAppointmentId(String appointmentId) {
		// Check if appointment ID is null and longer than 10 chars
		if ((appointmentId == null) || (appointmentId.length() > 10)) {
			throw new IllegalArgumentException("Invalid appointment ID");
		}
		
		// Set task ID
		this.appointmentId = appointmentId;
	}
	
	/**
	 * Get date of appointment
	 * 
	 * @return date
	 */
	public LocalDate getDate() {
		return this.date;
	}
	
	/**
	 * Set appointment date
	 * 
	 * @param date
	 */
	public void setDate(LocalDate date) {
		LocalDate currDate = LocalDate.now();
		// Check if date is null or in the past
		if ((date == null) || (date.isBefore(currDate))) {
			throw new IllegalArgumentException("Invalid date");
		}
		
		// Set name
		this.date = date;
	}
	
	/**
	 * Get appointment description
	 * 
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	
	/**
	 * appointment description
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
