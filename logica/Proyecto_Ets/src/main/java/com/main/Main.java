package com.main;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import com.controller.Controller;
import com.mycompany.proyecto_ets.Tienda;

public class Main {

    public static void main(String[] args) {

        Controller cn = new Controller();

        Scanner sc = new Scanner(System.in);

        int opcion;

        String menu1 = "1) Acceder como Admin\n" +
                "2) Acceder como usuario\n" +
                "3) Acceder como invitado\n";
        System.out.println("Bienvenido a ShopGaming como desea acceder");
        System.out.println(menu1);

        opcion = sc.nextInt();sc.nextLine();

        // Se piden los credenciales
        String usuario = "";
        String contrasenia = "";
        if (opcion == 1 || opcion == 2) {
            System.out.println("Usuario:");
            usuario = sc.nextLine();
            System.out.print("Contaseña:");
            contrasenia = sc.nextLine();
        }

        // Se intenta acceder

        String interfaz = "usuario";

        do {
            switch (opcion) {
                case 1:
                    if (cn.comprobarAdmin(usuario, contrasenia)) {
                        System.out.println("Bienvenido ADMIN");
                        interfaz = "admin";
                        opcion = 3;
                    }
                    break;

                case 2:
                    if (cn.comprobarCliente(usuario, contrasenia)) {
                        System.out.println("Bienvenid@" + usuario);
                        opcion = 3;
                    } else {
                        System.out.println("Credenciales incorrectos");
                        opcion = 4;
                    }
                    break;

                case 4:

                    System.out.println("Pulse cualquier tecla si desea acceder como invitado");
                    System.out.println("Pulse 2 si desea volver a iniciar sesion \n");

                    opcion = sc.nextInt();
                    if (opcion == 2) {
                        System.out.print("Usuario:");
                        usuario = sc.nextLine();
                        System.out.print("Contaseña:");
                        contrasenia = sc.nextLine();
                    } else {
                        opcion = 3;
                    }
                    break;
            }

        } while (opcion != 3);
    }




}
