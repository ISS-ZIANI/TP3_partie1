package net.youssfi.hospitalapp;

import net.youssfi.hospitalapp.entites.Patient;
import net.youssfi.hospitalapp.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class HospitalAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalAppApplication.class, args);

    }
    @Bean
    public CommandLineRunner start(PatientRepository patientRepository) {
        return args -> {
            Patient p1 = new Patient();
            p1.setNom("Youssfi");
            p1.setPrenom("John");
            p1.setScore(100);
            p1.setMalade(false);
            p1.setDateNaissance(new Date());
            Patient p2 = new Patient(null,"Yassine","Med", new Date(),1200,false );
            Patient p3 = Patient.builder()
                    .nom("Ihsan")
                    .prenom("ihsan")
                    .dateNaissance(new Date())
                    .malade(true)
                    .build();
            patientRepository.save(p1);
            patientRepository.save(p2);
            patientRepository.save(p3);

            List<Patient> patients = patientRepository.findAll();
            patients.forEach(p -> {
                System.out.println(p.toString());
            });
        };
    }

}
