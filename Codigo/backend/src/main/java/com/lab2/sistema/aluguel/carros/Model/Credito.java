package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "creditos")
public class Credito{
    @Id
    private long id;
    private Agente banco;
    private Cliente cliente;
    private double valor;
    private int parcelas;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public Agente getBanco(){
        return banco;
    }

    public void setBanco(Agente banco){
        this.banco = banco;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public int getParcelas(){
        return parcelas;
    }

    public void setParcelas(int parcelas){
        this.parcelas = parcelas;
    }

}
