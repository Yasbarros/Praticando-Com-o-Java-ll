/*
  Fazer um programa para receber um número do usuário e decompô-lo em
fatores primos. Os fatores primos devem ser armazenados em um array com o
tamanho exato (dica: primeiro determinar quantos são os fatores primos, depois
criar o array para armazená-los). 
 */
package ExerProva;

import com.sun.org.apache.xml.internal.serializer.utils.AttList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q6 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int n = sc.nextInt();
        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> fatores = new ArrayList<>();
        for(int j=1;j<=n;j++){
            int cont =0;
            for(int i=1;i<=j;i++){
                if(j==1){
                }else{
                    if(j%i==0){
                    cont++;
                    }
                }   
            }
            if(cont==2){
                primos.add(j);
            }
        }
        for (int i = 0; i < primos.size(); i++) {
            if(n%primos.get(i) ==0){
                fatores.add(primos.get(i));
            }
        }
        for(int x:fatores){
            System.out.println(x);
        }
        
        
        
    }
    
}
