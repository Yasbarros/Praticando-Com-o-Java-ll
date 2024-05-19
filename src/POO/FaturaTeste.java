/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author User
 */
public class FaturaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fatura fat = new Fatura();
        
        fat.setNumero("563982");
        fat.getNumero();
        fat.setQuantidade(5);
        fat.setPreco(12.50);
        
        System.out.println("Valor fatura: "+fat.totalFatura());
        
    }
    
}
