/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Pagamento {
    double valor;
    String status;
    
    public Pagamento(double valor, String status){
        this.valor = valor;
        this.status = status;
    }
    
    public void processarPagamento(){
        System.out.println("Voce tem que realizar o pagamento de R$" + this.valor);
    }
    
    public void exibirStatus(){
        System.out.println("Seu Status de pagamento e: " + this.status);
    }
    
    
    
}
