package pe.bss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.bss.model.Persona;

public interface IPersonaDAO extends JpaRepository<Persona, Integer>{

}
