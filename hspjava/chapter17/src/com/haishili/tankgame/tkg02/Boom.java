package com.haishili.tankgame.tkg02;

/**
 * @author haishili
 * @date 2025/4/16
 * 坦克爆炸类
 * 用于坦克受击爆炸时图片得一些属性
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

    /**
     * 坦克爆炸生命周期减少
     */
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
