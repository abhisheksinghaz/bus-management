package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.BusService;
import com.example.demo.entity.Bus;
import com.example.demo.dao.BusDao;

@Service
public class BusServiceImpl implements BusService {
    private final BusDao busDao;

    @Autowired
    public BusServiceImpl(BusDao busDao) {
        this.busDao = busDao;
    }

    @Override
    public void addBus(Bus bus) {
        busDao.addBus(bus);
    }

    @Override
    public void updateBus(Bus bus) {
        busDao.updateBus(bus);
    }

    @Override
    public void deleteBus(Long busId) {
        busDao.deleteBus(busId);
    }

    @Override
    public Bus getBusById(Long busId) {
        return busDao.getBusById(busId);
    }
}