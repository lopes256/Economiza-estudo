package br.com.deltatgn.economiza.persistence.repository;

import br.com.deltatgn.economiza.persistence.model.Usuario;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jlopes
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    
}
