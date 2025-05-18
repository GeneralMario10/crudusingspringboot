package com.myfirstspringproject.crud;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Staff {
@NotNull(message = "This Salary can't be empty") 
@Positive(message = "this salary can't be zero")   
private double salary;
@NotBlank(message = "This Staff name can't be empty")
private String staffName;
@NotBlank(message = "This title can't be empty")
private String staffTitle;
private String id;
    public Staff(){
            this.id=UUID.randomUUID().toString();
    }
    public Staff(double salary, String staffName, String staffTitle) {
        this.salary = salary;
        this.staffName = staffName;
        this.staffTitle = staffTitle;
        
    }
   public void setId(String id){
    this.id=id;
   }
   public String getId(){
    return id;
   }
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTitle() {
        return this.staffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle;
    }
    

}
