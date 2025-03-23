package com.lab2.sistema.aluguel.carros.Controller;

import com.lab2.sistema.aluguel.carros.model.Agente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agente")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @GetMapping
    public List<Agente> getAgentes() {
        return agenteService.getAgentes();
    }

    @GetMapping("/{id}")
    public Agente getAgente(@PathVariable Long id) {
        return agenteService.getAgente(id);
    }

    @PostMapping
    public Agente addAgente(@RequestBody Agente agente) {
        return agenteService.addAgente(agente);
    }

    @PutMapping("/{id}")
    public Agente updateAgente(@PathVariable Long id, @RequestBody Agente agente) {
        return agenteService.updateAgente(id, agente);
    }

    @DeleteMapping("/{id}")
    public void deleteAgente(@PathVariable Long id) {
        agenteService.deleteAgente(id);
    }
}