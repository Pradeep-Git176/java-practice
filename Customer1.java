package april;

public class Customer1 {
	 private String name;
	    
	    private String city;
	    
	    private Integer age;

	    public Customer1(String name, String city, Integer age) {
	        super();
	        this.name = name;
	        this.city = city;
	        this.age = age;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;
	    }

	    public Integer getAge() {
	        return age;
	    }

	    public void setAge(Integer age) {
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Customer [name=" + name + ", city=" + city + ", age=" + age + "]";
	    }

	}

