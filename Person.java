/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author elkindev
 */
public class Person extends createjob {

  
    private createjob job;
    private FullTimeEmployee fultime;
    String name;        
    String address;
    String birthday;
    String Gender;
    String role;
    double salary;

   
    public Person(String name, String address,String birthday, String Gender,String role, int salary){
        this.name=name;        
        this.address=address;
        this.birthday=birthday;
        this.Gender=Gender;
        this.role=role;
        this.salary=salary;
        this.job=new createjob();
        job.setSalary(salary);
        System.out.println(this.job);
        
    }
    public long getSalary() {
        return job.getSalary();
    }

}