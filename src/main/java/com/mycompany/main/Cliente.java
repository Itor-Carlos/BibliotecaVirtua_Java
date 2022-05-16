/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author itor5
 */
public class Cliente {
    
    private String nome;
    private String cpf;
    private Integer idade;

    public Cliente(String nome, String cpf, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws IllegalAccessException {
        if(nome.equals("") || nome.length() <= 0){
            throw new IllegalAccessException("nome não pode ser nulo e deve conter mais de 3 caracteres");
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) throws IllegalAccessException {
        if(idade == null || idade <= 18){
            throw new IllegalAccessException("idade não pode ser nula ou menor de idade");
        }
    }
}
