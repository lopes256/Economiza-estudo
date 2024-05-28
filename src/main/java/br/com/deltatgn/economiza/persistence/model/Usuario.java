package br.com.deltatgn.economiza.persistence.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Index;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author jlopes
 */
@Entity
@Table(name = "usuario", indexes = {
    @Index(name = "idx_usuario", columnList = "login_usuario", unique = true)})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {

    private static final long serialVersionUID = 3266225725231126830L;

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "usuario_id", updatable = false, nullable = false)
    @ColumnDefault("random_uuid()")
    private UUID usuarioId;

    @Column(name = "login_usuario", length = 50)
    private String loginUsuario;

    @Column(name = "nome_usuario", length = 100, nullable = false)
    private String nomeUsuario;

    @Column(name = "senha", length = 60)
    private String senha;

}
