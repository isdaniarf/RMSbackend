package com.isdaniar.rms.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
//import java.util.UUID;


/**
 * Created by Isdaniar_F on 23/03/2017.
 */

@Entity
public class Employee {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String Id;

    private String firstName;
    private String lastName;
    private String city;
    private String address;
    private String mobileNo;
    private String grade;
    private String division;
    private String subdivision;

    @OneToMany(mappedBy = "dependentTo")
    @JsonManagedReference
    private List<EmployeeDependant> dependants;

    @OneToMany(mappedBy = "employee")
    private List<EmploymentHistory> employmentHistory;

    @OneToMany(mappedBy = "employee")
    private List<LocationHistory> locationHistory;

    @OneToMany(mappedBy = "employee")
    private List<GradeHistory> gradeHistory;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dob;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date doj;

    private String nationality;
    private String email;
    private String maritalStatus;
    private String employmentStatus;
    private String gender;
    private Date suspendDate;
    private String avatar;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getSubdivision() {
        return subdivision;
    }

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getSuspendDate() {
        return suspendDate;
    }

    public void setSuspendDate(Date suspendDate) {
        this.suspendDate = suspendDate;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<EmployeeDependant> getDependants() {
        return dependants;
    }

    public void setDependants(List<EmployeeDependant> dependants) {
        this.dependants = dependants;
    }

    public List<EmploymentHistory> getEmploymentHistory() {
        return employmentHistory;
    }

    public void setEmploymentHistory(List<EmploymentHistory> employmentHistory) {
        this.employmentHistory = employmentHistory;
    }

    public List<LocationHistory> getLocationHistory() {
        return locationHistory;
    }

    public void setLocationHistory(List<LocationHistory> locationHistory) {
        this.locationHistory = locationHistory;
    }

    public List<GradeHistory> getGradeHistory() {
        return gradeHistory;
    }

    public void setGradeHistory(List<GradeHistory> gradeHistory) {
        this.gradeHistory = gradeHistory;
    }
}
