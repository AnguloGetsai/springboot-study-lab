package com.course.application.controllers;

import com.course.application.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {


    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuario(){

        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario(
                1L,
                "Getsai",
                "Angulo",
                "20243ds167@utez.edu.mx",
                "7471315802",
                "OneTwoThree"
        );

        Usuario usuario1 = new Usuario(
                2L,
                "Mario",
                "Soto",
                "20243ds169@utez.edu.mx",
                "7472548965",
                "OneTwoThree"
        );

        Usuario usuario2 = new Usuario(
                3L,
                "George",
                "Cort",
                "20243ds175@utez.edu.mx",
                "7472589632",
                "OneTwoThree"
        );


        Usuario usuario3 = new Usuario(
                4L,
                "Maria",
                "scurt",
                "20243ds157@utez.edu.mx",
                "7476548521",
                "OneTwoThree"
        );

        usuarios.add(usuario);
        usuarios.add(usuario1);
        usuarios.add(usuario2);
        usuarios.add(usuario3);


        return usuarios;

    }
}
