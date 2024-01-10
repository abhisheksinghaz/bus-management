package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Bus;
import com.example.demo.service.BusService;

@RestController
@RequestMapping("/api/bus")
public class BusController {
    private final BusService busService;

    @Autowired
    public BusController(BusService busService) {
        this.busService = busService;
    }

    @PostMapping("/add")
    public ResponseEntity<String> addBus(@RequestBody Bus bus) {
        busService.addBus(bus);
        return ResponseEntity.ok("Bus added successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateBus(@RequestBody Bus bus) {
        busService.updateBus(bus);
        return ResponseEntity.ok("Bus updated successfully");
    }

    @DeleteMapping("/delete/{busId}")
    public ResponseEntity<String> deleteBus(@PathVariable Long busId) {
        busService.deleteBus(busId);
        return ResponseEntity.ok("Bus deleted successfully");
    }

    @GetMapping("/{busId}")
    public ResponseEntity<Bus> getBusById(@PathVariable Long busId) {
        Bus bus = busService.getBusById(busId);
        return ResponseEntity.ok(bus);
    }
}