package com.lab2.sistema.aluguel.carros.Controller;

import com.lab2.sistema.aluguel.carros.model.Agente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/automovel")
public class AutomovelController {

    @Autowired
    private AutomovelService automovelService;

    @GetMapping
    public List<Automovel> findAll() {
        return automovelService.findAll();
    }

    @GetMapping("/{id}")
    public Automovel findById(@PathVariable Long id) {
        return automovelService.findById(id);
    }

    @PostMapping
    public Automovel save(@RequestBody Automovel automovel) {
        return automovelService.save(automovel);
    }

    @PutMapping("/{id}")
    public Automovel update(@PathVariable Long id, @RequestBody Automovel automovel) {
        return automovelService.update(id, automovel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        automovelService.delete(id);
    }
}