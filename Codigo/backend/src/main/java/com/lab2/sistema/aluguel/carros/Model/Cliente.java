package com.lab2.sistema.aluguel.carros.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuarios")
public class Cliente{
    @Id
    private Long id;
    private Usuario usuario;

    public void realizarPedido(Pedido pedido){

    }

    public void cancelarPedido(Pedido pedido){

    }

    public voi modificarPedido(Pedido pedido){

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Usuario getUsuario(){
        return usuario;
    }

}