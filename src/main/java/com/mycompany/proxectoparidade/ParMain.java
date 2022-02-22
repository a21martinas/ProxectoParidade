/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proxectoparidade;

import java.util.Scanner;

/**
 *
 * @author A21MARTINAS
 */
public class ParMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("introduce un número");
        int numeroProba=in.nextInt();
        if (numeroProba%2==0){
            System.out.println("o número é par");
        }else{
            System.out.println("o número é impar");
        }
    }
    
}
