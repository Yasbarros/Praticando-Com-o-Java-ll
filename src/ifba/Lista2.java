/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifba;
import RevisãoPoo.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Lista2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();  
        List<Integer> id = new ArrayList<>();
        System.out.println("Digite um inteiro:");
        int n = sc.nextInt();
        /*int id [] = new int[n];*/
        
        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Id: ");
            Integer ids = sc.nextInt();
            //corrigir validação de id diferentes//
            /*while(existeId(list, ids)){
                System.out.println("Esse id ja existe. Tente de novo.");
                ids = sc.nextInt();
            }*/
            id.add(ids);
            System.out.println("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            Double salario = sc.nextDouble();
            
            Funcionario fun = new Funcionario(ids, nome,salario);
            list.add(fun);
  
        }
        
        System.out.println("Digite um id existente: ");
        int idEx = sc.nextInt();
        
        for(int i=0; i<list.size(); i++){
            if(idEx != list.get(i).getId()){
                System.out.println("Esse id não existe");
                break;           
            }else{ 
                System.out.println("Digite uma porcentagem: ");
                int por = sc.nextInt();
                int posi = id.indexOf(idEx);
                list.get(posi).novoSalario(por);
            }
        }
        
        for (Funcionario x : list) {
            System.out.println(x);
        }
            

        
        sc.close();
    }
    
    /*public static Boolean existeId( List<Funcionario> list, int id){
        Funcionario fun = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
        return fun!= null;
    }*/
    
}
