package com.formacion.microservicios.app.services;


import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formacion.microservicios.app.usuarios.models.repository.AlumnoRepository;
import com.formacion.microservicios.commons.alumnos.models.entity.Alumno;
import com.formacion.microservicios.commons.services.CommonServiceimpl;

@Service
public class AlumnoServiceimpl extends CommonServiceimpl<Alumno, AlumnoRepository> implements AlumnoService {

	@Override
	@Transactional(readOnly = true)
	public List<Alumno> findByNombreOrApellido(String term) {
		
		return repository.findByNombreOrApellido(term);
	}
	
	
	

}
