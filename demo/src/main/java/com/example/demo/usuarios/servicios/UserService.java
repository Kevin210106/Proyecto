package com.example.demo.usuarios.servicios;

import com.example.demo.usuarios.entidades.Usuario;
import com.example.demo.usuarios.repositorio.UserRepository;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private UserRepository userRepository;

    @Transactional
    public void sign(Usuario user){
        userRepository.save(user);
    }
}


