package april;

public class Userr {
	    private int id;
	    private String name;
	    private String city;
	    private String address;
	    private String email;
	    private long phoneNo;
	    private float salary;
	    public Userr(int id,String name,String city,String address,String email,long phoneNo,float salary) {
	        super();
	        this.id=id;
	        this.name=name;
	        this.city=city;
	        this.address=address;
	        this.email=email;
	        this.phoneNo=phoneNo;
	        this.salary=salary;            
	    }
	    public void setId(int id) {
	        this.id=id;
	    }
	    public int getId() {
	        return id;
	    }
	    public void setName(String name) {
	    this.name=name;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setCity(String city) {
	        this.city=city;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setAddress(String address) {
	        this.address=address;
	    }
	    public String getAddress() {
	        return address;
	    }
	    public void setEmail(String email) {
	        this.email=email;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setPhoneNo(long phoneNo) {
	        this.phoneNo=phoneNo;
	    }
	    public long getPhoneNo() {
	        return phoneNo;
	    }
	    public void setSalary(float salary) {
	        this.salary=salary;
	    }
	    public float getSalary() {
	        return salary;
	    }
	    @Override
	    public String toString() {
	        return id+" "+name+" "+city+" "+address+" "+email+" "+phoneNo+" "+salary;
	    }
	    

	}


