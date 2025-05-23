package net.youssfi.hospitalapp.repository;

import net.youssfi.hospitalapp.entites.Patient;
import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

}
