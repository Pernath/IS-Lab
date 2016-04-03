-- Autor: Carlos Gerardo Acosta Hernández
-- Descripción: SQL Script para la creación de las tablas de la base de datos

-- TABLAS:
-- Tabla de telefonos a referenciar por el atributo correspondiente de usuarios
/**
CREATE TABLE TELEFONO (
id INTEGER PRIMARY KEY,
numero VARCHAR(15) UNIQUE NOT NULL 
);

-- Tabla de tipos de sangre a referenciar por el atributo correspondiente de usuarios
CREATE TABLE TIPOS (
id INTEGER PRIMARY KEY,
tiposangre VARCHAR(3) NOT NULL UNIQUE 
);


-- Tabla de usuario
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

*/
INSERT INTO TELEFONO values(1,'56450301');
INSERT INTO TIPOS values(1,'+O');
INSERT INTO USUARIO values(1,'carlos','acosta','hernandez','email@host.com', '1995-08-31','contraseña',1,1);
UPDATE USUARIO set contrasenia = 'nop' where id = 1;





