package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Pedido;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PedidoService {

    private List<Pedido> pedidos = new ArrayList<>();

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public Pedido getPedido(Long id) {
        return pedidos.stream()
                .filter(pedido -> pedido.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Pedido addPedido(Pedido pedido) {
        pedidos.add(pedido);
        return pedido;
    }

    public Pedido updatePedido(Long id, Pedido updatedPedido) {
        Pedido existingPedido = getPedido(id);
        if (existingPedido != null) {
            pedidos.remove(existingPedido);
            updatedPedido.setId(id);
            pedidos.add(updatedPedido);
        }
        return updatedPedido;
    }

    public void deletePedido(Long id) {
        pedidos.removeIf(pedido -> pedido.getId() == id);
    }
}
