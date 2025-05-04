package edu.learnig.api.controller;

import edu.learnig.api.model.Usuario;
import edu.learnig.api.reposotiry.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }
}
