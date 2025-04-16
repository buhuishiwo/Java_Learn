package com.haishili.tankgame.tkg02;

public class Shot implements Runnable {
    private int x;
    private int y;
    private int speed = 2;
    private int direction;
    boolean isLive = true;

    public Shot(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            switch (direction) {
                case 0:
                    //向上
                    y -= speed;
                    break;
                    case 1:
                        //向右
                        x += speed;
                        break;
                        case 2:
                            //向下
                            y += speed;
                            break;
                            case 3:
                                //向左
                                x -= speed;
                                break;
            }
            if(!(x>=0 && x<=1000 && y>=0 && y<=750 && isLive)){
                isLive = false;
                break;
            }
        }
    }
}
