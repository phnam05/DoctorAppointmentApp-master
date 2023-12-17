package com.example.badapp;
import java.io.Serializable;


import com.google.firebase.firestore.PropertyName;

public class Doctor implements Serializable {

    private String fullName;
    private String email;
    private String gender;
    private String location;
    private String phone;
    private String role;
    private String specialty;
    private int experienceYears;
    private int patientCount;
    private String id; // The doctor's user ID from Firestore
    private boolean isSelected; // This is for UI state, not a Firestore field

    // No-arg constructor for Firestore
    public Doctor() {
        // Firestore deserialization
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @PropertyName("FullName")
    public String getFullName() {
        return fullName;
    }

    @PropertyName("FullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @PropertyName("Email")
    public String getEmail() {
        return email;
    }

    @PropertyName("Email")
    public void setEmail(String email) {
        this.email = email;
    }

    @PropertyName("Gender")
    public String getGender() {
        return gender;
    }

    @PropertyName("Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @PropertyName("Location")
    public String getLocation() {
        return location;
    }

    @PropertyName("Location")
    public void setLocation(String location) {
        this.location = location;
    }

    @PropertyName("Phone")
    public String getPhone() {
        return phone;
    }

    @PropertyName("Phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @PropertyName("Role")
    public String getRole() {
        return role;
    }

    @PropertyName("Role")
    public void setRole(String role) {
        this.role = role;
    }

    @PropertyName("Specialty")
    public String getSpecialty() {
        return specialty;
    }

    @PropertyName("Specialty")
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    @PropertyName("Experienceyears")
    public int getExperienceYears() {
        return experienceYears;
    }

    @PropertyName("Experienceyears")
    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @PropertyName("PatientCount")
    public int getPatientCount() {
        return patientCount;
    }

    @PropertyName("PatientCount")
    public void setPatientCount(int patientCount) {
        this.patientCount = patientCount;
    }

    // This field is for UI state management and does not correspond to a Firestore field.
    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }
}
