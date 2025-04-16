package com.haishili.tankgame.tkg02;

/**
 * @author haishili
 * @date 2025/4/16
 */
public class Boom {
    private int x;
    private int y;
    int life = 9;
    boolean isLive = true;

    public Boom(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void lifeDown() {
        if(isLive){
            if(life > 0) {
                life--;
            }
            else {
                isLive = false;
            }
        }
    }
}
