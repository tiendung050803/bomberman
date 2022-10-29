package uet.oop.bomberman.entities;

import javafx.application.Platform;
import javafx.scene.image.Image;
import uet.oop.bomberman.Sound;
import uet.oop.bomberman.graphics.Sprite;

import java.util.List;

import static uet.oop.bomberman.BombermanGame.table;

public class SpeedItem extends Item {
    public SpeedItem(int x, int y, Image img, List<Entity> entities) {
        super(x, y, img, entities);
    }


    @Override
    public void update() {
        img = Sprite.powerup_speed.getFxImage();

        if (pickedup || died) {
            Platform.runLater(() -> {
                table[x/Sprite.SCALED_SIZE][y/Sprite.SCALED_SIZE] = null;
                entities.remove(this);
            });
        }
    }
}
