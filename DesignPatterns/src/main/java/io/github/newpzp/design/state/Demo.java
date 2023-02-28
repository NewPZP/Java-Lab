package io.github.newpzp.design.state;

import io.github.newpzp.design.state.ui.Player;
import io.github.newpzp.design.state.ui.UI;

public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}