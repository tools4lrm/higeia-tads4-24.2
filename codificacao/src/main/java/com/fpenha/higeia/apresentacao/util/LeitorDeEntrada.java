package com.fpenha.higeia.apresentacao.util;

import java.util.Scanner;

public class LeitorDeEntrada {
    private Scanner scanner;

    public LeitorDeEntrada() {
        this.scanner = new Scanner(System.in);
    }

    public int leiaInt(String solicitacao) {
    	
    	System.out.print(solicitacao);
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada Inválida. Por favor, entre com um inteiro: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    public int leiaInt() {
        return leiaInt("Entre com um número inteiro: ");
    }

    public double leiaDouble(String solicitacao) {
        System.out.print(solicitacao);
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Por favor, entre com valor do tipo Double (Real): ");
            scanner.next();
        }
        return scanner.nextDouble();
    }
    
    public double leiaDouble() {
        return leiaDouble("Entre com valor do tipo Double (Real): ");
    }


    public String leiaString(String solicitacao) {
        System.out.print(solicitacao);
        return scanner.next();
    }
    
    public String leiaString() {
    	return leiaString("Entre com valor tipo String (Texto): ");
    }

    public void apresente(String texto) {
    	System.out.print(texto);
    }
    
    public void close() {
        scanner.close();
    }
}
