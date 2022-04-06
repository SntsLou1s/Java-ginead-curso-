package modelos;

import java.util.*;

public class Amigo 
{
    //Atributos da classe
    String nome, telefone;
    int idade;

    //Métodos de acesso
    public String getNome() 
    { return nome; }
    public void setNome(String nome) 
    { this.nome = nome; }

    public String getTelefone() 
    { return telefone; }
    public void setTelefone(String telefone) 
    { this.telefone = telefone; }
    
    public int getIdade() 
    { return idade; }
    public void setIdade(int idade) 
    { this.idade = idade; }

    //Método Construtot
    public Amigo(String nome, String telefone, int idade) 
    {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }

    //Operação
    public void imprimirDados()
    {
        String dados = "NOME: " + this.nome +
            "\nIDADE: " + this.idade +
            "\nTELEFONE: " + this.telefone + 
            "\nDATA: " + new Date();
        System.out.println(dados);
    }
    
    //Main interno
    public static void main(String[] args) 
    {
        Amigo amigo = new Amigo("Louis", "4002-8922", 17);
        amigo.imprimirDados();
    }
}