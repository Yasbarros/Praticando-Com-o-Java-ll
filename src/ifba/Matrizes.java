/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba;

import java.util.Scanner;

public class Matrizes {


    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero inteiro:");
        int n = sc.nextInt();
        System.out.println("Digite um numero inteiro:");
        int m = sc.nextInt();
        int [][] matriz = new int[m][n];
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
               matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Digite um numero para encontrar: ");
        int num = sc.nextInt();
        
        for(int i=0; i<matriz.length;i++){
            for(int j=0; j<matriz[i].length;j++){
               if(matriz[i][j] == num){
                   System.out.println("Posição: " + i+","+j);
                   if(j>0){
                       System.out.println("Direita: "+ matriz[i][j-1]);
                   }
                   if(i>0){
                       System.out.println("Cima: "+ matriz[i-1][j]);
                   }
                   if(j< matriz[i].length-1){
                       System.out.println("Direita: "+ matriz[i][j+1]);
                   }
                   if(i<(matriz.length-1)){
                       System.out.println("Baixo: "+ matriz[i+1][j]);
                   }
                   
                   
                   
                   
                   
                   
                   
               }
            }
        }
        
        sc.close();
    }
    
}
