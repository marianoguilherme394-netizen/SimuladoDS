/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ContaCorrente extends Conta{
    
    double limite;
    
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor){
        System.out.println("------ContaCorrente-----");
        
        if(valor <= this.limite+this.saldo){
        System.out.println("Voce realizou um saque de R$" + valor);
    }
        else{
            System.out.println("Saque negado, limite atingido");
        }
    }
    
    @Override
    public void depositar(double valor){
        if(valor <= this.saldo){
        System.out.println("Voce realizou um deposito de R$" + valor);
    }
        else{
            System.out.println("Deposito negado, saldo insuficiente");
        }
    }
    
    
    
}
