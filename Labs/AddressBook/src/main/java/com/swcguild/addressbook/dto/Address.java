/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swcguild.addressbook.dto;

import java.util.Objects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author apprentice
 */
public class Address {
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message=" must be under 50 characters")
    private String firstName;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message=" must be under 50 characters")
    private String lastName;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message=" must be under 50 characters")
    private String city;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message=" must be under 50 characters")
    private String street;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=50,message=" must be under 50 characters")
    private String zipCode;
    @NotEmpty(message="you must supply a value for the title.")
    @Length(max=3,message=" must be under 3 characters")
    private String state;
    private int id=-1;

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

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.firstName);
        hash = 37 * hash + Objects.hashCode(this.lastName);
        hash = 37 * hash + Objects.hashCode(this.city);
        hash = 37 * hash + Objects.hashCode(this.street);
        hash = 37 * hash + Objects.hashCode(this.zipCode);
        hash = 37 * hash + Objects.hashCode(this.state);
        hash = 37 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Address other = (Address) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.city, other.city)) {
            return false;
        }
        if (!Objects.equals(this.street, other.street)) {
            return false;
        }
        if (!Objects.equals(this.zipCode, other.zipCode)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

   
   
    
}
