CREATE DATABASE administracion_alumno_curso;
USE administracion_alumno_curso;

CREATE TABLE alumnos
  ( 
     dni         SMALLINT NOT NULL PRIMARY KEY, 
     nombre      VARCHAR(100) NOT NULL, 
     apellido    VARCHAR(100) NOT NULL
  ); 
  
  CREATE TABLE cursos 
  ( 
     id        	 SMALLINT NOT NULL PRIMARY KEY, 
     nombre      VARCHAR(100) NOT NULL
  ); 
   CREATE TABLE administracion 
  ( 
     dniAlumno		SMALLINT NOT NULL ,
     idCurso 		SMALLINT NOT NULL 
  ); 
  ALTER TABLE administracion 
  ADD FOREIGN KEY (dniAlumno) REFERENCES alumnos (dni),
  ADD FOREIGN KEY (idCurso) REFERENCES cursos (id);
  
 -- SELECT * FROM administracion;
 -- SELECT * FROM alumnos;
 -- SELECT * FROM cursos;