package com.dam.semaforos;

public class Torno extends Thread {

        private int id;

        public Torno(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                Parque.parque.entrar();
                System.out.println("En el Torno " + id + " ha entrado una persona. Total: " + Parque.cuenta);

                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }


}
