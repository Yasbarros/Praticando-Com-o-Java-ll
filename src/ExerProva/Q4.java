/*
 Fazer uma classe Ex1Primos para:
• Receber um inteiro N do usuário
• Testar se este inteiro é primo ou não e informar 
 */
package ExerProva;

import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        int cont = 0;
        boolean primo = true;
        
        if(n<=1){
            primo = false;
        }
        
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }

        if (primo) {
            System.out.println("O numero é primo!");
        } else {
            System.out.println("O numero não é primo");
        }
    }

}
