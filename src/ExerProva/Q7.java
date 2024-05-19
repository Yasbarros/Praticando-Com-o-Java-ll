/*
 • Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
• Criar dois objetos de Universidade, associando um para Einstein e outro para
Newton.
– Einstein trabalhou como professor de física em Princeton (Nova Jersey -
Estados Unidos da América).
– Newton trabalhou como professor de matemática em Cambridge
(Inglaterra).
 */
package ExerProva;
import RevisãoPoo.Pessoa2;
import RevisãoPoo.Unive;
/**
 *
 * @author User
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Unive uniE = new Unive("Princeton");
        Unive uniN = new Unive("Cambridge");
        
        Pessoa2 p1 = new Pessoa2("Albert Einstein","14/3/1879",uniE);
        Pessoa2 p2 = new Pessoa2("Newton","4/1/1643",uniN);
        
        
        System.out.println(p1.dados());
        System.out.println(p2.dados());
    }
    
}

