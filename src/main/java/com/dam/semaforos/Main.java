package com.dam.semaforos;

public class Main {
//    Considérese el caso de un parque público que dispone de tres puertas de
//    acceso. El acceso por cada una de las puertas del parque, está controlada
//    por un torno independiente, que envía un evento propio a una aplicación de
//    computador que debe contarlas y proporcionar en cualquier instante el
//    número total de visitantes que han entrado en el parque.
//    La solución concurrente inicial que se propone, se basa en las siguientes
//    ideas:
//            ■ Los eventos que genera cada torno van a ser gestionados por un
//    proceso independiente.
//            ■ Los procesos de control de los tornos se ejecutan de forma concurrente.
//            ■ En el programa existe una variable global entera “cuenta" que representa
//    el número el número de visitantes que ha entrado en el parque.
//    Cuando la actividad de los tornos ha concluido proporciona la información
//    sobre el número de visitantes que se han producido.

    public static void main(String[] args) {
        Torno t1 = new Torno(1);
        Torno t2 = new Torno(2);
        Torno t3 = new Torno(3);

        t1.start();
        t2.start();
        t3.start();
    }

}
