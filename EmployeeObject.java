package april;

import java.util.Objects;

public class EmployeeObject {
	 private int id;
	    private String name;
	    private double salary;
	    public EmployeeObject(int id,String name,double salary){
	        super();
	        this.id=id;
	        this.name=name;
	        this.salary=salary;
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
	    public void setSalary(){
	        this.salary=salary;
	    }
	    public double getSalary(){
	        return salary;
	    }
	    @Override
	    public String toString(){
	        return "Employee ID = : "+id+" Employee Name = :"+name+" Employee Salary = : "+salary;
	    }

	    public int hasCode(){
	        return Objects.hash(id,name,salary);
	    }
	    @Override
	    public boolean equals(Object obj){
	        if(this==obj)
	            return true;
	        if(obj==null)
	            return false;
	        if(getClass()!=obj.getClass())
	            return false;
	        EmployeeObject other = (EmployeeObject) obj;
	        return id == other.id && obj.equals(name) && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	    }
	    public int compareTo(EmployeeObject employee){
	        if (this.id<employee.id){
	            return -1;
	        } else if (this.id>employee.id) {
	            return 1;
	        }else {
	            return 0;
	        }
	    }
	}
