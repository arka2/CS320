package appointmentService;

import java.time.LocalDate;
import java.util.Date;
import java.util.Vector;

import taskService.Task;

public class AppointmentService {
	
	// Vector to hold appointments
	private Vector<Appointment> appointments = new Vector<>();
	
	/**
	 * Add new appointment to appointments vector
	 * 
	 * @param appointmentId
	 * @param date
	 * @param description
	 */
	public void newAppointment(String appointmentId, LocalDate date, String description) {
		// New task
		Appointment appointment = new Appointment(appointmentId, date, description);
		
		// Check if appointment already exists with appointmentId
		for (int i = 0; i < appointments.size(); i++) {
			Appointment currAppointment = appointments.get(i);
			
			// If appointment matches
			if (currAppointment.getAppointmentId().equals(appointmentId)) {
				throw new IllegalArgumentException("Invalid appointment ID");
			}
		}
		
		// Add task to vector
		appointments.add(appointment);
	}
	
	/**
	 * Remove appointment from vector
	 * 
	 * @param appointmentId
	 */
	public void deleteAppointment(String appointmentId) {
		
		// Search for appointment with appointmentId
		for (int i = 0; i < appointments.size(); i++) {
			Appointment currAppointment = appointments.get(i);
			
			// If appointment found
			if (currAppointment.getAppointmentId().equals(appointmentId)) {
				// Remove appointment from vector
				appointments.remove(currAppointment);
				return;
			}
		}
	}
	
	/**
	 * Find appointment with ID
	 * 
	 * @param appointmentId
	 * @return found appointment or null appointment
	 */
	public Appointment findAppointment(String appointmentId) {
		
		// Search for appointment with matching appointmentId
		for (int i = 0; i < appointments.size(); i++) {
			Appointment currAppointment = appointments.get(i);
			
			// If match found, return the current appointment
			if (currAppointment.getAppointmentId().equals(appointmentId)) {
				return currAppointment;
			}
		}
		// Otherwise, return a null appointment
		return null;
	}

}
