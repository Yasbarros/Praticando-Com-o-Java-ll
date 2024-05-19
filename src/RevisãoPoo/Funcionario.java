/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisãoPoo;

/**
 *
 * @author User
 */
public class Funcionario {
    private Integer id;
    private String nome;
    private Double salario; 
    
    public Funcionario(){
        
    }
    
    public Funcionario(Integer id, String nome, Double salario){
        super();
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    public void novoSalario(double por){
        salario += (salario*por/100);
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", salario=" + salario + '}';
    }
    
    
}

