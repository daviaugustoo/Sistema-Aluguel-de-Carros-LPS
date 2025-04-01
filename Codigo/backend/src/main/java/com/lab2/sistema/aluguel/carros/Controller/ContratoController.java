package com.lab2.sistema.aluguel.carros.Controller;

import com.lab2.sistema.aluguel.carros.model.Contrato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contrato")
public class ContratoController {

    @Autowired
    private ContratoService contratoService;

    @GetMapping
    public List<Contrato> getContratos() {
        return contratoService.getContratos();
    }

    @GetMapping("/{id}")
    public Contrato getContrato(@PathVariable Long id) {
        return contratoService.getContrato(id);
    }

    @PostMapping
    public Contrato addContrato(@RequestBody Contrato contrato) {
        return contratoService.addContrato(contrato);
    }

    @PutMapping("/{id}")
    public Contrato updateContrato(@PathVariable Long id, @RequestBody Contrato contrato) {
        return contratoService.updateContrato(id, contrato);
    }

    @DeleteMapping("/{id}")
    public void deleteContrato(@PathVariable Long id) {
        contratoService.deleteContrato(id);
    }
}