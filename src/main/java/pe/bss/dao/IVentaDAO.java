package pe.bss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.bss.model.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
