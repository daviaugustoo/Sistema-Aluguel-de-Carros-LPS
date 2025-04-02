package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "contratos")
public class Contrato{
    @Id
    private Long id;
    private Pedido pedido;
    private Date Dateinicio;
    private Date DateFim;
    private Agente agente;
    private double valor;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Pedido getPedido(){
        return pedido;
    }

    public void setPedido(Pedido pedido){
        this.pedido = pedido;
    }

    public Date getDateinicio(){
        return Dateinicio;
    }

    public void setDateinicio(Date Dateinicio){
        this.Dateinicio = Dateinicio;
    }

    public Date getDateFim(){
        return DateFim;
    }   

    public void setDateFim(Date DateFim){
        this.DateFim = DateFim;
    }

    public Agente getAgente(){
        return agente;
    }

    public void setAgente(Agente agente){
        this.agente = agente;
    }

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }
}