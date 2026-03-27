/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Arara extends Animal{
    
    public Arara(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Uma Arara canta");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("-----Arara-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitat: " + this.habitat);
    }
    
}
