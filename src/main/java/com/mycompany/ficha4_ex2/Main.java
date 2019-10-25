/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha4_ex2;

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
        int escolha = 0;

        switch (escolha) {
            case 0: //teste de adicionar 1 elementos
                lista.enqueue(1);
                System.out.println(lista.toString());
                break;
            case 1: //teste de adicionar n elementos
                lista.enqueue(1);
                lista.enqueue(2);
                lista.enqueue(3);

                System.out.println(lista.toString());
                break;
        }

    }
}
