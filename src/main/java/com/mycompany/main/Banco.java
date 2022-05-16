/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

import java.util.List;

/**
 *
 * @author itor5
 */
public class Banco {
    
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
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
    
    public List<Conta> getContas() {
	return contas;
    }

    public void addConta(Conta conta){
        if(conta == null){
            throw new IllegalArgumentException("informe uma conta existente");
        }
        this.contas.add(conta);
    }
}
