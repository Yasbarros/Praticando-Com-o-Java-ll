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
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String quartos [] = new String[10];
        
        System.out.println("Digite a quantidade de quartos para aluguel: ");
        int n = sc.nextInt();
        String email [] = new String[10];
        
        for(int i=0; i<n; i++){
            System.out.printf("Nome: ");
            String nome = sc.next();
            System.out.printf("Quarto: ");
            int quarto = sc.nextInt();
            System.out.printf("Email: ");
            email [quarto] = sc.next();
            quartos[quarto] = nome;
            
        }

        for(int i=0; i<10;i++){
            
            if(quartos[i]!=null){
                System.out.println( i + ": " + quartos[i] + ", " +email[i]);
     
            }else{
                System.out.println(i + ": " + " vazio");
            }
            
        }
        
        
        
    }
    
}
