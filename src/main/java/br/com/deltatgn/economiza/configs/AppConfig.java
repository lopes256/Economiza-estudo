package br.com.deltatgn.economiza.configs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author jlopes
 */
@Configuration
public class AppConfig {
    
    
    
    @Bean
    public CommandLineRunner executar() {
        return args -> {
            System.out.println("Iniciando!!!");
        };
    }
}
