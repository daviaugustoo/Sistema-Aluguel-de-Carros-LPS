package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public Cliente getCliente(Long id) {
        return clientes.stream()
                .filter(cliente -> cliente.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Cliente addCliente(Cliente cliente) {
        clientes.add(cliente);
        return cliente;
    }

    public Cliente updateCliente(Long id, Cliente updatedCliente) {
        Cliente existingCliente = getCliente(id);
        if (existingCliente != null) {
            clientes.remove(existingCliente);
            updatedCliente.setId(id);
            clientes.add(updatedCliente);
        }
        return updatedCliente;
    }

    public void deleteCliente(Long id) {
        clientes.removeIf(cliente -> cliente.getId().equals(id));
    }
}
