/*
• Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá
ser associada a uma Universidade.
• A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que
universidade trabalha.
 */
package RevisãoPoo;

import RevisãoPoo.Unive;

public class Pessoa2 {
    String nome;
    String nascimento;
    Unive universidade;
    
    
    public Pessoa2(String nome, String nascimento, Unive universidade){
        this.nome = nome;
        this.nascimento = nascimento;
        this.universidade = universidade;
    }
   
    public String dados(){
        return "Nome:"+ nome + "\nUniversidade que trabalha:"+ universidade.informaNome()  ;
    }
}
