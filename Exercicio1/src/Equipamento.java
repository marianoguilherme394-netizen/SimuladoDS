/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Equipamento {
    String nome;
    String modelo;
    
    public Equipamento(String nome, String modelo){
        this.modelo = modelo;
        this.nome = nome;
    }
    
    public void exibirDados(){
        System.out.println("O nome do esquipamento e: " + this.nome);
        System.out.println("O modelo do esquipamento e: " + this.modelo);
    }
    
}
