package io.github.newpzp.design.builder.builders;

import io.github.newpzp.design.builder.cars.CarType;
import io.github.newpzp.design.builder.components.Engine;
import io.github.newpzp.design.builder.components.GPSNavigator;
import io.github.newpzp.design.builder.components.Transmission;
import io.github.newpzp.design.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
