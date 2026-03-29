/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Veiculo {
    String marca;
    String capacidadeCarga;
    
    public Veiculo(String marca, String capacidadeCarga){
        this.marca = marca;
        this.capacidadeCarga = capacidadeCarga;
    }
    
    public void exibirInfo(){
        System.out.println("------Veiculo------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga);
    }
    
}
