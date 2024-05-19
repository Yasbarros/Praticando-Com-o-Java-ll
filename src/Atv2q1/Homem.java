/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atv2q1;

/**
 *
 * @author User
 */
public class Homem extends PessoaIMC{
    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultIMC() {
        double imc = calculaIMC();
        if (imc < 20.7) {
            return "Abaixo do peso ideal";
        } else if (imc < 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }

    
}
