package pe.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.bss.dao.IProductoDAO;
import pe.bss.model.Producto;
import pe.bss.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDAO dao;

	@Override
	public Producto registrar(Producto t) {
		return dao.save(t);
	}

	@Override
	public Producto modificar(Producto t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Producto listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Producto> listar() {
		return dao.findAll();
	}
}
