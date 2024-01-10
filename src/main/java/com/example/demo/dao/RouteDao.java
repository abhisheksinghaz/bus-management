package com.example.demo.dao;

import com.example.demo.entity.Route;
import java.util.List;

public interface RouteDao {
    List<Route> getAllRoutes();
    Route getRouteById(Long routeId);
}
