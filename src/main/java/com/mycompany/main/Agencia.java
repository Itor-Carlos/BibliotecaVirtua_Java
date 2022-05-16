/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author itor5
 */
public class Agencia {
    
    private String name;
    private String numeroIdentificador;

    public Agencia(String name, String numeroIdentificador) {
        this.name = name;
        this.numeroIdentificador = numeroIdentificador;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        if(name.equals("") || name.length() <= 0){
            throw new IllegalAccessException("nome não pode ser nulo e deve conter mais de 3 caracteres");
        }
        this.name = name;
    }

    public String getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public String informacoesAgencia() {
        return "Agencia{" + "name=" + name + ", numeroIdentificador=" + numeroIdentificador + '}';
    }

    
}
