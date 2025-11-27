package com.main;

import com.carro.Carro;
import com.pessoa.PF;
import com.pessoa.PJ;

public class Main {

    public static void main(String[] args) {
        // pessoas fictícias
    	
        PF pessoaFisica = new PF("João Silva", "Rua A, 123", "123.456.789-00");
        PJ pessoaJuridica = new PJ("Empresa X", "Rua B, 456", "12.345.678/0001-99");

        // carros fictícios
        
        Carro carro1 = new Carro("Civic", "Honda", 184, 120000);
        Carro carro2 = new Carro("Fusca", "Volkswagen", 60, 20000);

        // exibindo informações
        
        System.out.println(pessoaFisica);
        System.out.println(pessoaJuridica);
        System.out.println(carro1);
        System.out.println(carro2);
    }
}
