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
public class Estudante {
    private String nome;
    private String email;

    
    public Estudante(String nome, String email){
        this.email = email;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nome + ", " + email;
    }
    
    
}
