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
public class Conta {
    public String conta;
    public String cliente;
    public float saldo;

    public Conta(String conta, String cliente, float saldo) {
        this.conta = conta;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    public void deposito(float qtd){
        saldo += qtd;
    }
    public float saque(float qtd){
        if(saldo >0){
            saldo-= qtd; 
            return 0;
        }else{
            System.err.println("Vc não tem saldo suficiente.");  
            return 1;
        }
        
    }

    //relatorio:
    @Override
    public String toString() {
        return super.toString(); 
    }
    
    
    
}
