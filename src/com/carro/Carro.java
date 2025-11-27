package com.carro;

public class Carro {
    private String modelo;
    private String marca;
    private int potencia;
    private double preco;

    public Carro(String modelo, String marca, int potencia, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Modelo: " + modelo + ", Marca: " + marca + ", Potência: " + potencia + " CV, Preço: R$" + preco;
    }
}
