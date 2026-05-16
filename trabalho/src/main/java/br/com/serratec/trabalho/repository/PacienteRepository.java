package br.com.serratec.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.trabalho.model.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}
