package poo_exercicios;

import java.util.HashMap;

import classes.Livro;

public class  livros {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984", 347);
        Livro livro2 = new Livro("O capital" , 670);
        Livro livro3 = new Livro("o capital", 670);
        Livro livro4 = livro2;

        Livro []  livros = {livro1,livro2,livro3,livro4};

        System.out.println(livros[3].getNome()+ " é igual a: " + livros[1].getNome() + ": " + livros[3].equals( livros[1]));
        System.out.println(livros[0].getNome()+ " é igual a: "+ livros[1].getNome() + ": " + livros[0].equals( livros[1]));
        System.out.println(livros[1].getNome()+ " é igual a: "+ livros[3].getNome() + ": " + livros[1].equals( livros[3]));
   
        HashMap <String,Livro> livrosDict = new HashMap<>();
        livrosDict.put(livro1.getNome(),livro1);
        System.out.println(livrosDict.get("1984"));
    }
}
