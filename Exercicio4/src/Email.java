/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Email extends Notificacao{
    
    public Email(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    
    @Override
    public void enviar(){
        System.out.println("------Email------");
        System.out.println("Um Email foi enviado para " + this.destinatario + ": " + mensagem);
    }
}
