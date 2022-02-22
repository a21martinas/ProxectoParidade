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
        int numeroProba=lerNumero(in);
        System.out.println(comprobarParidade(numeroProba));
    }

    static String comprobarParidade(int numeroProba) {
        String resultado;
        if (numeroProba%2==0){
            resultado=(O_NUMERO_E_PAR);
        }else{
            resultado=(O_NUMERO_E_IMPAR);
        }
        return resultado;
    }
    private static final String O_NUMERO_E_IMPAR = "o numero e impar";
    private static final String O_NUMERO_E_PAR = "o numero e par";

    private static int lerNumero(Scanner in) {
        System.out.println("introduce un numero");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
    
}
