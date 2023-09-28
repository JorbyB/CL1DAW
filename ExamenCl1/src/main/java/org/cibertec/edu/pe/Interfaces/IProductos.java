package org.cibertec.edu.pe.Interfaces;

import org.cibertec.edu.pe.Modelo.Productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IProductos extends JpaRepository<Productos, String>{

}
