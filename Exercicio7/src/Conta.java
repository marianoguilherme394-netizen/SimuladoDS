/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Conta {
    double saldo;
    
    public Conta(double saldo){
        this.saldo = saldo;
    }
    
    public void depositar(double valor){
       System.out.println("Voce realizou um deposito de R$" + valor);
    }
    
    public void sacar(double valor){
        System.out.println("------Conta-----");
        System.out.println("Voce realizou um saque de R$" + valor);
    }
}
