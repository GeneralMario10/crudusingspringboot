package com.myfirstspringproject.crud.repository;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.myfirstspringproject.crud.Staff;
@Repository
public class StaffRepository {
    
private List<Staff> allStaff=new ArrayList<>();




public Staff getStaffByIndex(int index){
 
    return allStaff.get(index); 
}

public void addStaff(Staff staff){

    allStaff.add(staff);
}
public void updateStaff(Staff staff,int index ){

    allStaff.set(index, staff);
}
public List<Staff> getAllStaff(){
      
    return allStaff;    
}

}
