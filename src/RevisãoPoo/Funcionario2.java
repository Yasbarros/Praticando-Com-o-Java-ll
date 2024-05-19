/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoPoo;


public class Funcionario2 {
    public String nome;
    public double salario;
    
    public Funcionario2(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void addAumento(int n){
        double aumento = salario+((n/100)*salario);
        System.out.println("O valor do salario com aumento de "+n+"%: "+aumento);
    }
    public double ganhoAnual(){
        return salario*12;
    }
    
    public String exibeDados(){
        return "\nNome: "+nome+"\nSalario: "+salario;
    }
}
