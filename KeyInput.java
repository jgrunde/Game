package com.grunde.game;

import org.jetbrains.annotations.NotNull;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    public void keyPressed(@NotNull KeyEvent e) {
        int key = e.getKeyCode();

        //System.out.println(key);

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) tempObject.setVelY(-2);
                if (key == KeyEvent.VK_S) tempObject.setVelY(2);
                if (key == KeyEvent.VK_D) tempObject.setVelX(2);
                if (key == KeyEvent.VK_A) tempObject.setVelX(-2);
            }

            if (tempObject.getId() == ID.Player2) {
                if (key == KeyEvent.VK_UP) tempObject.setVelY(-2);
                if (key == KeyEvent.VK_DOWN) tempObject.setVelY(2);
                if (key == KeyEvent.VK_RIGHT) tempObject.setVelX(2);
                if (key == KeyEvent.VK_LEFT) tempObject.setVelX(-2);
            }
        }
    }

    public void keyReleased(@NotNull KeyEvent e) {
        int key = e.getKeyCode();

        for (int i = 0; i < handler.object.size(); i++) {
            GameObject tempObject = handler.object.get(i);

            if (tempObject.getId() == ID.Player) {
                if (key == KeyEvent.VK_W) tempObject.setVelY(0);
                if (key == KeyEvent.VK_S) tempObject.setVelY(0);
                if (key == KeyEvent.VK_D) tempObject.setVelX(0);
                if (key == KeyEvent.VK_A) tempObject.setVelX(0);
            }

            if (tempObject.getId() == ID.Player2) {
                if (key == KeyEvent.VK_UP) tempObject.setVelY(0);
                if (key == KeyEvent.VK_DOWN) tempObject.setVelY(0);
                if (key == KeyEvent.VK_RIGHT) tempObject.setVelX(0);
                if (key == KeyEvent.VK_LEFT) tempObject.setVelX(0);
            }
        }
    }
}
