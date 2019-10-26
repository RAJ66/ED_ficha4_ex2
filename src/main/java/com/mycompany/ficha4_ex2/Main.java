/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha4_ex2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CircularArrayQueue lista = new CircularArrayQueue();

        int numeroTeste = 9;

        switch (numeroTeste) {
            case 0: //teste adicionar 1 elemento
                lista.enqueue(1);
                System.out.println(lista.toString());
                break;
            case 1:
                //teste encher lista
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);
                System.out.println(lista.toString());
                break;
            case 2:

                try {
                    //testar remover lista vazia
                    lista.dequeue();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
            case 3:
                try {
                    //testar remover elementos da lista
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.dequeue();
                    lista.dequeue();
                    lista.enqueue(4);
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;

            case 4://teste se esta vazio e esta
                System.out.println(lista.isEmpty());
                System.out.println(lista.toString());
                break;
            case 5://teste se esta vazio e nao esta
                lista.enqueue(1);
                System.out.println(lista.isEmpty());
                System.out.println(lista.toString());
                break;
            case 6:
                try {
                    //testar do fist sem ter nada
                    System.out.println(lista.first());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;

            case 7:
                try {
                    //testar do fist a ter elemtentos la dentro
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);

                    System.out.println(lista.first());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;

            case 8:
                try {
                    //testar1 expandCapacity
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);

                    System.out.println(lista.first());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;

            case 9:
                try {
                    //testar2 expandCapacity
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.enqueue(4);
                    lista.dequeue();
                                        lista.enqueue(1);


                    System.out.println(lista.first());
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());
                break;
        }
    }
}
