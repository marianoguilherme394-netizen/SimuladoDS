/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Teste {
    public void main (String [] args){
        Pagamento p1 = new Pagamento(580.00, "Pendente");
        p1.processarPagamento();
        p1.exibirStatus();
        
        PagamentoCartao pc1 = new PagamentoCartao(580.00, "Concluido", "#### #### #### ####");
        pc1.processarPagamento();
        pc1.exibirStatus();
    }
    
}
