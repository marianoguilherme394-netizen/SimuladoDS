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
        Usuario u1 = new Usuario("meulogin@gmail.com", "123455", "Admin", true);
        u1.logar();
        u1.autenticar("123455");
        u1.MostrarNvDeAcesso();
        u1.desativar();
    }
    
}
