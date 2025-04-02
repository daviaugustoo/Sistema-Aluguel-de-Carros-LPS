package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Credito;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CreditoService {

    private List<Credito> creditos = new ArrayList<>();

    public List<Credito> getCreditos() {
        return creditos;
    }

    public Credito getCredito(Long id) {
        return creditos.stream()
                .filter(credito -> credito.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Credito addCredito(Credito credito) {
        creditos.add(credito);
        return credito;
    }

    public Credito updateCredito(Long id, Credito updatedCredito) {
        Credito existingCredito = getCredito(id);
        if (existingCredito != null) {
            creditos.remove(existingCredito);
            updatedCredito.setId(id);
            creditos.add(updatedCredito);
        }
        return updatedCredito;
    }

    public void deleteCredito(Long id) {
        creditos.removeIf(credito -> credito.getId() == id);
    }
}
