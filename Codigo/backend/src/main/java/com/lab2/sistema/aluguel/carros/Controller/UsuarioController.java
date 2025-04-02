package com.lab2.sistema.aluguel.carros.Controller;

import com.lab2.sistema.aluguel.carros.Model.Usuario;
import com.lab2.sistema.aluguel.carros.Service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        return usuarioService.getUsuario(id);
    }

    @PostMapping
    public void addUsuario(@RequestBody Usuario usuario){
        usuarioService.addUsuario(usuario);
    }

    @PutMapping("/{id}")
    public void updateUsuario(@RequestBody Usuario usuario, @PathVariable Long id){
        usuarioService.updateUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deleteUsuario(@PathVariable Long id){
        usuarioService.deleteUsuario(id);
    }
}