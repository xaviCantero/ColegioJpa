--drop database if exists colegio2;
--create database colegio2;
use colegio2;
drop table if exists alumnos;
drop table if exists cursos;
create table cursos(
    id int auto_increment primary key,
    titulo varchar(20) not null,
    profesor varchar(30) not null,
    dia enum('LUNES','MARTES','MIERCOLES','JUEVES','VIERNES'),
    turno enum('MAÑANA','TARDE','NOCHE')
);
create table alumnos(
    id int auto_increment primary key,
    nombre varchar(25) not null,
    apellido varchar(25) not null,
    edad int,
    idCurso int not null
);
alter table alumnos
    add constraint FK_alumnos_idCurso
    foreign key(idCurso)
references cursos(id);

select * from alumnos;
select * from cursos;



