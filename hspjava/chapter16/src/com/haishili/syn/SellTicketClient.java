package com.haishili.syn;

public class SellTicketClient {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
        new Thread(sellTicket).start();
    }
}

class SellTicket implements Runnable {

    private int ticket = 50;
    private boolean loop = true;
    private synchronized void sellTicket() {
        if(ticket <= 0) {
            System.out.println("售票结束");
            loop = false;
            return;
        }
        System.out.println("Thread " + Thread.currentThread().getId() + " sell ticket " + (--ticket));
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public void run() {
        while(loop) {
            sellTicket();
        }
    }
}