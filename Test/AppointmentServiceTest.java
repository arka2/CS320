package test;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import appointmentService.Appointment;
import appointmentService.AppointmentService;

class AppointmentServiceTest {

	@Test
	void testNewAppointmentService() {
		AppointmentService appointmentService= new AppointmentService();
		LocalDate appointmentDate = LocalDate.of(2025, 4, 6);
		appointmentService.newAppointment("1", appointmentDate, "Annual physical");
		Appointment appointment = appointmentService.findAppointment("1");
		assertNotNull(appointment);
	}
	
	@Test
	void testRemoveAppointment() {
		AppointmentService appointmentService= new AppointmentService();
		LocalDate appointmentDate = LocalDate.of(2025, 4, 6);
		appointmentService.newAppointment("1", appointmentDate, "Annual physical");
		appointmentService.deleteAppointment("1");
		assertNull(appointmentService.findAppointment("1"));
	}
	
	@Test
	void testTaskDuplicatedAppointmentId() {
		AppointmentService appointmentService= new AppointmentService();
		LocalDate appointmentDate = LocalDate.of(2025, 4, 6);
		appointmentService.newAppointment("1", appointmentDate, "Annual physical");
	    assertThrows(IllegalArgumentException.class,
            ()->{
            	appointmentService.newAppointment("1", appointmentDate, "Annual physical");
            });
	}

}
