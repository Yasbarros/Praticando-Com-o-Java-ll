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
public class Fatura {
    public String numero;
    public String descricao;
    public int quantidade;
    public double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public double totalFatura(){
        if(preco >0){
            double valor = quantidade * preco;
            if(valor > 0){
                return valor;
            }
            return 0;
        }
        return 0.0;
    }
}
