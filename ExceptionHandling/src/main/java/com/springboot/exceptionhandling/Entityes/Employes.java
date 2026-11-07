package com.springboot.exceptionhandling.Entityes;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Employes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer employeid;
    String employename;
    String address;
    String work;

    public Integer getEmployeid() {
        return employeid;
    }

    public void setEmployeid(Integer employeid) {
        this.employeid = employeid;
    }

    public String getEmployename() {
        return employename;
    }

    public void setEmployename(String employename) {
        this.employename = employename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
