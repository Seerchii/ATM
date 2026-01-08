package com.example;

public class Cuenta {

    //Atributos
    private String numero;
    private double saldo;
    private String titular;
    private double interesAnual;

    public Cuenta() {
        System.out.println("Creando cuenta...");
    }
    public Cuenta(String numero, double saldo, String titular, double interesAnual){
        this.numero=numero;
        this.saldo=saldo;
        this.titular=titular;
        this.interesAnual=interesAnual;
    }
    public String getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public double getInteresAnual() {
        return interesAnual;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    
     public void calculaInteresAnual() {
        double interes = saldo * (interesAnual / 100.0);
        saldo += interes;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual de la cuenta " + numero + ": " + saldo + " €");
    }
}

    


