/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Livro extends ItemBiblioteca{
    
    int numPaginas;
    
    public Livro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        
        this.numPaginas = numPaginas;
    }
    
    @Override
    public void exibirDetalhes(){
    System.out.println("Titulo: " + this.titulo);
    System.out.println("Autor: " + this.autor);
    System.out.println("Numero de paginas: " + this.numPaginas);
}
    
}
