package gen;

public class Person {

	    private String lastName;
	    private String firstName;
	    private String dob;
	    private String gender;
	    private int height;
	    private String address;
	    private String city;
	    private String state;
	    private String zip;
	    private String customerId;

	    // Constructor
	    public Person(String lastName, String firstName, String dob, String gender, int height, String address, String city, String state, String zip, String customerId) {
	        this.lastName = lastName.toUpperCase();
	        this.firstName = firstName.toUpperCase();
	        this.dob = dob;
	        this.gender = gender.toUpperCase();
	        this.height = height;
	        this.address = address.toUpperCase();
	        this.city = city.toUpperCase();
	        this.state = state.toUpperCase();
	        this.zip = zip;
	        this.customerId = customerId.toUpperCase();
	    }

	    // Getters
	    public String getLastName() { return lastName; }
	    public String getFirstName() { return firstName; }
	    public String getDob() { return dob; }
	    public String getGender() { return gender; }
	    public int getHeight() { return height; }
	    public String getAddress() { return address; }
	    public String getCity() { return city; }
	    public String getState() { return state; }
	    public String getZip() { return zip; }
	    public String getCustomerId() { return customerId; }
	
}
