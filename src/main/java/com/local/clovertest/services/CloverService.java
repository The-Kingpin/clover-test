package com.local.clovertest.services;

public class CloverService {
    private final String serviceName;

    public CloverService(String serviceName){
        this.serviceName = serviceName;
    }

    public String getServiceName() {
        return serviceName;
    }
}
