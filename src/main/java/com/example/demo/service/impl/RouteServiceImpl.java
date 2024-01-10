package com.example.demo.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Route;
import com.example.demo.dao.RouteDao;
import com.example.demo.service.RouteService;
import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    private final RouteDao routeDao;

    @Autowired
    public RouteServiceImpl(RouteDao routeDao) {
        this.routeDao = routeDao;
    }

    @Override
    public List<Route> getAllRoutes() {
        return routeDao.getAllRoutes();
    }

    @Override
    public Route getRouteById(Long routeId) {
        return routeDao.getRouteById(routeId);
    }
}