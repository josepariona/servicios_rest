package pe.bss.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.bss.model.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
