/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Computador extends Equipamento{
    String Processador;
    
    public Computador(String nome, String modelo, String Processador) {
        super(nome, modelo);
        
        this.Processador = Processador;
    }
    
    @Override
    public void exibirDados(){
    System.out.println("O equipamento e um " + this.nome);
    System.out.println("O modelo do Computador e: " + this.modelo);
    System.out.println("O Processador do Computador e: " + this.Processador);
}
    
    
}
