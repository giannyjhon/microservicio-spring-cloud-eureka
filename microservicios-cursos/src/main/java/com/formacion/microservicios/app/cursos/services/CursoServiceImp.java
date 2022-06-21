package com.formacion.microservicios.app.cursos.services;


import org.springframework.stereotype.Service;

import com.formacion.microservicios.app.cursos.models.entity.Curso;
import com.formacion.microservicios.app.cursos.models.repository.CursoRepository;
import com.formacion.microservicios.commons.services.CommonServiceimpl;

@Service
public class CursoServiceImp extends CommonServiceimpl<Curso, CursoRepository> implements CursoService {

	

}
