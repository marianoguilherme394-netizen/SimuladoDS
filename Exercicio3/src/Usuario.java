/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Usuario {
    String login;
    String senha;
    String nivelAcesso;
    boolean ativo;
    
    public Usuario(String login,String senha,String nivelAcesso,boolean ativo){
        this.login = login;
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
        this.ativo = ativo;
    }
    
    public void logar(){
        System.out.println("Seu login e: " + this.login);
        System.out.println("Sua Senha e: " + this.senha);
    }
    
    public void autenticar(String senhaInformada){
        if(senhaInformada.equals(this.senha) && this.ativo == true){
            System.out.println("Verdadeiro");
        }
        else{
            System.out.println("Falso");
        }
    }
    
    public void desativar(){
        this.ativo =
                false;
        System.out.println("O usuario foi estava ativo? " + this.ativo);
    }
    
    public void MostrarNvDeAcesso(){
        System.out.println("Seu nivel de acesso e: " + this.nivelAcesso);
    }
}
