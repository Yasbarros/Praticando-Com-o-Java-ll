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
package ExerProva;

import RevisãoPoo.Aluno;
import com.sun.org.apache.xpath.internal.operations.Equals;
import java.util.ArrayList;
import java.util.Scanner;
public class Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);    
        
        
        
        while (true) {       
            Aluno aluno = new Aluno();
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.next();
            if(!nome.equals("fim")){
                System.out.println("Digite a nota 1 do aluno");
                int nota1 = sc.nextInt();
                System.out.println("Digite a nota 2 do aluno");
                int nota2 = sc.nextInt();
                aluno = new Aluno(nota1, nota2, nome);
                alunos.add(aluno);
            }else{
                break;
            }
        }
        int apro =0;
        int recu = 0;
        int repro = 0;
        
        double somaTurma =0;
        for(Aluno x: alunos){
            somaTurma += x.calculamedia();
            if(x.calculamedia()>7){
                apro++;
            }else if(x.calculamedia()>5){
                recu++;
            }else{
                repro++;    
            }
        }
        
        double mediaTurma = somaTurma/alunos.size();
        System.out.println("Media da turma: "+mediaTurma);
        System.out.println("Alunos Aprovados: " + apro);
        System.out.println("Alunos para Final: " + recu);
        System.out.println("Alunos Reprovados: " + repro);
        
        
        for(Aluno f: alunos){
            if(f.calculamedia()< mediaTurma){
                System.out.println("Nota abaixo da media: "+f.dados());
            }
        }
        
        
            
            
            
            
            
            
    }
    
}
