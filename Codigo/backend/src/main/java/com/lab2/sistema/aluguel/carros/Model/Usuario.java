package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class usuario{
    @Id
    private Long id;
    private string nome;
    private string cpf;
    private string rg;
    private string endereco;
    private string profissao;
    private string entidadeEmpregadora;
    private double rendimento;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public string getNome(){
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