package com.myfirstspringproject.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.myfirstspringproject.crud.Constants;
import com.myfirstspringproject.crud.Staff;
import com.myfirstspringproject.crud.repository.StaffRepository;
@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository ;

    public Staff getStaffByIndex(int index) {

        return staffRepository.getStaffByIndex(index);
    }

    public Staff getStaffById(String id) {
        int index = getStaffIndex(id);
        return index == Constants.NO_MATCH ? new Staff() : getStaffByIndex(index);

    }

    public void addStaff(Staff staff) {

        staffRepository.addStaff(staff);
        
    }

    public void updateStaff(Staff staff, int index) {

        staffRepository.updateStaff(staff, index);
    }

    public List<Staff> getAllStaff() {
        return staffRepository.getAllStaff();
    }

    public int getStaffIndex(String id) {
        for (int i = 0; i < getAllStaff().size(); i++) {
            if (getStaffByIndex(i).getId().equals(id))
                return i;
        }
        return Constants.NO_MATCH;
    }

    public void submitStaff(Staff staff) {
        int index = getStaffIndex(staff.getId());
        if (index == Constants.NO_MATCH) {
            addStaff(staff);
        } else {
            updateStaff(staff, index);
        }

    }

}
