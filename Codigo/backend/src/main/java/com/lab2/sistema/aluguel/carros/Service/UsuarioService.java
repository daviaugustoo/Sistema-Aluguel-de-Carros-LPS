package com.lab2.sistema.aluguel.carros.Service;

import com.lab2.sistema.aluguel.carros.Model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    private List<Usuario> usuarios = new ArrayList<>();

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public Usuario getUsuario(Long id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void updateUsuario(Long id, Usuario updatedUsuario) {
        Usuario existingUsuario = getUsuario(id);
        if (existingUsuario != null) {
            usuarios.remove(existingUsuario);
            updatedUsuario.setId(id);
            usuarios.add(updatedUsuario);
        }
    }

    public void deleteUsuario(Long id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}
