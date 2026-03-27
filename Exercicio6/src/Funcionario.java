/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Funcionario {
    
    String nome;
    Double salario;
    
    public Funcionario(String nome, Double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void exibirDados(){
        System.out.println("-----Funcionario-----");
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
    }
    
}
