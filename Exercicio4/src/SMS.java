/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SMS extends Notificacao{
    
    public SMS(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }
    
    @Override
    public void enviar(){
        System.out.println("------SMS------");
        System.out.println("Um SMS foi enviado para " + this.destinatario + ": " + mensagem);
    }
    
}
