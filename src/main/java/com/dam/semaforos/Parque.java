package com.dam.semaforos;

import java.util.concurrent.Semaphore;

public class Parque {

    public static Parque parque = new Parque();
    Semaphore semaforo = new Semaphore(1);
    public static int cuenta = 0;

    public void entrar() {
        try {
            semaforo.acquire();
            cuenta++;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }

    }
}
