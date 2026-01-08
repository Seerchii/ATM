package com.example;

public class ATM {
    public static void main(String[] args) {
        Cuenta c1 = new Cuenta();
        c1.setNumero("ES 2100 5435 8754 6478");
        c1.setSaldo(1000);
        c1.setTitular("Titular 1");
        c1.setInteresAnual(1.5);

        Cuenta c2 = new Cuenta(
            "ES 2100 3434 4456 6478",
            100,
            "Titular 2",
            1.5
        );

        Cuenta c3 = new Cuenta();
        c3.setNumero("ES 2100 9999 8888 7777");
        c3.setSaldo(500);
        c3.setTitular("Titular 3");
        c3.setInteresAnual(2.0);

        Cuenta c = new Cuenta();
        c.setNumero("ES1234567890");
        c.setTitular("Joan Garcia");
        c.setSaldo(5000.0);
        c.setInteresAnual(1.5);

        c.ingresar(250.0);
        c.retirar(100.0);
        c.calculaInteresAnual();
        c.mostrarSaldo(); 
    }

}