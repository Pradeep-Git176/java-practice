package april;

public class Employee2 {
	 private int id;
	    private String name;
	    private int salary;
	    private long mobileNumber;
	    public Employee2(int id,String name,int salary,long mobileNumber){
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
	        this.mobileNumber=mobileNumber;
	    }
	    public void setId(int id){
	        this.id=id;
	    }
	    public int getId(){
	        return id;
	    }
	    public void setName(String name){
	        this.name=name;
	    } 
	    public String getName(){
	        return name;
	    }

	    public void setSalary(int salary) {
	        this.salary = salary;
	    }
	    public int getSalary(){
	        return salary;
	    }
	    public void setMobileNumber(long mobileNumber){
	        this.mobileNumber=mobileNumber;
	    }


	       
	    @Override
	            public String toString(){
	        return "Employee ["+id+" , Name = : "+name+" Salary = : "+salary+" Mobile Number = : "+mobileNumber+"]";
	        }
	}


