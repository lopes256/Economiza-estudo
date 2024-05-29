package br.com.deltatgn.economiza.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author jlopes
 */
@Configuration
public class AppConfig {
    
    private final String so = String.valueOf(System.getProperty("os.name"));
    private final String version = String.valueOf(System.getProperty("os.version"));

    @Value("${APPLICATION_AMBIENTE}")
    private String ambiente;
    
    @Value("${application.description}")
    private String projeto;

    @Bean
    public CommandLineRunner execulteAppConfig() {
        return args -> {
            System.out.println("=============================================================");
            System.out.println("Sistema Operacional: " + so);
            System.out.println("Versão: " + version);
            System.out.println("Projeto: " + projeto);
            System.out.println("Ambiente: " + ambiente);
            System.out.println("=============================================================");
        };
    }

}
