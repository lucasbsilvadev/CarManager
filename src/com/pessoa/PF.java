package com.pessoa;

public class PF extends Pessoa {
    private String cpf;

    public PF(String nome, String endereco, String cpf) {
        super(nome, endereco);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return super.toString() + ", CPF: " + cpf;
    }
}
