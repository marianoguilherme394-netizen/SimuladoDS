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
        Notificacao n1 = new Notificacao("Isabella Almeida", "Sua memoria do google esta cheia, libere armazenamento.");
        n1.enviar();
        
        Email e1 = new Email("Isabella Almeida", "Sua mercadoria ja esta pronto para ser retirada, busque no local marcado ate as 14:00.");
        e1.enviar();
        
        SMS s1 = new SMS("Isabella Almeida", "Às vezes, a gente só precisa de um café, um momento de silêncio e a lembrança de que cada pequeno passo também é progresso. Que o seu dia seja leve e cheio de boas surpresas!");
        s1.enviar();
    }
    
}
