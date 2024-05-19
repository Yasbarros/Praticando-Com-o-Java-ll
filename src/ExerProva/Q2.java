/*
 Crie em Java uma matriz 3x5 de inteiros, preencha a matriz e depois:
a) Informe se a matriz possui elementos repetidos;
b) A quantidade de números pares;
c) A quantidade de números ímpares 
 */
package ExerProva;

import java.util.Random;

/**
 *
 * @author User
 */
public class Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ram = new Random();
        int [][] matriz = new int [3][3];
        
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = ram.nextInt(4);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if(matriz[i][j] == matriz[i][j-1]){
                    System.out.println("numero que se repete: "+matriz[i][j]);
                }
            }
        }
    }
    
}
