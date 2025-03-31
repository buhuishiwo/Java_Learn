package com.haishili.tankgame.tkg02;

import java.util.Vector;

public class EnemyTank extends Tank{
    Vector<Shot> shots = new Vector<>();
    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
