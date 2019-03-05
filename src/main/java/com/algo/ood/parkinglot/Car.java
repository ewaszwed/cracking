package com.algo.ood.parkinglot;

public class Car extends Vehicle {

    public Car() {
        spotsNeeded = 1;
        size = VehicleSize.COMPACT;
    }

    @Override
    public boolean canFitInSpot(ParkingSpot spot) {
        return spot.getSize() == VehicleSize.LARGE || spot.getSize() == VehicleSize.COMPACT;
    }

}
