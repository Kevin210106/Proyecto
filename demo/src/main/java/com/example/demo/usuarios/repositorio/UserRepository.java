package com.example.demo.usuarios.repositorio;

import com.example.demo.usuarios.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.UUID;
 
@Repository
public interface UserRepository extends JpaRepository<Usuario, UUID> {

    // Método personalizado para buscar por nombre de usuario (útil para el Login)
    Usuario findByUsername(String username);

    // Método para verificar si un email ya existe
    boolean existsByEmail(String email);
}