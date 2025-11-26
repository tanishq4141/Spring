package com.example.RTO.models;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    private String id;
    private String brand;
    private String model;
    private Integer year;
    private Registration registration;

    private List<ServiceRecord> serviceRecords = new ArrayList<>();

    private List<String> ownerIds = new ArrayList<>();


    public List<String> getOwnerIds() {
        return ownerIds;
    }

    public void setOwnerIds(List<String> ownerIds) {
        this.ownerIds = ownerIds;
    }

    public List<ServiceRecord> getServiceRecords() {
        return serviceRecords;
    }

    public void setServiceRecords(List<ServiceRecord> serviceRecords) {
        this.serviceRecords = serviceRecords;
    }
}
