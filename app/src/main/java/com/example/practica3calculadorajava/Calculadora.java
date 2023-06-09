package com.example.practica3calculadorajava;


public class Calculadora {
    // Declaración de las variables
    protected float num1;
    protected float num2;

    // Constructor para inicializar las variables
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Suma
    public float suma() {
        return num1 + num2;
    }

    // Resta
    public float resta() {
        return num1 - num2;
    }

    // Multiplicación
    public float multiplicacion() {
        return num1 * num2;
    }

    // División
    public float division() {
        float total = 0;
        if(num2 != 0) {
            total = num1 / num2;
        }
        return total;
    }

}
