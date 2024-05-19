/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atv2q1;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author User
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vector<PessoaIMC> pessoas = new Vector<>();

        System.out.print("Número de pessoas: ");
        int numPessoas = scanner.nextInt();

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Tipo de pessoa (Homem ou Mulher): ");
            String tipoPessoa = scanner.next();

            System.out.print("Nome: ");
            String nome = scanner.next();

            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.next();

            System.out.print("Peso: ");
            double peso = scanner.nextDouble();

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            PessoaIMC pessoa;
            if (tipoPessoa.equalsIgnoreCase("Homem")) {
                pessoa = new Homem(nome, dataNascimento, peso, altura);
            } else if (tipoPessoa.equalsIgnoreCase("Mulher")) {
                pessoa = new Mulher(nome, dataNascimento, peso, altura);
            } else {
                System.out.println("Tipo de pessoa inválido. Tente novamente.");
                i--; // decrementa o índice para repetir a entrada para essa pessoa
                continue;
            }

            pessoas.add(pessoa);
        }

        for (PessoaIMC pessoa : pessoas) {
            System.out.println("\n" + pessoa + "\nResultado IMC: " + pessoa.resultIMC());
        }

        scanner.close();
    }
    
}
