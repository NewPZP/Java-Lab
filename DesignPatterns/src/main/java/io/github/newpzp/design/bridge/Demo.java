package io.github.newpzp.design.bridge;

import io.github.newpzp.design.bridge.devices.Device;
import io.github.newpzp.design.bridge.devices.Radio;
import io.github.newpzp.design.bridge.devices.TV;
import io.github.newpzp.design.bridge.remotes.AdvancedRemote;
import io.github.newpzp.design.bridge.remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new TV());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
