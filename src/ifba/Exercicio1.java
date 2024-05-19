
package ifba;

import java.util.Scanner;



public class Exercicio1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro:");
        int n = sc.nextInt();
        
    
        String nomes [] = new String [n];
        
        int total = 0;
        double soma = 0.0;
        
        for(int i=0; i<n;i++){
            String nome = sc.next();
            double altura = sc.nextDouble();
            int idade = sc.nextInt();
            soma += altura;
            if(idade<16){
                total += 1;
                nomes[i] = nome;
            }
        }

        double mediaAl = soma/n;
        double por = (total*100.0)/n;
        System.out.println("Media: "+ mediaAl);
        System.out.println("Porcentagem: " + por);
        
        for(int i=0; i<nomes.length; i++){
            if(nomes[i] != null){
                System.out.println(nomes[i]);
            
            }
        }
                                                                         
        sc.close();
        
    }
    
}
