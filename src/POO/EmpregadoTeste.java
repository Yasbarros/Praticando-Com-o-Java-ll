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
public class EmpregadoTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado um = new Empregado("Fabio", "Solza", 1500);
        Empregado dois = new Empregado("Marcelo", "Santos", 2000);
        
        
        um.aumento(10);
        dois.aumento(10);
        um.getSalario();
        dois.getSalario();
    }
    
}
