package contactService;

public class Contact {
	
	private String contactId;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	/**
	 * Constructor
	 * 
	 * @param contactId
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 */
	public Contact(String contactId, String firstName, String lastName, String phone, String address) {

		this.setContactId(contactId);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}
	
	/**
	 * Get contactId
	 * 
	 * @return contact's unique ID
	 */
	public String getContactId() {
		return this.contactId;
	}
	
	// 
	/**
	 * Set contactId
	 * 
	 * @param contactId - ID to set
	 */
	private void setContactId(String contactId) {
		// Check if contactId is null and greater than 10 chars
		if ((contactId == null) || (contactId.length() > 10)) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		// Set contactId
		this.contactId = contactId;
	}
	
	/**
	 * Get firstName
	 * 
	 * @return contact's first name
	 */
	public String getFirstName() {
		return this.firstName;
	}
	
	/**
	 * Set firstName
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		// Check if firstName is null and greater than 10 chars
		if ((firstName == null) || (firstName.length() > 10)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		// Set firstName
		this.firstName = firstName;
	}
	
	/**
	 * Get lastName
	 * 
	 * @return contacts last name
	 */
	public String getLastName() {
		return this.lastName;
	}
	
	/**
	 * Set lastName
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		// Check if lastName is null and greater than 10 chars
		if ((lastName == null) || (lastName.length() > 10)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		// Set lastName
		this.lastName = lastName;
	}
	
	/**
	 * Get phone number
	 * 
	 * @return contact's phone number
	 */
	public String getPhone() {
		return this.phone;
	}
	
	/**
	 * Set phone number
	 * 
	 * @param phone
	 */
	public void setPhone(String phone) {
		// Check if phone is null, is exactly 10 chars, and only uses digits
		if ((phone == null) || (phone.length() != 10) || (phone.matches("[0-9]+") == false)) {
			throw new IllegalArgumentException("Invalid phone");
		}
		// Set phone
		this.phone = phone;
	}
	
	/**
	 * Get address
	 * 
	 * @return contact's address
	 */
	public String getAddress() {
		return this.address;
	}
	
	/**
	 * Set address
	 * 
	 * @param address
	 */
	public void setAddress(String address) {
		// Check if address is null and greater than 30 chars
		if ((address == null) || (address.length() > 30)) {
			throw new IllegalArgumentException("Invalid address");
		}
		// Set address
		this.address = address;
	}

}
