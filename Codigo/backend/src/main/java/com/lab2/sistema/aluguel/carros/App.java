package com.lab2.sistema.aluguel.carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }

    //    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMappings(CorsRegistry registry) {
//                registry.addMapping("/**").allowedOrigins("http://localhost:5173"); --> Atulizar para o endereço do front
//            }
//        };
//    }

}
