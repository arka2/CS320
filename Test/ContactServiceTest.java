package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import contactService.Contact;
import contactService.ContactService;

class ContactServiceTest {

	@Test
	void testNewContactService() {
		ContactService contactService = new ContactService();
		contactService.newContact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
		Contact contact = contactService.findContact("1");
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("Arka"));
		assertTrue(contact.getLastName().equals("Tu"));
		assertTrue(contact.getPhone().equals("6037175489"));
		assertTrue(contact.getAddress().equals("11 Whittier Drive, Bow, NH"));
		assertNotNull(contact);
	}
	
	@Test
	void testRemoveContact() {
		ContactService contactService = new ContactService();
		contactService.newContact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
		contactService.deleteContact("1");
		assertNull(contactService.findContact("1"));
	}
	
	@Test
	void testUpdateContact () {
		ContactService contactService = new ContactService();
		contactService.newContact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
		contactService.updateContact("1", "Neal", "Layson", "4023458907", "4 Whittier Drive, Bow, NH");
		Contact contact = contactService.findContact("1");
		assertTrue(contact.getContactId().equals("1"));
		assertTrue(contact.getFirstName().equals("Neal"));
		assertTrue(contact.getLastName().equals("Layson"));
		assertTrue(contact.getPhone().equals("4023458907"));
		assertTrue(contact.getAddress().equals("4 Whittier Drive, Bow, NH"));
		assertNotNull(contact);
	}
	
	@Test
	void testContactDuplicatedContactId() {
		ContactService contactService = new ContactService();
		contactService.newContact("1", "Arka", "Tu", "6037175489", "11 Whittier Drive, Bow, NH");
	    assertThrows(IllegalArgumentException.class,
            ()->{
            contactService.newContact("1", "Neal", "Layson", "4023458907", "4 Whittier Drive, Bow, NH");
            });
	}

}
