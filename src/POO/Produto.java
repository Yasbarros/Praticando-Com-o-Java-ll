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
public class Produto {
    public int codigo;
    public String nome;
    public float preco;
    public int estoque;
    public int estoquemin;

    public Produto(int codigo, String nome, float preco, int estoque, int estoquemin) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.estoquemin = estoquemin;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public int getEstoquemin() {
        return estoquemin;
    }

    public void setEstoquemin(int estoquemin) {
        this.estoquemin = estoquemin;
    }
    
    
    public int getSituação(){
        if(estoque > estoquemin){
            return 0;
        }else{
            return 1;
        }
    }
    
    public void relatorio(){
        if(estoque<estoquemin){
            System.out.println("Necessita comprar novos produtos");
        }else if(estoque > 100){
            System.out.println("Estoque máximo permitido 100 ");
        }
    }
}
