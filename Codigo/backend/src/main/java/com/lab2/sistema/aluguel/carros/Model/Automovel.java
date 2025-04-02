package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "automoveis")
public class Automovel {
    @Id
    private Long id;
    private String matricula;
    private int ano;
    private String marca;
    private String modelo;
    private String placa;
    private String proprietario;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getMatricula(){
        return matricula;
    }   

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }   

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPlaca(){
        return placa;
    }   

    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getProprietario(){
        return proprietario;
    }   

    public void setProprietario(String proprietario){
        this.proprietario = proprietario;
    }
}