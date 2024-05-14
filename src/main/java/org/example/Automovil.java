package org.example;
//  Se requiere un programa que modele el concepto de un automóvil. Un automóvil tiene los siguientes atributos:
//	Marca: el nombre del fabricante.
//	Modelo: año de fabricación.
//  Motor: volumen en litros del cilindraje del motor de un automóvil.
//	Tipo de combustible: valor ingresado con los posibles valores de gasolina, bioetanol, diésel, biodiésel, gas natural.
//	Tipo de automóvil: valor ingresado con los posibles valores de carro de ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
//	Número de puertas: cantidad de puertas.
//  Cantidad de asientos: número de asientos disponibles que tiene el
//  vehículo. u Velocidad máxima: velocidad máxima sostenida por el vehículo en km/h.
//	Color: valor ingresado con los diferentes colores,
//  negro, rojo, naranja, amarillo, verde, azul, violeta.
//	Velocidad actual: velocidad del vehículo en un momento dado.

/*
 * *Nombre de los programadores: Dario Verdezoto
 * *Materia: Programacion 2
 * *Fecha: 09/05/2024
 * *Detalle: Automovil
 * *Version: 1
 */

// Definición de la clase Automovil
public class Automovil {
    // Atributos de la clase Automovil que van a ser ingresador por teclado
     String marca;
     int modelo;
     double motor;
     String tipoCombustible;
     String tipoAutomovil;
     int numPuertas;
     int numAsientos;
     int velocidadMaxima;
     String color;
     int velocidadActual;

     // Creamos nuestro constructor
     Automovil(){

     }
    //Creamos un contrstuctor donde inicializamos los parametro
    //de la clase automovil
    public Automovil(String marca, int modelo, double motor, String tipoCombustible,
                     String tipoAutomovil, int numPuertas, int numAsientos,
                     int velocidadMaxima, String color, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = 0;
    }

    // Métodos get y set para todos los atributos
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    //---------------Tipo de Modelo----------------
    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    //---------------Tipo de Cilindraje----------------
    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }
    //---------------Tipo de conbustible que se usa----------------
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    //---------------Tipo de automovil osea clase ----------------
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(String tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }
    //---------------Cantidad de numeros de puerta----------------
    public int getNumPuertas() {
        return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
    //---------------Cantidad de asientos en el carro ----------------
    public int getNumAsientos() {
        return numAsientos;
    }
    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    //---------------Velocidad maxima que puede llegar----------------
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    //---------------Color escojido para el automovil----------------
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //---------------Velocidad a laque se encuentra el movil----------------
    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }


    //Metodo para que acelere el auto con condicion IF
    public void setvelocidadActual(int i) {
    }
    public void acelerar(int aumento) {
        if ((velocidadActual + aumento) <= velocidadMaxima) {
            velocidadActual += aumento;
            System.out.println("La velocidad va a aumentar a  " + velocidadActual + " km/h");
        } else {
            System.out.println("No se puede acelerar mas de lo permitido");
        }
    }

    //Metodo para que desacelere el auto con condicion IF
    public void desacelerar(int reduccion) {
        if ((velocidadActual - reduccion) >= 0) {
            velocidadActual -= reduccion;
            System.out.println("La velocidad va a reducir a " + velocidadActual + " km/h");
        } else {
            System.out.println("Imposible que bajes la velocidad a -0km/h");
        }
    }

    //Metodo para que frene el auto siempre sera 0
    public void frenar() {
        velocidadActual = 0;
        System.out.println("El auto se detuvo Velocidad actual: " + velocidadActual + " km/h");
    }
    //Método imprimir donde se imprima todos los
    //valores de la clase
    public void imprimir() {
        System.out.println("----------------------------Coperativa----------------------------------");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + numPuertas);
        System.out.println("Cantidad de asientos: " + numAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("-------------------------------------------------------------------------");
    }



}
