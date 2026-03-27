/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Notificacao {
    String destinatario;
    String mensagem;
    
    public Notificacao(String destinatario, String mensagem){
        this.destinatario = destinatario;
        this.mensagem = mensagem;
    }
    
    public void enviar(){
        System.out.println("------Notificacao------");
        System.out.println("Enviar uma notficação para " + this.destinatario + ": " + this.mensagem);
    }
    
}
