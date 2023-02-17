package io.github.newpzp.design.builder.builders;

import io.github.newpzp.design.builder.cars.Car;
import io.github.newpzp.design.builder.cars.CarType;
import io.github.newpzp.design.builder.components.Engine;
import io.github.newpzp.design.builder.components.GPSNavigator;
import io.github.newpzp.design.builder.components.Transmission;
import io.github.newpzp.design.builder.components.TripComputer;

public class CarBuilder implements Builder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
