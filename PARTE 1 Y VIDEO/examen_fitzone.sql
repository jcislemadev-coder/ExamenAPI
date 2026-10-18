SELECT current_database();

CREATE TABLE socios(
	id_socio INT PRIMARY KEY,
	nombres VARCHAR(50) NOT NULL,
	apellidos VARCHAR(50) NOT NULL,
	edad INT NOT NULL,
	fecha_registro VARCHAR(10) NOT NULL,
	activo BOOLEAN NOT NULL
)

SELECT *FROM socios;

INSERT INTO socios(id_socio, nombres, apellidos, edad, fecha_registro, activo)
VALUES (123456789 , 'Jessica' , 'Cislema', 28 , '2026-11-15', true)


INSERT INTO socios(id_socio, nombres, apellidos, edad, fecha_registro, activo)
VALUES(234567890, 'Paola', 'Galarza', 25, '2026-02-14', false)

INSERT INTO socios(id_socio, nombres, apellidos, edad, fecha_registro, activo)
VALUES(345678901, 'Fernando', 'Quishpe', 20, '2026-01-01', true)

INSERT INTO socios(id_socio, nombres, apellidos, edad, fecha_registro, activo)
VALUES(445678901, 'Dennis', 'Jaird', 12, '2026-04-17', false);

INSERT INTO socios(id_socio, nombres, apellidos, edad, fecha_registro, activo)
VALUES(567890123, 'Carol', 'Arcentales', 14, '2026-08-01', false)


SELECT nombres, apellidos, edad
FROM socios
WHERE edad > 18 AND activo = true;

SELECT *FROM socios
WHERE fecha_registro> '2026-02-01';

SELECT *FROM socios
ORDER BY edad DESC;

ALTER TABLE socios
ADD COLUMN email VARCHAR(100);

UPDATE socios
SET email = 'jpcislemadev@gmail.com'
WHERE id_socio = '123456789';
)