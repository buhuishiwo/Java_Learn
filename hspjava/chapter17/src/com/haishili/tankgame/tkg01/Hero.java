package com.haishili.tankgame.tkg01;

public class Hero extends Tank {
    Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }

    public void ShotGun() {
        switch (getDirect()){
            case 0:
                shot = new Shot(getX()+20,getY(),0);
                break;
            case 1:
                shot = new Shot(getX()+60,getY()+20,1);
                break;
            case 2:
                shot = new Shot(getX()+20,getY()+60,2);
                break;
            case 3:
                shot = new Shot(getX(),getY()+20,3);
                break;
        }
        new Thread(shot).start();
    }
}
