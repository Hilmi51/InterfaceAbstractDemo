public class Customer implements Entity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String nationaltityİd;
	
	
	public Customer(int id, String firstName, String lastName, String dateOfBirth, String nationaltityİd) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationaltityİd = nationaltityİd;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationaltityİd() {
		return nationaltityİd;
	}
	
	public void setNationaltityİd(String nationaltityİd) {
		this.nationaltityİd = nationaltityİd;
	}
	
}
