/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba;
import RevisãoPoo.Estudante;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class PooExer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Estudante [] quartos  = new Estudante[10];
        
        System.out.println("Quantas pessoas? ");
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Nome: ");
            String nome = sc.next();
            System.out.printf("Email: ");
            String email = sc.next();
            System.out.printf("Quarto: ");
            int quarto = sc.nextInt();
            
            quartos[quarto] = new Estudante(nome, email);
        }
        
        for(int i = 0; i < 10; i++){
            if(quartos[i]!=null){
                System.out.println( i + ": " + quartos[i]);
     
            }
        }
        
        
    }
}
