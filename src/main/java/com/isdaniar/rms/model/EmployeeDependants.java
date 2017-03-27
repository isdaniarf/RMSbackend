package com.isdaniar.rms.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Isdaniar_F on 27/03/2017.
 */

@Entity
public class EmployeeDependants {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String firstName;
    private String lastName;
    private String Gender;
    private String dependantType;
    private Date dob;
    private boolean active;

    @ManyToOne
    @JoinColumn
    private Employee dependentTo;

    public Employee getDependentTo() {
        return dependentTo;
    }

    public void setDependentTo(Employee dependentTo) {
        this.dependentTo = dependentTo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getDependantType() {
        return dependantType;
    }

    public void setDependantType(String dependantType) {
        this.dependantType = dependantType;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
