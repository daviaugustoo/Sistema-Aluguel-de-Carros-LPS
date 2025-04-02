package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Agente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgenteService {

    private List<Agente> agentes = new ArrayList<>();

    public List<Agente> getAgentes() {
        return agentes;
    }

    public Agente getAgente(Long id) {
        return agentes.stream().filter(agente -> agente.getId().equals(id)).findFirst().orElse(null);
    }

    public Agente addAgente(Agente agente) {
        agentes.add(agente);
        return agente;
    }

    public Agente updateAgente(Long id, Agente updatedAgente) {
        Agente existingAgente = getAgente(id);
        if (existingAgente != null) {
            agentes.remove(existingAgente);
            updatedAgente.setId(id);
            agentes.add(updatedAgente);
        }
        return updatedAgente;
    }

    public void deleteAgente(Long id) {
        agentes.removeIf(agente -> agente.getId().equals(id));
    }
}
