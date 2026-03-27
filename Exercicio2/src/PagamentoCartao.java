/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class PagamentoCartao extends Pagamento{
    
    String numeroCartao;
    
    public PagamentoCartao(double valor, String status, String numeroCartao) {
        super(valor, status);
        
        this.numeroCartao = numeroCartao;
    }
    
    @Override
    public void processarPagamento(){
        System.out.println("------------------");
        System.out.println("Voce realizou o pagamento de R$" + this.valor + " com um cartão debito de numero " + this.numeroCartao);
    }
    
    @Override
    public void exibirStatus(){
        System.out.println("Seu Status de pagamento e: " + this.status);
    }
    
}
