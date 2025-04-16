package com.haishili.tankgame.tkg02;

import java.util.Vector;

public class Hero extends Tank {
    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }

    public void shotGun() {
        Shot shot = null;
        switch (getDirect()){
            case 0:
                shot = new Shot(getX()+20,getY(),0);
                shots.add(shot);
                if(!shot.isLive){
                    shots.remove(shot);
                }
                break;
            case 1:
                shot = new Shot(getX()+60,getY()+20,1);
                shots.add(shot);
                if(!shot.isLive){
                    shots.remove(shot);
                }
                break;
            case 2:
                shot = new Shot(getX()+20,getY()+60,2);
                shots.add(shot);
                if(!shot.isLive){
                    shots.remove(shot);
                }
                break;
            case 3:
                shot = new Shot(getX(),getY()+20,3);
                shots.add(shot);
                if(!shot.isLive){
                    shots.remove(shot);
                }
                break;
        }
        new Thread(shot).start();
    }
}
