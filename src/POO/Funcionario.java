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
public class Funcionario {
    public double salario;
    public String nome;
    public String cargo;
    public String setor;

    public Funcionario(double salario, String nome, String cargo, String setor) {
        this.salario = salario;
        this.nome = nome;
        this.cargo = cargo;
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    
    public String exibeDados(){
        return "Nome: " +nome  +"\nSalario: "+salario+"\nCargo: "+cargo+"\nSetor: "+setor;
    }
}
