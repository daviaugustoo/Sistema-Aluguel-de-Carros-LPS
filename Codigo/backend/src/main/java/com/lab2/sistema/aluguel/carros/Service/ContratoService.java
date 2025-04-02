package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Contrato;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContratoService {

    private List<Contrato> contratos = new ArrayList<>();

    public List<Contrato> getContratos() {
        return contratos;
    }

    public Contrato getContrato(Long id) {
        return contratos.stream()
                .filter(contrato -> contrato.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Contrato addContrato(Contrato contrato) {
        contratos.add(contrato);
        return contrato;
    }

    public Contrato updateContrato(Long id, Contrato updatedContrato) {
        Contrato existingContrato = getContrato(id);
        if (existingContrato != null) {
            contratos.remove(existingContrato);
            updatedContrato.setId(id);
            contratos.add(updatedContrato);
        }
        return updatedContrato;
    }

    public void deleteContrato(Long id) {
        contratos.removeIf(contrato -> contrato.getId().equals(id));
    }
}
