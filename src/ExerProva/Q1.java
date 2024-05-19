/*
 Faça um algoritmo que preencha uma matriz 5x5 de inteiros e escreva:
 a) a soma dos números ímpares fornecidos;
 b) a soma de cada uma das 5 colunas;
 c) a soma de cada uma das 5 linhas. 

 */
package ExerProva;

import java.util.Random;

/**
 *
 * @author User
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random ram = new Random();
        int [][] matriz = new int [3][3];
        
        int somaImp = 0;
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j] = ram.nextInt(4);
                if(matriz[i][j]%2 !=0){
                    somaImp += matriz[i][j];
                }
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        int somacoluna1 =0;
        int somacoluna2 =0;
        int somacoluna3 =0;
        int somalinha1 = 0;
        int somalinha2 = 0;
        int somalinha3 = 0;
        
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<1;j++){
                somacoluna1 += matriz[i][j];
            }
            for(int j=1;j<2;j++){
                somacoluna2 += matriz[i][j];
            }
            for(int j=2;j<3;j++){
                somacoluna3 += matriz[i][j];
            }
            for(int j=0;j<1;j++){
                somalinha1 += matriz[j][i];
            }
            for(int j=1;j<2;j++){
                somalinha2 += matriz[j][i];
            }
            for(int j=2;j<3;j++){
                somalinha3 += matriz[j][i];
            }
        }
        
        System.out.println("a soma da colunas1: "+somacoluna1);
        System.out.println("a soma da colunas2: "+somacoluna2);
        System.out.println("a soma da colunas3: "+somacoluna3);
        System.out.println("a soma da linha1: "+somalinha1);
        System.out.println("a soma da linha2: "+somalinha2);
        System.out.println("a soma da linha3: "+somalinha3);
        System.out.println("a soma dos impares: "+somaImp);
    }
    
}
