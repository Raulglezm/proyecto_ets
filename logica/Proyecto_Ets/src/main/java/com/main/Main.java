/**package com.main;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        String menu1 = 
        "1) Acceder como Admin\n"+
        "2) Acceder como usuario\n";
        System.out.println("Bienvenido a ShopGaming como desea acceder");
        System.out.println(menu1);

        opcion = sc.nextInt();

        //Se piden los credenciales

        System.out.print("Usuario:");
        String usuario = sc.nextLine();
        System.out.print("Contaseña:");
        String contrasenia = sc.nextLine();

        //Se intenta acceder

        switch(opcion){

            case 1:
                if ()
            break;

            case 2:

            break;
        }
        
        System.out.println("Menu");
        

    }
    
}
**/