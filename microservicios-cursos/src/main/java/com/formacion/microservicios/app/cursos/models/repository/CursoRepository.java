package com.formacion.microservicios.app.cursos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.formacion.microservicios.app.cursos.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
