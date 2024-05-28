package br.com.deltatgn.economiza.rest;

import br.com.deltatgn.economiza.persistence.model.Usuario;
import br.com.deltatgn.economiza.service.UsuarioService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jlopes
 */
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @Autowired
    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping
    public ResponseEntity<List<Usuario>> listaUsuario() {
        List<Usuario> lista = usuarioService.listaUsuario();
        return ResponseEntity.ok(lista);
    }

}
