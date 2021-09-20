create database db_escola;

use db_escola;

create table tb_estudantes(
	id bigint (5) auto_increment not null,
	nome varchar (30) not null,
	serie bigint (1) not null,
	nota decimal (1,1) not null,
    idade bigint (2) not null,
	
    primary key(id)

);

select * from tb_estudantes;

insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 4, 7, 10);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Luana", 3, 8, 11);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Felipe", 4, 5, 10);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 4, 3, 10);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 5, 10, 9);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 5, 9, 10);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 3, 6, 10);
insert into tb_estudantes(id, nome, serie, nota, idade) values ("Andressa", 3, 5, 11);