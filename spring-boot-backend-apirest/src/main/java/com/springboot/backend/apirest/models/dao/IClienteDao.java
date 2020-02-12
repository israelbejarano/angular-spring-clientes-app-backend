package com.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.backend.apirest.models.entity.Cliente;
import com.springboot.backend.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

	// como solo tenemos la consulta de listado de regiones por cliente no creamos
	// un DAO para Region. si tuviesemos todo el CRUD deberia ir en su propio DAO
	@Query("from Region") // es Region y no regiones porque estamos usando entidades y no tablas
	public List<Region> findAllRegiones();

}
