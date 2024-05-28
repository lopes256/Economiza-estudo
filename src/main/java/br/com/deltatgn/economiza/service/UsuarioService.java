package br.com.deltatgn.economiza.service;

import br.com.deltatgn.economiza.persistence.model.Usuario;
import br.com.deltatgn.economiza.persistence.repository.UsuarioRepository;
import java.util.List;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jlopes
 */
@Service
@Log4j2
public class UsuarioService {
    
    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }
    
    public List<Usuario> listaUsuario() {
        List<Usuario> lista = repository.findAll();
        return lista;
    }
    
}
