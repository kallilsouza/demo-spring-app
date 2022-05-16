package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){
//        return args ->{
//            Student kallil = new Student(
//                    "Kallil Souza dos Santos",
//                    "kallil.s@academico.ifrn.edu.br",
//                    LocalDate.of(1997, Month.JANUARY, 24)
//            );
//
//            Student alan = new Student(
//                    "Alan Francisco Chagas Caiana",
//                    "alan@email.com",
//                    LocalDate.of(1999, Month.MAY, 23)
//            );
//
//            repository.saveAll(
//                    List.of(kallil, alan)
//            );
//        };
//    }
}
