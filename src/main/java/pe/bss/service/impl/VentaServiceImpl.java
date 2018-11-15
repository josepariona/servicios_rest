package pe.bss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.bss.dao.IVentaDAO;
import pe.bss.model.Venta;
import pe.bss.service.IVentaService;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	private IVentaDAO dao;

	@Transactional
	@Override
	public Venta registrar(Venta t) {
		t.getDetalleVenta().forEach(d -> d.setVenta(t));
		return dao.save(t);
	}

	@Override
	public Venta modificar(Venta t) {
		return dao.save(t);
	}

	@Override
	public void eliminar(int id) {
		dao.delete(id);
	}

	@Override
	public Venta listarId(int id) {
		return dao.findOne(id);
	}

	@Override
	public List<Venta> listar() {
		return dao.findAll();
	}
}
