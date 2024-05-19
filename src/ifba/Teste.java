/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.err.println("Digite um numero: ");
        int n = sc.nextInt();
        double [] vetor = new double[n];
        double soma = 0;
        
        for(int i = 0; i<n; i++){
            System.err.println("Digite a altura:");
            double altura = sc.nextDouble();
            vetor[i] = altura;
            soma += altura;
        }
        
        double media = soma /n ;
        System.err.println("media" + media);
        
        sc.close();
        
    }
   
}
