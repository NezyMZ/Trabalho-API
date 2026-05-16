package br.com.serratec.trabalho.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.serratec.trabalho.model.Medico;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

}
