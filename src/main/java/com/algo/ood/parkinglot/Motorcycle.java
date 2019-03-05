package com.algo.ood.parkinglot;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        spotsNeeded = 1;
        size = VehicleSize.MOTORSIZE;
    }

    public boolean canFitInSpot(ParkingSpot spot) {
        return true;
    }

}
