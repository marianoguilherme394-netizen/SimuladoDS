/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Teste {
    public static void main (String [] args){
        Veiculo v1 = new Veiculo("Toyota" , "Varia entre 1000 kg a 1010kg");
        v1.exibirInfo();
        
        Caminhao c1 = new Caminhao("Volvo" , "Varia entre 20 tonelas a 30 toneladas", 3);
        c1.exibirInfo();
    }
    
}
