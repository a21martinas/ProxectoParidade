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
        Scanner entrada=new Scanner(System.in);
        int numeroProba=lerNumero(entrada);
        System.out.println(comprobarParidade(numeroProba));
    }

    static String comprobarParidade(int numeroProba) {
        String expResult;
        if (verificaPar(numeroProba)){
            expResult=(O_NUMERO_E_PAR);
        }else{
            expResult=(O_NUMERO_E_IMPAR);
        }
        return expResult;
    }

    static boolean verificaPar(int numeroProba) {
        return numeroProba%2==0;
    }
    private static final String O_NUMERO_E_IMPAR = "o numero e impar";
    private static final String O_NUMERO_E_PAR = "o numero e par";

    private static int lerNumero(Scanner in) {
        System.out.println("introduce un numero");
        int numeroProba=in.nextInt();
        return numeroProba;
    }
    
}
