/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Caminhao extends Veiculo{
    
    int numeroEixos;
    
    public Caminhao(String marca, String capacidadeCarga, int numeroEixos) {
        super(marca, capacidadeCarga);
        
        this.numeroEixos = numeroEixos;
    }
    
    @Override
    public void exibirInfo(){
        System.out.println("------Caminhao------");
        System.out.println("Marca: " + this.marca);
        System.out.println("Capacidade de Carga: " + this.capacidadeCarga);
        System.out.println("Numero de eixos: " + this.numeroEixos + " eixos");
    }
    
}
