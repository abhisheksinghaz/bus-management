package com.example.demo.dao;

import com.example.demo.entity.Bus;

public interface BusDao {
    void addBus(Bus bus);
    void updateBus(Bus bus);
    void deleteBus(Long busId);
    Bus getBusById(Long busId);
}