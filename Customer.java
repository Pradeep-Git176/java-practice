package april;

public class Customer {
	 int customerId;
	    String name;
	    String address;
	    int salary;
	    String email;
	    long phoneNumber;
	    public Customer(int customerId, String name, String address, int salary, String email, long phoneNumber) {
	        super();
	        this.customerId = customerId;
	        this.name = name;
	        this.address = address;
	        this.salary = salary;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	    }
	    @Override
	    public String toString() {
	        return "customerId=" + customerId + ", name=" + name + ", address=" + address + ", salary=" + salary
	                + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
	    }
	    
	    
	  }
