package contactService;

import java.util.Vector;

public class ContactService {
	
	// Declare vector to hold all contacts
	private Vector<Contact> contacts = new Vector<>();

	// Create new contact and add to contacts vector
	/**
	 * Create new contact and add to contacts vector
	 * 
	 * @param contactId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	public void newContact(String contactId, String firstName, String lastName, String phone, String address) {
		// Create new contact
		Contact contact = new Contact(contactId, firstName, lastName, phone, address);
		
		// Check if contact already exists with contactId
		for (int i = 0; i < contacts.size(); i++) {
			Contact currContact = contacts.get(i);
			
			// If contact matches
			if (currContact.getContactId().equals(contactId)) {
				throw new IllegalArgumentException("Invalid contact ID.");
			}
		}
		
		// Add contact to vector
		contacts.add(contact);
	}
	
	/**
	 * Delete contact from contacts vector
	 * 
	 * @param contactId - Contact to search for and remove
	 */
	public void deleteContact(String contactId) {
		
		// Search for contact with contactId
		for (int i = 0; i < contacts.size(); i++) {
			Contact currContact = contacts.get(i);
			
			// If contact found
			if (currContact.getContactId().equals(contactId)) {
				// Remove contact from vector
				contacts.remove(currContact);
				return;
			}
		}
	}
	
	/**
	 * Find a contact that exists in vector
	 * @param contentId
	 * @return
	 */
	public Contact findContact(String contactId) {
		
		// Search for contact with matching contactId
		for (int i = 0; i < contacts.size(); i++) {
			Contact currContact = contacts.get(i);
			
			// If match found, return the current contact
			if (currContact.getContactId().equals(contactId)) {
				return currContact;
			}
		}
		// Otherwise, return a null contact
		return null;
	}
	
	/**
	 * Update contact information
	 * 
	 * @param contactId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	public void updateContact(String contactId, String firstName, String lastName, String phone, String address) {
		// Search for contact that matches contactId
		for (int i = 0; i < contacts.size(); i++) {
			Contact currContact = contacts.get(i);
			
			// If match found, update firstName, lastName, phone, and address
			if (currContact.getContactId().equals(contactId)) {
				currContact.setFirstName(firstName);
				currContact.setLastName(lastName);
				currContact.setPhone(phone);
				currContact.setAddress(address);
			}
		}
	}
	
}
