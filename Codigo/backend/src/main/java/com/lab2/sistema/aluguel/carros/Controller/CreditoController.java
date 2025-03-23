package com.lab2.sistema.aluguel.carros.Controller;

import com.lab2.sistema.aluguel.carros.model.Credito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/credito")
public class CreditoController {

    @Autowired
    private CreditoService creditoService;

    @GetMapping
    public List<Credito> getCreditos() {
        return creditoService.getCreditos();
    }

    @GetMapping("/{id}")
    public Credito getCredito(@PathVariable Long id) {
        return creditoService.getCredito(id);
    }

    @PostMapping
    public Credito addCredito(@RequestBody Credito credito) {
        return creditoService.addCredito(credito);
    }

    @PutMapping("/{id}")
    public Credito updateCredito(@PathVariable Long id, @RequestBody Credito credito) {
        return creditoService.updateCredito(id, credito);
    }

    @DeleteMapping("/{id}")
    public void deleteCredito(@PathVariable Long id) {
        creditoService.deleteCredito(id);
    }
}