package com.example.demo.service;

import com.example.demo.entity.Route;
import java.util.List;

public interface RouteService {
    List<Route> getAllRoutes();
    Route getRouteById(Long routeId);
}