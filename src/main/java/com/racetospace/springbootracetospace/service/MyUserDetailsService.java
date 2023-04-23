package com.racetospace.springbootracetospace.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.racetospace.springbootracetospace.model.Usuario;
import com.racetospace.springbootracetospace.model.UsuarioDTO;
import com.racetospace.springbootracetospace.repository.UsuarioRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

    //Inyección de dependencias que hacemos para poder acceder a los métodos del repository desde esta clase
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Método para buscar el usuario por username, haciendo el llamdo al repositorio
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findUserByUsername(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
        return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getPassword(), new ArrayList<>());
    }
    
    //Método para crear nuevo usuario 
    public Usuario createUser(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setUsername(usuarioDTO.getUsername());
        usuario.setPassword(usuarioDTO.getPassword());
        return usuarioRepository.save(usuario);
    }

}
