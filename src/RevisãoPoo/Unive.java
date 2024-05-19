/*
Uma classe chamada Universidade que terá como atributo um nome e terá um
método para informar o seu nome.
• Relacionar a classe Pessoa para com a classe Universidade. Cada pessoa poderá
ser associada a uma Universidade.
• A classe Pessoa, por sua vez, terá um método que dirá seu nome e em que
universidade trabalha.
• Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
• Criar dois objetos de Universidade, associando um para Einstein e outro para
Newton.
– Einstein trabalhou como professor de física em Princeton (Nova Jersey -
Estados Unidos da América).
– Newton trabalhou como professor de matemática em Cambridge
(Inglaterra).
 */
package RevisãoPoo;


 public class Unive {
    public String nome;
    public Departamento departamento;
    
    public Unive(String nome){
        this.nome = nome;
    }
    
    public String informaNome(){
        return this.nome;
    }
}
