package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita que se ingresen datos al usuario de su coche

        System.out.println("Ingrese la marca del automóvil: ");
        String marca = scanner.nextLine();

        System.out.println("Ingrese el modelo del automóvil: ");
        int modelo = scanner.nextInt();

        System.out.println("Ingrese el volumen del motor (en litros): ");
        double motor = scanner.nextDouble();

        System.out.println("Ingrese el tipo de combustible: ");
        scanner.nextLine();
        String tipoCombustible = scanner.nextLine();

        System.out.println("Ingrese el tipo de automóvil: ");
        String tipoAutomovil = scanner.nextLine();

        System.out.println("Ingrese el número de puertas: ");
        int numPuertas = scanner.nextInt();

        System.out.println("Ingrese la cantidad de asientos: ");
        int numAsientos = scanner.nextInt();

        System.out.println("Ingrese la velocidad máxima: ");
        int velocidadMaxima = scanner.nextInt();


        System.out.println("Ingrese el color del automóvil: ");
        scanner.nextLine() ;
        String color = scanner.nextLine();

        System.out.println("Ingrese su velocidad Actual: ");
        int velocidadActual = scanner.nextInt();


//-----------------------------FIN--------------------------------------------------------


        // Creamos el objeto "Automovil" con los datos previamente ingresados por el usuario
         Automovil automovil = new Automovil(marca, modelo, motor, tipoCombustible,
                tipoAutomovil, numPuertas, numAsientos, velocidadMaxima, color,velocidadActual);

        // Establecer velocidad inicial
        automovil.setVelocidadActual(velocidadActual);
        // El auta acelerara empezando desde la velocidad actual20 km/h
        automovil.acelerar(20);
        // Desacelerar en 50 km/h
        automovil.desacelerar(50);
        // Frenar el automóvil
        automovil.frenar();
        //Imprimira el objeto 
        automovil.imprimir();
    }
}