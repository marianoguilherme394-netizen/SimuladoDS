/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Leao extends Animal{
    
    public Leao(String nome, int idade, String habitat) {
        super(nome, idade, habitat);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("Um leao ruge");
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("-----Leao-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Habitat: " + this.habitat);
    }
    
}
