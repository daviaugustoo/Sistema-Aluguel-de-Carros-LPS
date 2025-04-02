package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Usuario{
    @Id
    private Long id;
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    private String profissao;
    private String entidadeEmpregadora;
    private double rendimento;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public String getprofissao(){
        return profissao;
    }

    public void setProfissao(String profissao){
        this.profissao = profissao;
    }

    public String getEntidadeEmpregadora(){
        return entidadeEmpregadora;
    }

    public void setEntidadeEmpregadora(String entidadeEmpregadora){
        this.entidadeEmpregadora = entidadeEmpregadora;
    }

    public double getRendimento(){
        return rendimento;
    }

    public void setRendimento(double rendimento){
        this.rendimento = rendimento;
    }

}