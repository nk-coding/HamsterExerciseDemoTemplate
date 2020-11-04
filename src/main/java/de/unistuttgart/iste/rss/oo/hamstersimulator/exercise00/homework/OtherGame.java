package de.unistuttgart.iste.rss.oo.hamstersimulator.exercise00.homework;

import de.unistuttgart.iste.rss.oo.hamstersimulator.external.model.SimpleHamsterGame;

public class OtherGame extends SimpleHamsterGame {

    @Override
    protected void run() {
        this.loadTerritoryFromResourceFile("/territories/territoryExample00.ter");
        this.displayInNewGameWindow();
        game.startGame();

        for (int i = 0; i < 10; i++) {
            paule.turnLeft();
        }
    }
    
}
