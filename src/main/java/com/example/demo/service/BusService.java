package com.example.demo.service;

import com.example.demo.entity.Bus;

public interface BusService {
    void addBus(Bus bus);
    void updateBus(Bus bus);
    void deleteBus(Long busId);
    Bus getBusById(Long busId);
}