package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contactService.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact contact = new Contact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("Arka"));
		assertTrue(contact.getLastName().equals("Tu"));
		assertTrue(contact.getPhone().equals("6037175489"));
		assertTrue(contact.getAddress().equals("11 Whittier Drive, Bow, NH"));
		assertNotNull(contact);
	}
	
	@Test
	void testContactIdNull() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact(null, "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactFirstNameTooLong() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Alexandra-Leia", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactFirstNameNull() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", null, "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactLastNameTooLong() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Johnson-Johnson", "6037175489", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactLastNameNull() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", null, "6037175489", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactPhoneTooLong() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Johnson-Johnson", "60371754891", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactPhoneTooShort() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Johnson-Johnson", "603717548", "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactPhoneNull() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Tu", null, "11 Whittier Drive, Bow, NH");
	        });
	}
	
	@Test
	void testContactAddressTooLong() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH, United States of America");
	        });
	}
	
	@Test
	void testContactAddressNull() {
	    assertThrows(IllegalArgumentException.class,
	        ()->{
	        Contact contact = new Contact("1", "Arka", "Tu", "6037175489", null);
	        });
	}
	
	@Test
	void ContactPhoneNotDigits() {
	    assertThrows(IllegalArgumentException.class,
		        ()->{
		        Contact contact = new Contact("1", "Arka", "Johnson-Johnson", "iterations", "11 Whittier Drive, Bow, NH");
		        });
	}


}
