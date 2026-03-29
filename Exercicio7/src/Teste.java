/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Teste {
   public static void main (String [] args){
       Conta c1 = new Conta(5000.00);
       c1.sacar(2500.00);
       c1.depositar(2500.00);
       
       ContaCorrente cc1 = new ContaCorrente(5000.00, 5000.00);
       cc1.sacar(3000);
       cc1.depositar(1000.00);
   }
    
}
