package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Automovel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovelService {

    private List<Automovel> automoveis = new ArrayList<>();

    public List<Automovel> findAll() {
        return automoveis;
    }

    public Automovel findById(Long id) {
        return automoveis.stream()
                .filter(automovel -> automovel.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public Automovel save(Automovel automovel) {
        automoveis.add(automovel);
        return automovel;
    }

    public Automovel update(Long id, Automovel updatedAutomovel) {
        Automovel existingAutomovel = findById(id);
        if (existingAutomovel != null) {
            automoveis.remove(existingAutomovel);
            updatedAutomovel.setId(id);
            automoveis.add(updatedAutomovel);
        }
        return updatedAutomovel;
    }

    public void delete(Long id) {
        automoveis.removeIf(automovel -> automovel.getId().equals(id));
    }
}
