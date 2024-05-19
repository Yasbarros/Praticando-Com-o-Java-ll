/*
 ) Fazer uma classe Aluno que possua as seguintes características:
• dois atributos do tipo inteiro: primeira nota parcial (de 0 a 100) e Segunda
nota parcial (de 0 a 100)
• um atributo String representando o nome do aluno
• possua métodos para ler e escrever os atributos (ou uma construtora)
Fazer uma classe Controle que:
• pergunte ao usuário o nome e as duas notas parciais de um aluno. Caso o
nome entrado seja “fim” isso significa que o usuário não quer inserir mais
nenhum aluno, do contrário deve ser instanciado um objeto da classe Aluno e
armazenados os dados digitados.
Dicas: usar um objeto da classe ArrayList de Java para armazenar as
referências para os objetos instanciados). Usar o método equals da classe
String para verificar se o valor do nome entrado é igual a “fim”.
 Para encontrar a documentação destas classes:
http://java.sun.com/j2se/1.5.0/docs/api/
• Calcular, ao final da inserção de todos os alunos, a média da turma, quantos
alunos foram aprovados, quantos foram para a final e quantos foram
reprovados e mostrar os códigos de todos os alunos cujas notas ficaram abaixo
da média da turma. 

 */
package RevisãoPoo;


public class Aluno {
    int nota1;
    int nota2;
    String nome;
    
    
    public Aluno(){
    }
    
    public Aluno(int nota1, int nota2, String nome){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        
    }
    
    public double calculamedia(){
        double media  = (nota1+nota2)/2; 
        return media;
    }
    public String dados(){
        return "\nNome: "+nome+"\nNota1: "+nota1+"\nNota2: "+nota2;
    }
}
