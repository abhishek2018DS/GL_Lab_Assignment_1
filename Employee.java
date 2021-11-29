package lab.greatlearning.employee;

public class Employee {
	    String firstname;
	    String lastname;
	    String department;
	    
	    public Employee(final String firstname, final String lastname, final String department) {
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.department = department;
	    }
	    
	    public String getFirstName() {
	        return this.firstname;
	    }
	    
	    public void setFirstName(final String firstname) {
	        this.firstname = firstname; 

	    }
	    
	    public String getLastName() {
	        return this.lastname;
	    }
	    
	    public void setLastName(final String lastname) {
	        this.lastname = lastname;
	    }
	    
	    public String getDepartment() {
	        return this.department;
	    }
	    
	    public void setDepartment(final String department) {
	        this.department = department;
	    }
	

}
