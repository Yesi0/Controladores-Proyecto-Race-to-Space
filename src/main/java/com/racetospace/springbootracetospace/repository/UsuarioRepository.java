package com.racetospace.springbootracetospace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.racetospace.springbootracetospace.model.Usuario;

//@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    //Encontrar el usuario por username
    Usuario findUserByUsername(String username);
}
