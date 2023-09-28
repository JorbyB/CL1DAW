package org.cibertec.edu.pe.Service;

import java.util.List;
import java.util.Optional;
import org.cibertec.edu.pe.InterfacesService.IProductosService;
import org.cibertec.edu.pe.Interfaces.IProductos;
import org.cibertec.edu.pe.Modelo.Productos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoServices implements IProductosService {
	@Autowired
	private IProductos data;
	
	@Override
	public List<Productos> Listar() {
		return (List<Productos>)data.findAll();
		
	}

}
