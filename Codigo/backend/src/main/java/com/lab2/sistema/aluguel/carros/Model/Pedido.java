package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "pedidos")
public class Pedido{
    @Id
    private long id;
    private Cliente cliente;
    private Automovel automovel;
    private String status;
    private Date datePedido;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }   

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Automovel getAutomovel(){
        return automovel;
    }

    public void setAutomovel(Automovel automovel){
        this.automovel = automovel;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public Date getDatePedido(){
        return datePedido;
    }

    public void setDatePedido(Date datePedido){
        this.datePedido = datePedido;
    }

}