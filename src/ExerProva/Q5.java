/*
 Fazer uma classe Ex2Sorteio para:
• Sortear um número de 0 a 1000 (dica: usar Math.random())
• Pedir um palpite ao usuário. Se ele errar, informar se o palpite é maior ou
menor do que o número sorteado.
• Pedir novos palpites até que o usuário acerte e, depois disso, mostrar em
quantas tentativas ele acertou. 
 */
package ExerProva;

import java.util.Random;
import java.util.Scanner;


public class Q5 {


    public static void main(String[] args) {
        Random ram = new Random();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Tente adicinhar um numero entre 0 a 10");
        int n = sc.nextInt();
        
        int numero = ram.nextInt(10);
        int i=1;
        do{
            if(n < numero){
                System.out.println("Voce errou :/");
                System.out.println("Voce chutou um numero menor");
            }else{
                System.out.println("Voce errou :/");
                System.out.println("Voce chutou um numero maior");
            }
            System.out.println("Tente novamente");
            n = sc.nextInt();
            i++;
        }while(n != numero);
        
        if(n == numero){
            System.out.println("Voce acertou!!");
            System.out.println("Tentativas: "+i);
            
        }
        
        
        
    }
    
}
