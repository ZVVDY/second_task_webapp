package com.academy_it.service;

import com.academy_it.model.entity.Device;

import java.util.ArrayList;
import java.util.List;

public class DeviceService {
    public List<Device> getDevice() {
        List<Device> devices = new ArrayList<>();
        Device device1 = new Device("Tv Led", 150);
        Device device2 = new Device("Washing machine", 1500);
        Device device3 = new Device("Fridge", 180);
        Device device4 = new Device("Computer", 400);
        Device device5 = new Device("Kettle", 1800);
        Device device6 = new Device("Coffe maker", 800);
        Device device7 = new Device("Luminare Led", 200);
        devices.add(device1);
        devices.add(device2);
        devices.add(device3);
        devices.add(device4);
        devices.add(device5);
        devices.add(device6);
        devices.add(device7);
        return devices;
    }
}
