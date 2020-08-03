
import java.util.Random; 

public class createjob {
    private String role;
    private long salary;
    private String name;
    private int id;
        
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public void setId() {
          // create instance of Random class 
        Random rand = new Random(); 
  
        // Generate random integers in range 0 to 999 
        this.id = rand.nextInt(1000); ;
    }
    
    
}