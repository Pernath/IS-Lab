--Autor: Carlos Gerardo Acosta Hernández
--Descripción: SQL Script para la creación de las tablas de la base de datos

CREATE TABLE USUARIO (
id INTEGER PRIMARY KEY,
nombre VARCHAR(64) NOT NULL,
app VARCHAR(64) NOT NULL,
apm VARCHAR(64) NOT NULL,
correo VARCHAR(64) UNIQUE,
fecha_nac DATE NOT NULL, 
contrasenia VARCHAR(16),
id_telefono INTEGER REFERENCES TELEFONO (id),
id_tiposangre INTEGER REFERENCES TIPOS (id) )
;

CREATE TABLE TELEFONO (
id INTEGER PRIMARY KEY,
numero VARCHAR(15) UNIQUE NOT NULL 
);

CREATE TABLE TIPOS (
id INTEGER PRIMARY KEY,
tiposangre VARCHAR(3) NOT NULL UNIQUE 
);




